package com.pramati.hrms;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class dbconnection
{
private static Connection connection;
static String  url = "jdbc:sqlserver://localhost:53465";
static String user;
static String pass;

public static Connection getconnection()
{
try {
FileReader filereader = new FileReader("C:\\Users\\Priya\\eclipse-workspace\\empdb\\src\\com\\pramati\\hrms\\config.properties");
Properties property = new Properties();
property.load(filereader);
user = property.getProperty("user");
pass = property.getProperty("password");

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
connection = DriverManager.getConnection(url, user, pass);

}catch (Exception e) 
{
System.out.println("Error while connecting");
e.printStackTrace();
}
return connection;
}

}
