# hibernateSample1
The important note:
Should avoid many-to-many design for entities and have to know the differences between create and update for the property auto.
Java classes must follow naming convention rules (for examples, class names and attribute names must not have _)

Tables must have names as required on the design (for examples, Employee table has first_name column instead of firstname)

The DAO class should have at least 5 methods as getXxxByID, getAllXxx, updateXxxByID, deleteXxxById, insertXxx where Xxx is the model class of DAO. You could choose other verbs instead of get, update, delete, and insert. However, they should be consistent among DAO classes and meaningful.

Happy coding!

Problem 1: Create a maven project
Trainees could use Eclipse or Maven commands to create a maven project.

Objectives:
Understand the Maven project structure (main and test source code folder)

Able to create a Maven project using Eclipse or commands

Able to install, test or clean a Maven project by using Eclipse or commands
Problem Descriptions:
The project team needs to create a new project structure to use Maven managing libraries. You are assigned to this task.

Assumptions:
There are no dependencies on the development environment to use Maven.

Derby 10.14 is downloaded and ready to use.

Technical Requirements:
Must use Eclipse to build projects.

Must use tools with versions mentioned above.

Questions to answer:
Create a Maven project with name as training.hibernate.day01.

Update pom.xml by adding dependencies for Hibernate 4.3,

MySQL/MSSQL Serer/Derby 10.14 and Derby Client 10.14.
Run Maven install to download required jar files without any error.

By completing these tasks, your project must have Maven Dependencies as the picture below:

  

Problem 2: Configure Hibernate
Objectives:
Able to configure to use Hibernate in the project
Problem Descriptions:
After creating the project, the team decided to use Hibernate 4.3, MSQL/MSSQL Server/Derby 10.14 to develop their project. Therefore, they could easily perform CRUD operations on database tables.

They want to create a new database with name fadb. In the development phase, they want to show SQL queries so they could track and debug if it is necessary.

Assumptions:
There are no dependencies on the development environment to use Maven.

MySQL/MSSQL Server/Derby 10.14 is downloaded and ready to use.

Complete Problem 1 to use the existing project.

Technical Requirements:
Must use Eclipse to build projects

Must use tools with versions mentioned above

Questions to answer:
Create a configuration file hibernate.cfg.xml in src/main/resources

As the above problems/requirements, update values for these properties: driver_class, url, dialect, show_sql, auto

Create a class to test your configuration correct or not (Use SessionFactory and Session in the main method)

The log output should not have any error.

You also should connect to the fadb database successfully.

Problem 3: Mapping New Table
Objectives:
Able to configure for model classes by using annotations to generate new tables in the database.
Problem Descriptions:
On the ERD, they want to have an Employee table as below:

 Column Name

 Data Type and Constraints

 ID

 int, Primary Key

 First_Name

 varchar(50), not null

 Last_Name

 varchar(50), not null

 

You need to create a model class to create and map with Employee table.

Assumptions:
There are no dependencies on the development environment to use Maven.

MySQL/MSSQL Server/Derby 10.14 is downloaded and ready to use.

Complete Assignment 2 to use the existing project.
Technical Requirements:
Must use Eclipse to build projects

Must use tools with versions mentioned above

Questions to answer:
Create and use annotation in the Employee class. The class should be in a model package, for instance, training.hibernate.model

Create a new Employee object with your selected first name and last name on the main method.

Use the existing session to save new Employee object.

The log output should not have any error.

You should see your new Employee entity by running ‘SELECT * FROM EMPLOYEE’ after connected to fadb database.
