# Project135 - Material Design Android App

A modern Android application showcasing Material Design principles with a beautiful user interface featuring a home screen with category cards, search functionality, and a profile management system.

## 📱 Screenshots

![App Screenshot](app/src/main/res/drawable/Screenshot%202025-10-20%20151415.png)

## ✨ Features

- **Modern Material Design UI**: Clean and intuitive interface following Material Design guidelines
- **Home Screen**: 
  - User profile display with greeting
  - Search functionality with voice input support
  - Quick access category cards (Favorite, Message, Social)
  - Trending content section with RecyclerView
- **Profile Management**:
  - User profile with avatar display
  - Settings options including:
    - Notifications
    - Calendar
    - Gallery
    - My Playlist
    - Share
    - Logout
- **Bottom Navigation**: Custom BottomAppBar with Floating Action Button for enhanced navigation
- **Responsive Design**: Optimized for various screen sizes with ScrollView support

## 🛠️ Tech Stack

- **Language**: Java
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 36
- **Architecture Components**:
  - ConstraintLayout
  - RecyclerView
  - CardView
  - CoordinatorLayout
  - Material Components

## 📦 Dependencies

```gradle
- AndroidX AppCompat
- Material Design Components
- ConstraintLayout
- CardView
- RecyclerView
- Glide (Image Loading Library)
```

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or later
- JDK 11 or higher
- Android SDK with API 36
- Gradle 8.x

### Installation

1. Clone the repository
```bash
git clone <repository-url>
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run the application on an emulator or physical device

### Build and Run

```bash
# Build the project
./gradlew build

# Install on connected device
./gradlew installDebug
```

## 📂 Project Structure

```
project135/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/project135/
│   │   │   │   ├── MainActivity.java
│   │   │   │   └── ProfileActivity.java
│   │   │   ├── res/
│   │   │   │   ├── drawable/        # App images and icons
│   │   │   │   ├── layout/          # XML layouts
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_profile.xml
│   │   │   │   └── values/          # Colors, strings, themes
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
└── build.gradle.kts
```

## 🎨 UI Components

### Home Screen (activity_main.xml)
- Header section with user greeting and notification icon
- Search bar with voice input
- Three category cards with icons and labels
- Trending section with horizontal scrolling
- Custom BottomAppBar with FAB integration

### Profile Screen (activity_profile.xml)
- Profile header with avatar and user information
- Settings list with icons and navigation arrows
- Back button for navigation
- Scrollable content area

## 🔧 Configuration

### Application Details
- **Package Name**: `com.example.project135`
- **Version Code**: 1
- **Version Name**: 1.0

### Compile Options
- **Source Compatibility**: Java 11
- **Target Compatibility**: Java 11

## 🐛 Recent Fixes

- ✅ Resolved duplicate ID issues in `activity_main.xml`
  - Fixed duplicate IDs in feature cards (Message, Social)
  - Fixed duplicate IDs in bottom navigation items
- ✅ Resolved duplicate ID issues in `activity_profile.xml`
  - Fixed duplicate IDs across all setting rows (Calendar, Gallery, Playlist, Share, Logout)

## 📝 Code Quality

- Proper ID naming conventions implemented
- Constraint references correctly configured
- Clean XML layout structure
- No duplicate resource IDs

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

## 📄 License

This project is for educational purposes as part of Android Development learning tutorials.

## 👨‍💻 Author

Part of Stark Industry Workspace - Tutorials and Learning Projects

## 📞 Support

For any questions or support, please open an issue in the project repository.

---

**Note**: This project is part of a learning series focused on Android UI development and Material Design implementation.

