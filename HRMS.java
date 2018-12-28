/**
 * 
 */
package com.pramati.hrms;

/**
 * @author Priya
 *
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HRMS {
	private static Connection conn = null;
	

	public static void main(String[] args) throws SQLException {
		conn = dbconnection.getconnection();
	//	HRMS.DeleteEmployeeById(13600);                                    //Calling the DeleteEmployeeById Method
	/*	ArrayList<Employee> arrlist = HRMS.getEmployeeByDept(111);
		Iterator<Employee> iterator = arrlist.iterator();              
		if (arrlist.isEmpty()) {
			System.out.println("The Given Department Id is not Exist..");    

		} else {
			while (iterator.hasNext()) {
            Employee e=new Employee();
			iterator.next().e.printdetails();             //printing the list of employee details who belongs to the given department Id

			}
		}
		*/
		
		List<Employee> searchlist = HRMS.getEmployeesBySearchField("Male");
		Iterator<Employee> iterator1 = searchlist.iterator();              
		
			while (iterator1.hasNext()) {

				  Employee e=new Employee();
				  e = iterator1.next();
					e.printdetails();   
				

			}
		}
	

	/**
	 * Deleting the employee details by passing Employee Id
	 * 
	 * @param empId
	 * @return
	 */

	public static Boolean DeleteEmployeeById(int empId) {
		try {

			Statement statement = conn.createStatement();
			if (statement.executeUpdate("delete from pramati.dbo.Employee where empId=" + empId) == 1) {    //Query to Delete the Employee details of the given employeeId
				System.out.println("Given Employee Id row " + empId + " is Successfully deleted..");
			} else {
				System.out.println("Given Employee Id " + empId + " Not Exist..");      
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return true;
	}

	/**
	 * Getting the Employee Details by DeptId using Procedure
	 * 
	 * @throws SQLException
	 */

	public static ArrayList<Employee>getEmployeesBySearchField(int DeptId) throws SQLException {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();    //Array list Creation
		ResultSet result = null;
		CallableStatement stmt = null;

		try {
			stmt = conn.prepareCall(" { call pramati.dbo.empproc(?) } ");         //Calling the Procedure(empproc) of Pramati Database
			stmt.setInt(1, DeptId);                        
			result = stmt.executeQuery();

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
				employeeList.add(emp);
				// System.out.println(emp.toString());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1" + e.getMessage());
			// e.printStackTrace();
		} finally {
			result.close();         
			stmt.close();
		}
		// return 0;
		return employeeList;    // Returning the set of Employee details who belong the Given DeptId 

	}
	public static List<Employee> getEmployeesBySearchField( String searchString) throws SQLException

	{
		ArrayList<Employee> employeeList = new ArrayList<Employee>();    //Array list Creation
		ResultSet result = null;
		CallableStatement stmt = null;

		try {
			stmt = conn.prepareCall(" { call pramati.dbo.searchstring(?) } ");         //Calling the Procedure(empproc) of Pramati Database
			stmt.setString(1, searchString);                        
			result = stmt.executeQuery();

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
				employeeList.add(emp);
				// System.out.println(emp.toString());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1" + e.getMessage());
			// e.printStackTrace();
		} finally {
			result.close();         
			stmt.close();
		}
		// return 0;
		return employeeList;    // Returning the set of Employee details who belong the Given DeptId 

	}

}