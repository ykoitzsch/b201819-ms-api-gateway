# b201819-ms-database-per-service

This is an e-commerce application with a microservice-architecture and the database-per-service pattern implemented.
There are a total of 5 microservices which are: 

  - Customer Service
  - Rating Service
  - Inventory Service
  - Order Service
  - Invoice Service

### Requirements
 - Java 1.8+
 - NPM (version used in development is 6.4.1)
### Installation

First clone the JHipster Registry from their repository https://github.com/jhipster/jhipster-registry
```sh
$ git clone https://github.com/jhipster/jhipster-registry.git
```

Start the registry
```sh
$ cd jhipster-registry
$ mvnw (or ./mvnw with linux)
```
After the JHipster Registry is running you can start the API Gateway and the microservices. It is recommended to start the API Gateway first. The first time running mvnw on the shop might fail. Just try again and it should work fine.
```sh
$ cd shop
$ mvnw (or ./mvnw with linux)
$ npm start
```

Start the microservices
```sh
$ cd customers/orders/ratings/invoices/inventory
$ mvnw (or ./mvnw with linux)
```

### Setup
(Admin)
 - Once the application is running you can access it at http://localhost:9000.
 - Login as admin/admin
 - Create product categories
 - Create products and link them to categories
 
(Customer)
- Register
- Login (only possible after admin has activated the account)
- Shop!


