# Music Store Management System

This project is a comprehensive system for managing a music store. It includes handling of product inventory, customer profiles, sales transactions, and employee management. The system facilitates the creation, update, retrieval, and deletion of information about musical products, customers, sales, and staff.

## Features

### Product Inventory Management
- Models Involved: Product, Category, Supplier
- Create a Product model with fields such as Product ID (Auto Increment), name, description, price, category (linked to Category ID), supplier (linked to Supplier ID), and stock level.
- Implement CRUD operations for managing product details.
- Enable filtering and sorting of products based on category, price, and popularity.

### Customer Profile Management
- Models Involved: Customer, Purchase
- Design a Customer model with fields like Customer ID, name, contact information, and purchase history.
- Allow customers to update their profile information and view their transaction history.
- Implement CRUD operations for managing customer profiles.

### Sales Transaction Management
- Models Involved: Sale, Customer, Product
- Develop a Sale model with fields such as Sale ID, Product ID, Customer ID, quantity sold, date of sale, and total price.
- Allow CRUD operations on sales transactions, including recording, updating, and canceling sales.
- Support viewing all sales for a specific product or customer.

### Employee Management
- Models Involved: Employee, Department, Role
- Adapt the Employee model from the Employee Management System with modifications suitable for a retail environment, including fields such as Employee ID, name, department (e.g., sales, inventory management), role, and email.
- Enable CRUD operations on employee details according to the cardinality rules between Employee, Department, and Roles.
- Employees should be able to update their profiles, excluding department and role changes.

## Technical Details
- The project is implemented using a RESTful API architecture with Spring Boot.
- MySQL Database is integrated for data storage.
- The right cardinality rules between the models are enforced.
- Hibernate ORM is used for database interaction to facilitate CRUD operations and ensure data integrity.
- Logging is added for each CRUD operation to aid in debugging and monitoring the system’s usage.

## Getting Started
To get a local copy up and running follow these simple steps.

### Prerequisites
- Java 8 or later
- Maven
- MySQL

### Installation
1. Clone the repo
   ```
   git clone https://github.com/ZaidSharieff/MusicStoreManagement.git
   ```
2. Navigate to the project directory
   ```
   cd MusicStoreManagement
   ```
3. Build the project
   ```
   mvn clean install
   ```
4. Run the project
   ```
   mvn spring-boot:run
   ```

## Usage
After running the application, you can use any API testing tool (like Postman) to send requests to the endpoints defined in the controllers.

## Contributing
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
Distributed under the MIT License. See `LICENSE` for more information.

## Contact
Team:
<ul>
  <li>Shivam Singh (HackerXeroid) - hackerxeroid@outlook.com</li>
  <li>Harsh Kumar (harsh-kumar-patwa) - harshkumar3446@gmail.com</li>
  <li>Zaid Sharieff (ZaidSharieff) - zaid.23bcs10120@sst.scaler.com</li>
  <li>Abhay Raj (BarryByte) - abhay.23bcs10181@sst.scaler.com</li>
  <li>Abhinav Narayan (AbhinavKRN) - abhinavv2005@gmail.com</li>
  <li>V Shravanth (CodingWithError) - vshravanth2004@gmail.com</li>
</ul>

Project Link: [https://github.com/ZaidSharieff/MusicStoreManagement](https://github.com/ZaidSharieff/MusicStoreManagement)
