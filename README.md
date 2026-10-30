# Courier_Management_springboot

[![CI](https://github.com/Mudabbirarafat/Courier_Management_springboot/actions/workflows/ci.yml/badge.svg)](https://github.com/Mudabbirarafat/Courier_Management_springboot/actions/workflows/ci.yml)
A web-based application built using Spring Boot that streamlines the process of booking, managing, and tracking courier shipments. Designed for admins and customers to easily manage courier operations in real time.


---

🔧 Tech Stack

Backend: Java, Spring Boot, Spring MVC

Database: MySQL (via Spring Data JPA)

Frontend: HTML / Thymeleaf / Postman for testing (depending on your implementation)

Build Tool: Maven



---

✨ Features

👤 User Module:

Register and login as a customer

Book a courier with sender and receiver details

Get tracking ID upon booking

Track shipment status


🛠️ Admin Module:

View all courier requests

Update shipment status (Dispatched, In Transit, Delivered, etc.)

Delete or modify entries



---

🗃️ Database Tables (Example)

User: id, name, email, password

Courier: id, sender_name, receiver_name, origin, destination, status, date
