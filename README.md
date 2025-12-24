✈️ MakeMyTrip Clone – Full Stack Travel Booking Platform

🚀 A full-stack MakeMyTrip clone built using Spring Boot, Maven, MongoDB, and HTML, CSS, JavaScript.
This project replicates the core workflow of a real travel booking platform with a strong backend architecture and a clean frontend.

📌 Project Overview

This project aims to simulate how a large-scale travel booking platform like MakeMyTrip works internally.

It focuses on:

Backend API design

Database schema planning

Frontend–backend integration

Real-world development practices

⚠️ This is not just a UI clone. The main focus is on backend logic, scalability, and clean architecture.

🛠️ Tech Stack
🔹 Backend

Spring Boot – REST API development

Maven – Dependency & build management

MongoDB – NoSQL database for flexible data modeling

Spring Data MongoDB – ORM-like database interaction

🔹 Frontend

HTML – Structure

CSS – Styling

JavaScript – Dynamic content & API integration

🔹 Tools

Postman – API testing

Git & GitHub – Version control

VS Code / IntelliJ – Development environment

🎯 Features Implemented / Planned
✅ User Features

👤 User registration & login

🔐 Secure authentication (JWT planned)

🔍 Search travel options (hotels / trips – mock data supported)

🧾 Booking flow (search → select → book)

📜 View booking history

⚙️ Backend Features

RESTful API architecture

Proper HTTP status codes

Exception handling

Clean controller–service–repository separation

MongoDB schema design

🎨 Frontend Features

Responsive UI

Dynamic data rendering using Fetch API

Form validation

Clean and minimal UI inspired by MakeMyTrip

🧠 System Architecture
Frontend (HTML / CSS / JS)
        |
        |  REST API (JSON)
        ↓
Spring Boot Backend
        |
        ↓
MongoDB Database


✔️ Frontend and backend are decoupled
✔️ Backend can later support React / Angular easily

🗂️ Project Structure
MakeMyTrip/
│
├── src/main/java/com/makemytrip
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── MakeMyTripApplication.java
│
├── src/main/resources
│   ├── application.properties
│   └── static/
│       ├── index.html
│       ├── css/
│       └── js/
│
├── pom.xml
└── README.md

🧩 Database Design (MongoDB)
📌 Collections

users

bookings

hotels / trips

payments (planned)

✔️ Optimized for fast reads
✔️ Avoids deep nesting
✔️ Scalable schema design

🔌 API Example
🔍 Search Hotels
GET /api/hotels/search


Response

{
  "hotelName": "Ocean View",
  "price": 3500,
  "location": "Goa"
}

▶️ How to Run the Project
🧑‍💻 Backend
./mvnw spring-boot:run

🗄️ Database

Start MongoDB locally or use MongoDB Atlas

Update connection string in application.properties

🌐 Frontend

Open index.html directly

OR serve using Spring Boot static resources

🚧 Current Status

🔨 Under active development
🔄 More APIs and features being added
📈 Focus on scalability and clean code

🌱 Future Enhancements

🔐 JWT authentication

💳 Payment gateway integration

📱 Fully responsive mobile-first UI

⚡ React frontend

☁️ Cloud deployment (AWS / Render)

🎓 Learning Outcomes

Through this project, I gained hands-on experience in:

Building real-world REST APIs

MongoDB schema design

Frontend–backend communication

Debugging Maven & Spring Boot issues

Writing production-style code

👨‍💻 Author

Nikhil Rangarej
🎓 B.Tech – Artificial Intelligence & Data Science
💡 Passionate about backend systems, architecture, and scalable software

⭐ Final Note

This project is built with learning + real-world practicality in mind.
Feedback, suggestions, and improvements are always welcome.

🚀 Building like an engineer, not just a student.
