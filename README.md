# Mars Photos Android App

## Overview
Mars Photos is an Android app that displays actual images of Mars' surface. These images are real-life photos captured by NASA's Mars rovers. The data is fetched from a web server using a REST web service and displayed in the app using modern Android development tools and libraries.

## Features
- Display real-life photos of Mars' surface taken by NASA's Mars rovers.
- Fetch data from a REST web service using Retrofit.
- Utilize Jetpack Compose for building the user interface.
- Manage UI-related data using ViewModel.
- Separate the UI layer and the data layer for better code organization.
- Load images efficiently with Coil library.
- Parse JSON responses using kotlinx.serialization.
- Implement Repository pattern for data handling.
- Use Dependency Injection for better code maintainability.
- Perform unit testing on ViewModel and Repository.

## Tools and Libraries Used
- **Jetpack Compose**: For building UI components.
- **ViewModel**: For managing UI-related data.
- **Coil**: For loading images.
- **Retrofit**: For making network requests.
- **kotlinx.serialization**: For parsing JSON responses.
- **Web Services**: To interact with the API.
- **Repository Pattern**: For handling data operations.
- **Dependency Injection**: For managing dependencies.
- **JUnit**: For unit testing ViewModel and Repository.

## Getting Started
To get a local copy up and running follow these simple steps.

### Prerequisites
- Android Studio Arctic Fox or later.
- Kotlin 1.5 or later.

### Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/mars-photos-app.git
    ```
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Architecture
The app follows the MVVM (Model-View-ViewModel) architecture to separate concerns and make the codebase more maintainable. The Repository pattern is used for data handling, and Dependency Injection is employed for managing dependencies.

## Testing
Unit tests are written for ViewModel and Repository to ensure the reliability and correctness of the app's logic.

## License
Distributed under the MIT License. See `LICENSE` for more information.

## Contact
Hitendra Quessou - [LinkedIn](https://www.linkedin.com/in/hitendraquessou) - [GitHub](https://github.com/Hitendra2) - sanjay_quessou@yahoo.co.uk

Project Link: [https://github.com/yourusername/mars-photos-app](https://github.com/yourusername/mars-photos-app)




