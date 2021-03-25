package org.ap6.segwaste.customview;

import java.util.List;
import org.ap6.segwaste.tflite.Classifier.Recognition;

public interface ResultsView {
    public void setResults(final List<Recognition> results);
}
