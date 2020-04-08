### Corona Exercise

This repository consists of data SQL file which creates corona database and Corona.java file in the src folder which connects to database and prints the corona affected people count state wise.

### Getting Started

Download the repository into your system.

Open sql workbench and click on administration which is besides schemas and click on user and privilages.

Fill the details in user and privilages as login name student, password student and in administrative roles select all and click apply and close.

Create a Connection with connection name, username as student and password as student and test the connection to check the connectivity and open the connection.

Now the sql user student is ready to accept connections, now open sql file from the downloaded repository and execute it in the student connection.

Open Eclipse IDE and click on file and open this downloaded project repository using the path to the folder and execute Corona.java file from src folder.

data.sql - Created coronadata table in corona database.

Corona.java - Connects jdbc to corona database and executes queries.

CoronaDataModel.java - Used to create instances of it and retrieve and insert the data using getters and setters.

CalculateData.java - All the calculations regarding corona count are performed in this class.

### Side Note

If you have changed the username and password in Corona.java file don't forgot to create a new account with the same credentials in users and privileges.
