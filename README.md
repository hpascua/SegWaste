# SegWaste
Make the Change, Be the Change.

An innovation proposed by **AP6/2:**
- Destura, Stephen John
- Garcia, Justin Raphael
- Lagmay, Arnold Constantin
- Pascua, Harold Luis


 
## What is SegWaste?
As the Philippines is currently facing a garbage crisis due to the increasing rate of waste production, SegWaste aims to help society transition to a smart, educational, and convenient way of segregating waste.

SegWaste will be composed of four primary features:
- **WastEd (Waste Education):** Provides different articles and infographics to educate people on how to segregate properly.
- **WasteID:** An image recognition and object classification feature that will help classify different types of trash to help users segregate better.
- **WAYste:** A feature that connects users to various ways of managing waste, such as garbage collections conducted by MRFs (materials recovery facilities) and promotions by our partner establishments (e.g. no-plastic policies, discounts on bringing reusable containers).
- **Waste Tracker:** A feature that helps users track their monthly and yearly waste generation.

## Repository Guide
This repository consists of the following files and directories:
- **Prototype:** Contains our **Hi-Fi Prototype** created through **Adobe XD**. This directory also contains a **Prototype Guide** to aid in demonstrating how the different parts of the prototype work together.
- **SegWaste (Prototype Android App):** An **Android Studio** project directory for the coded version of our prototype.
- **WasteID (TensorFlow):** An **Android Studio** project directory that shows how the WasteID function may look like once the solution is fully implemented. It uses **TensorFlow** to detect objects in real time and classify them into different types of trash using a **custom-made classification model.** This application is based on [an official example by TensorFlow for image recognition applications](https://github.com/tensorflow/examples/tree/master/lite/codelabs/flower_classification).
- **Innovation Proposal.pdf:** A PDF document that contains our proposal for this project. This provides context to the issue we aim to solve, a market study on our possible user base, a proposed business model to maintain the operations of the solution, and a detailed explanation on how we would implement this solution.

## How to Compile and Execute the Android Studio Projects
Just install the dependencies by building the project's Gradle and run it like you would with any other Android Studio project! For the best experience, we recommend you run our applications through a physical Android device than through an emulator.
