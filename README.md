# Event Management System

The Event Management System offers a wide array of features including event creation, registration, tracking, and administrative controls. Users can seamlessly navigate through the system to find, register for, or organize events, enhancing the overall event experience within educational institutions.

# Features
- Event Creation and Management: Create new events, and manage events efficiently.
- Registration: Easily register for events, with options for students, and professors.
- Event Tracking: Track attendance, manage registrations, and monitor event progress in real-time.

# Access Control

The Event Management System provides different levels of access based on user roles:
- Administrators: Have full access to the system.
- Professors: Can create and manage events they're organizing, view events, and view departments.
- Students: Can browse and register for events, view their registrations, and view some information on professors.

# Relational Model
This is the relational model of the Event Management System, excluding the logging feature, which incorporates a log table for tracking system activities, although the log table itself is not included in this model.

![image](https://github.com/arcarum/event-management-system/assets/134963929/d97cfd8d-073d-4b15-9136-dffc3d820370)

# Screenshots

Below are some screenshots showcasing the user interface and functionality of the Event Management System while logged in as an admin:

# Login Screen:

![image](https://github.com/arcarum/event-management-system/assets/134963929/3339aa5e-0688-40b8-b16d-1ff7e3ca96af)

# Main Page:

![image](https://github.com/arcarum/event-management-system/assets/134963929/a8272fd8-b6ef-4aca-a1b9-a1abd310f1ab)

# Adding a New Student:

![image](https://github.com/arcarum/event-management-system/assets/134963929/8adc16b7-ae21-4d6c-ae0b-f04498ae3cd6)

# Logs:

![image](https://github.com/arcarum/event-management-system/assets/134963929/0645fe5d-51a5-4f66-be5a-fc685fb059d2)

# Usage

To use the system, follow these steps:
1) Clone the repository to your local machine
2) Run `DDLStatement.sql` to generate the required tables
3) In `myDBcon.java` use the url, username, and password for your database connection
4) Ensure you have Java installed
5) Download the required dependencies:
     - `FlatLaf 3.4 JAR`
     - `ojdbc7 JAR (Oracle JDBC driver)`
6) Place the downloaded JAR files in the same directory as the project
7) Build and run the system

Note: `FlatLaf-3.4.jar` and `ojdbc7.jar` are required dependencies but are not provided with this repository. You need to obtain them separately and place them in the same directory as the project.
