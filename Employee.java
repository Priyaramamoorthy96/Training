
package com.pramati.hrms;
import java.sql.Date;

/**
* @author priya
*
*/
public class Employee 
{
int empId = 0;
String firstName = null;
String lastName = null;
int age = 0;
String gender = null;
int deptId = 0;
int experience = 0;
double salary = 0;
String dateOfBirth = null;
Date joiningDate = null;


public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Date getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public String getLastModifiedBy() {
	return lastModifiedBy;
}
public void setLastModifiedBy(String lastModifiedBy) {
	this.lastModifiedBy = lastModifiedBy;
}
public Date getLastModifiedDate() {
	return lastModifiedDate;
}
public void setLastModifiedDate(Date lastModifiedDate) {
	this.lastModifiedDate = lastModifiedDate;
}
String createdBy = null;
Date createdDate = null;
String lastModifiedBy = null;
Date lastModifiedDate = null;

public void printdetails()   //PRINT fUNCTION
{
	System.out.println("");	
	System.out.println("Employee " +empId+ " Details:");
	System.out.println("=======================");
	System.out.println("");	
	System.out.println("Employee Id          : "+empId);
	System.out.println("First Name           : "+firstName);
	System.out.println("Last Name            : "+lastName);
	System.out.println("Gender               : "+gender);
	System.out.println("Date Of Birth        : "+dateOfBirth);
	System.out.println("Age                  : "+age);
	System.out.println("Joining Date         : "+joiningDate);
	System.out.println("Experience           : "+experience);
	System.out.println("Salary               : "+salary);
	System.out.println("Created By           : "+createdBy);
	System.out.println("Created Date         : "+createdDate);
	System.out.println("Last Modified By     : "+lastModifiedBy);
	System.out.println("Last Modified By     : "+lastModifiedDate);
	
	
	System.out.println("");	
	
	 
}


}

