# Event Management System

The Event Management System offers a wide array of features including event creation, registration, tracking, and administrative controls. Users can navigate through the system to find, register for, or organize events, enhancing the overall event experience within educational institutions.

## How to Run
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

## Some Features
- Event Creation and Management: Create new events, and manage events efficiently.
- Registration: Easily register for events, with options for students, and professors.
- Event Tracking: Track attendance, manage registrations, and monitor event progress in real-time.

## Access Control
The Event Management System provides different levels of access based on user roles:
- Administrators: Have full access to the system.
- Professors: Can create and manage events they are organizing, view events, and view departments.
- Students: Can browse and register for events, view their registrations, and view some information on professors.

## Relational Model
This is the relational model of the Event Management System, excluding the logging feature, which incorporates a log table for tracking system activities, although the log table itself is not included in this model.
![1](https://github.com/user-attachments/assets/6fc32499-87d3-4174-86b3-e5665a74a1b4)

## Demo
Below are some screenshots showcasing the user interface and functionality of the Event Management System while logged in as an admin:

## Login Screen:
![2](https://github.com/user-attachments/assets/9dc8a21a-6fad-4019-a2c4-bd80fb56d2bd)

## Main Page:
![3](https://github.com/user-attachments/assets/cda77f26-4ef2-44a1-856b-2740905165c3)

## Adding a New Student:
![4](https://github.com/user-attachments/assets/e571b003-e18b-403f-92be-0bba7b739125)

## Logs:
![5](https://github.com/user-attachments/assets/710e444d-7217-482e-addb-02d6d993a0ab)

## Collaborators
This project was worked on with the contributions of [arcarum](https://github.com/arcarum).
