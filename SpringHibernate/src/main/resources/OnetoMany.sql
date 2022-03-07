-- =========================================
-- Create table template
-- =========================================
USE MLDB
GO

CREATE TABLE Customer
(
	Customer_id int primary key,
	Customer_Name varchar(50) not null
)
GO
CREATE TABLE Bank
(
	Bank_id int primary key,
	Bank_Name varchar(50) not null,
	Customer_id int foreign key (Customer_id) references Customer(Customer_id)
)
GO