# orenge
Process/Framework used, and list of all pages used in the flow.

 frameworks used • Page Object Model • Maven • TestNG

 Project structure  main is a package created to store testcases. • mainTest: mainTest is a class having all the required Testcases for the flow.

 Pages is package related to store objects. • loginPage is a class having all the objects for login page. • AddEmployeePage is a class having all the objects for addEmployeePage page. • EmployeeListPage is a class having all the objects for employeeListPage page.

 Process Followed

Created a maven project (so that i can add dependencies easily).
Launched browser with the help of webdrivermabager dependency.
Used implicitly wait as wait mechanism.
Used opencsv dependency for reading data from a csv File.
Created a csv wile with input data in project folder.
 Description of the flow

Logged in using default credentials
For adding employees, drawn data from csv file and used as inputs to corresponding textfields and created employee successfully.
Then went to employee list page and verified if the employee added successfully andverified using first name.
Above 2 steps repeated for 4 users.
Quit from the browser.
