package com.pramati.hrms;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class hashmapEmployee 
{
	private static Connection conn = null;
	public static void main(String[] args) 
	{
		conn = dbconnection.getconnection();
		
		HashMap<Integer,Employee> map = hashmapEmployee.getAllEmployees();

    	
		  for(Integer i : map.keySet()){
			  Employee e = map.get(i);
			 e.printdetails();
	      
	        }
	}
	
	public static HashMap<Integer, Employee> getAllEmployees(){
			
HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();

        Statement st = null;
        ResultSet result = null;
     
       
        try {
        	 st = conn.createStatement();
			result = st.executeQuery("SELECT * FROM pramati.dbo.employee");		
			  while (result.next()) {
				     Employee emp = new Employee();
					emp.setEmpId(result.getInt("EmpId"));
					emp.setFirstName(result.getString("FirstName"));
					emp.setLastName(result.getString("LastName"));
					emp.setAge(result.getInt("Age"));
					emp.setDateOfBirth(result.getString("DOB"));
					emp.setGender(result.getString("Gender"));
					emp.setDeptId(result.getInt("DeptId"));
					emp.setExperience(result.getInt("Experience"));
					emp.setSalary(result.getDouble("Salary"));
					emp.setJoiningDate(result.getDate("JoiningDate"));
					emp.setCreatedBy(result.getString("CreatedBy"));
					emp.setCreatedDate(result.getDate("CreatedDate"));
					emp.setLastModifiedBy(result.getString("LastModifiedBy"));
					emp.setLastModifiedDate(result.getDate("LastModifiedDate"));
					map.put(result.getInt("EmpId"), emp);
		             
				}
			  
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
      return map;
	}
	
	
	
	}
	
