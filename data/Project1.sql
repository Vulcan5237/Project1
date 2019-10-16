/*
Grant Robertson
COMP 3700
Project 1
SQL Code (Physical Database Design)
*/

--Table Declarations
CREATE TABLE Products (
ProductID int not null PRIMARY KEY,
Name varchar(100),
Price float,
Quantity int
);


CREATE TABLE Customers (
CustomerID int not null PRIMARY KEY,
Name varchar(100),
Address varchar(100),
PhoneNumber varchar(100)
);

CREATE TABLE Purchases (
PurchaseID int not null PRIMARY KEY,
CustomerID int,
ProductID int,
Price float,
Quantity INT,
Cost float,
Tax float,
TotalCost float,
PurchaseDate varchar(100),
FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);