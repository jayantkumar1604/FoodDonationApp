# 🍽️ Food Waste Donation Backend (Spring Boot)

This is the **backend service** for the Food Waste Donation application.  
It provides REST APIs to receive and manage food donation data from the Android frontend and stores it in a MySQL database.

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## 📂 Project Structure

src/main/java/com/foodwaste
 ├── controller     # REST API endpoints
 ├── service        # Business logic
 ├── repository     # Database access (JPA)
 ├── model          # Entity classes
 ├── dto            # Data Transfer Objects
 ├── config         # Security / CORS / app config
 └── FoodWasteApplication.java

---

## 🔗 API Endpoints

### ➤ Donate Food
POST /api/food/donate

**Request Body**
```json
{
  "donorName": "Aastha",
  "foodType": "Sabji",
  "quantity": 7,
  "location": "Noida Sector 58",
  "expiryTime": "2 hours"
}

👨‍💻 Author

Jayant Kumar
9162802720
jayantkumar1604@gmail.com
