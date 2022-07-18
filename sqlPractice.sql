--Question 1
select "FirstName", "LastName", "CustomerId" , "Country" from "Customer" where "Country"  != 'USA';

-- Question 2
select * from "Customer" where "Country" = 'Brazil';

--Question 3
select * from "Invoice";
select "FirstName", "LastName", "InvoiceId", "InvoiceDate", "BillingCountry"
from "Customer", "Invoice" where "BillingCountry" = 'Brazil';

--Question 4
select * from "Employee" where "Title" = 'Sales Support Agent';

--Question 5
select distinct "BillingCountry"
FROM "Invoice";

--Question 6
--select  distinct "InvoiceId", "FirstName", "LastName", "Title" = 'Sales Support Agent' from "Employee", "Invoice";


--Question 7
select "Total", "CustomerId", "Country", "Title" = 'Sales Support Agent' from "Invoice", "Employee";

--Question 8
select "InvoiceDate" from "Invoice"; 
select extract(year from date '2009-01-01 00:00:00.000');

--Question 9
SELECT "InvoiceLineId" , count("InvoiceLineId") FROM "InvoiceLine" group by "InvoiceLineId"  HAVING "InvoiceId" = 37;


--Question 10
SELECT "InvoiceLineId" , count("InvoiceLineId") FROM "InvoiceLine" group by "InvoiceLineId";