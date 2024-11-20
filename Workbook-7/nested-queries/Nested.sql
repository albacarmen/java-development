-- 1
SELECT ProductName
FROM Products
WHERE UnitPrice = (
    SELECT MAX(UnitPrice) 
    FROM Products
);

-- 2
SELECT OrderID, ShipName, ShipAddress
FROM Orders
WHERE ShipVia IN (
    SELECT ShipperID
    FROM Shippers
    WHERE CompanyName = 'Federal Shipping'
);



-- 3
SELECT OrderID
FROM `Order Details`
WHERE ProductID IN (
    SELECT ProductID 
    FROM Products 
    WHERE ProductName = 'Sasquatch Ale'
);

-- 4
SELECT CONCAT(FirstName, ' ', LastName) AS EmployeeName
FROM Employees
WHERE EmployeeID = (SELECT EmployeeID FROM Orders WHERE OrderID = 10266);


-- 5
SELECT CompanyName
FROM Customers
WHERE CustomerID = (
    SELECT CustomerID 
    FROM Orders 
    WHERE OrderID = 10266
);
