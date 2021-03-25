import os
import numpy as np

import tensorflow as tf
os.environ['CUDA_VISIBLE_DEVICES'] = '0'

# assert tf.__version__.startswith('2')
# assert tf.test.is_gpu_available()
# assert tf.test.is_built_with_cuda()

from tflite_model_maker import configs
from tflite_model_maker import ExportFormat
from tflite_model_maker import image_classifier
from tflite_model_maker import ImageClassifierDataLoader
from tflite_model_maker import model_spec

import matplotlib.pyplot as plt

# Tensorflow initialization
gpus = tf.config.experimental.list_physical_devices('GPU')
if gpus:
    try:
        # Currently, memory growth needs to be the same across GPUs
        for gpu in gpus:
            tf.config.experimental.set_memory_growth(gpu, True)
        logical_gpus = tf.config.experimental.list_logical_devices('GPU')
        print(len(gpus), "Physical GPUs,", len(logical_gpus), "Logical GPUs")
    except RuntimeError as e:
        # Memory growth must be set before GPUs have been initialized
        print(e)

# Initialize dataset
folder_name = r"trash_dataset_resized"
data = ImageClassifierDataLoader.from_folder(folder_name)

# Create train, validation, test splits
train_data, rest_data = data.split(0.7)
validation_data, test_data = rest_data.split(0.5)

# Plot 25 elements from dataset
plt.figure(figsize=(10,10))
for i, (image, label) in enumerate(data.gen_dataset().unbatch().take(25)):
  plt.subplot(5,5,i+1)
  plt.xticks([])
  plt.yticks([])
  plt.grid(False)
  plt.imshow(image.numpy(), cmap=plt.cm.gray)
  plt.xlabel(data.index_to_label[label.numpy()])
plt.savefig("dataset_sample.png")

# Create image classifier
with tf.device('/GPU:0'):
  model = image_classifier.create(train_data, validation_data=validation_data)

  # Evaluate model
  loss, accuracy = model.evaluate(test_data)

# A helper function that returns 'red'/'black' depending on if its two input parameter matches or not.
def get_label_color(val1, val2):
  if val1 == val2:
    return 'black'
  else:
    return 'red'

# Plot N test images and their predicted labels.
# If a prediction result is different from the label provided label in "test" dataset, we will highlight it in red color.
N = 50

plt.figure(figsize=(20, 20))
predicts = model.predict_top_k(test_data)
for i, (image, label) in enumerate(test_data.gen_dataset().unbatch().take(N)):
  ax = plt.subplot(10, 10, i+1)
  plt.xticks([])
  plt.yticks([])
  plt.grid(False)
  plt.imshow(image.numpy(), cmap=plt.cm.gray)

  predict_label = predicts[i][0][0]
  color = get_label_color(predict_label,
                          test_data.index_to_label[label.numpy()])
  ax.xaxis.label.set_color(color)
  plt.xlabel('Predicted: %s' % predict_label)
plt.savefig("model_results.png")

# Export tensorflow lite model
model.export(export_dir=r'.')

# Export labels
labels = [folder for folder in os.listdir(folder_name) if not folder.startswith('.')]

# 2) Then, we output the contents of each folder name to a file.
with open('labels.txt', 'w') as file:
  for label in labels:
    file.write(label)
    file.write('\n')