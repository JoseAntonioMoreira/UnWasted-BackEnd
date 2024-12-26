DROP DATABASE IF EXISTS UnWasted;
CREATE DATABASE UnWasted;
USE UnWasted;

CREATE TABLE producer
(
    producer_id INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    email       VARCHAR(100) NOT NULL UNIQUE,
    phone       VARCHAR(15),
    address      VARCHAR(255),
    location     VARCHAR(255),
    images       VARCHAR(255),
    tag         VARCHAR(255),
    password  VARCHAR(255)        NOT NULL,
    list_products VARCHAR(255)
);

CREATE TABLE product
(
    product_id     INT AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(100)   NOT NULL,
    description    VARCHAR(255),
    price          DECIMAL(10, 2) NOT NULL,
    stock_quantity INT            NOT NULL,
    producer_id    INT            NOT NULL,

    image_url      VARCHAR(255),
    FOREIGN KEY (producer_id) REFERENCES producer (producer_id)
);

CREATE TABLE client
(
    client_id INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(100)        NOT NULL,
    email     VARCHAR(100) UNIQUE NOT NULL,
    phone     VARCHAR(15),
    password  VARCHAR(255)        NOT NULL,
    address   VARCHAR(255)
);

CREATE TABLE orders
(
    order_id     INT AUTO_INCREMENT PRIMARY KEY,
    client_id    INT            NOT NULL,
    order_date   TIMESTAMP   DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10, 2) NOT NULL,
    status       VARCHAR(50) DEFAULT 'Pending',
    FOREIGN KEY (client_id) REFERENCES client (client_id)
);

CREATE TABLE delivery
(
    delivery_id      INT AUTO_INCREMENT PRIMARY KEY,
    order_id         INT          NOT NULL,
    delivery_address VARCHAR(255) NOT NULL,
    delivery_date    TIMESTAMP   DEFAULT CURRENT_TIMESTAMP,
    status           VARCHAR(50) DEFAULT 'In Progress',
    FOREIGN KEY (order_id) REFERENCES orders (order_id)
);