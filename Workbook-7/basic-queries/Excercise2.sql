-- 1
SELECT
	*
FROM
	Products;
-- 2
SELECT
	ProductID, ProductName, UnitPrice
FROM
	Products;
-- 3
SELECT
	ProductID, ProductName, UnitPrice
FROM
	Products
ORDER BY
	UnitPrice ASC;
-- 4
SELECT
	*
FROM
	Products
WHERE
	UnitPrice <= 7.50;
-- 5
SELECT
	*
FROM
	Products
WHERE
	UnitsInStock >= 100
ORDER BY
	UnitPrice;
-- 6
SELECT
	*
FROM
	Products
WHERE
	UnitsInStock >= 100
ORDER BY
	UnitPrice, ProductName;
-- 7
SELECT
	*
FROM
	Products
WHERE
	UnitsInStock = 0 AND UnitsOnOrder >= 1
ORDER BY
	ProductName;
-- 8
	-- northwind.categories
-- 9
SELECT
	*
FROM
	Categories;
    -- 8
-- 10
SELECT
	*
FROM
	Products
WHERE
	ProductID = 8;
-- 11
SELECT
	LastName, FirstName
FROM
	Employees
ORDER BY
	LastName;
-- 12
SELECT
	*
FROM
	Employees
WHERE
	Title LIKE "%manager%";
-- 13
SELECT DISTINCT
	Title
FROM
	Employees;
-- 14
SELECT
	*
FROM
	Employees;
-- 15
SELECT
	*
FROM
	Suppliers;
-- 16
SELECT
	*
FROM
	Products
WHERE
	SupplierID = 4;