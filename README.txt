PROJECT TITLE: Travel Agency

PURPOSE OF PROJECT: Design and implement a relational database, insert data in it and process the data. Use JDBC to connect the database with a GUI implemented in Java to design a complete application.

DATE: Jan 2023

AUTHORS: Spyros, Kallinikos

USER INSTRUCTIONS:

For database:
In the 'database' folder there are 3 txt files ("1.create_tables.txt", "2.pro_trig.txt", "3.insert.txt") from which the database is constructed. So, copy and paste the contents of each file (first 1. then 2. then 3.) into the mysql command line client and wait for the commands to execute. The database name is "travelagency".


The file "3.insert.txt" is constructed using the "build_inserts.py" python file and can be reconstructed in a partially randomized way.

Side effect of reconstruction: names of "it" change, so to loggin to the travel agency you will need to figure out the new "last name" of the "it" (which is random) using mysql.


For GUI:
In the 'gui' folder there is a "dist" folder. Go in the "dist" folder and change the "db_settings.txt" file with the correct settings for your database. The first line is the url of the database, the second is the username of the database and the third is the password of the database.

Then in the "dist" folder open the command line and run the project with the following command.
-> java -jar "bd.jar"
Then for username use 'White' and for password 'password'.


If you want to recreate this executable jar file then open the "gui" folder with apache netbeans ide and type Shift+F11 to build the project. If you execute it within the netbeans ide (using F6) you will need to change the "db_settings.txt" file in the "gui" folder.

Side effects of recreating the jar executable: you will need to add the "db_settings.txt" file again in the "dist" folder so you can execute the program from the command line. You can find it in the "gui" folder if you need the original one.


Notes:
The project was made with 'Apache Netbeans IDE 16' editor.

(java -version)
java version "21" 2023-09-19 LTS
Java(TM) SE Runtime Environment (build 21+35-LTS-2513)
Java HotSpot(TM) 64-Bit Server VM (build 21+35-LTS-2513, mixed mode, sharing)

Mysql version: 8.0.31