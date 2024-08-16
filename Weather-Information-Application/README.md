# Weather Information App
## Overview
The Weather Information App is a simple JavaFX application that allows users to fetch and display weather information for a specified location. The app changes its background based on the time of day, using the BackgroundChanger class.

## Prerequisites
* Java Development Kit (JDK) 8 or higher
* JavaFX SDK
* An IDE such as IntelliJ IDEA or Visual Studio Code

## Setup Instructions
### 1. Clone the Repository
Clone the repository to your local machine using the following command:

```
git clone <repository-url>
```

### 2. Import the Project
Import the project into your IDE. If you are using Visual Studio Code, open the folder containing the project.

### 3. Add JavaFX Libraries
Ensure that the JavaFX libraries are added to your project. You can download the JavaFX SDK from here.

### 4. Configure VM Options
Configure the VM options to include the JavaFX modules. For example:

```
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
```

### 5. Run the Application
Run the App.java file to start the application.

## Usage
### Main Application
* Enter Location: Type the name of the location for which you want to fetch the weather information.
* Get Weather: Click the "Get Weather" button to fetch and display the weather information.

### Background Changer
The background of the application changes based on the time of day:

* Day Background: Displayed from 6 AM to 6 PM.
* Night Background: Displayed from 6 PM to 6 AM.

## Contributing
Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact
For any questions or suggestions, please open an issue in the repository.