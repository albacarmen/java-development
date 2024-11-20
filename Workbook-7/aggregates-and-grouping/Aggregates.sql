-- 1
SELECT COUNT(DISTINCT SupplierID) AS NumberOfSuppliers
FROM Products;
-- 2
SELECT SUM(Salary) AS TotalSalaries
FROM Employees;

-- 3
SELECT MIN(UnitPrice) AS CheapestItemPrice
FROM Products
WHERE UnitPrice > 0;

-- 4
SELECT AVG(UnitPrice) AS AverageItemPrice
FROM Products
WHERE UnitPrice > 0;

-- 5
SELECT MAX(UnitPrice) AS MostExpensiveItemPrice
FROM Products
WHERE UnitPrice > 0;

-- 6
SELECT SupplierID, COUNT(ProductID) AS NumberOfItemsSupplied
FROM Products
GROUP BY SupplierID;

-- 7
SELECT CategoryID, AVG(UnitPrice) AS AveragePrice
FROM Products
GROUP BY CategoryID;

-- 8
SELECT SupplierID, COUNT(ProductID) AS NumberOfItemsSupplied
FROM Products
GROUP BY SupplierID
HAVING COUNT(ProductID) >= 5;

-- 9
SELECT ProductID, ProductName, (UnitPrice * UnitsInStock) AS InventoryValue
FROM Products
ORDER BY InventoryValue DESC, ProductName;


