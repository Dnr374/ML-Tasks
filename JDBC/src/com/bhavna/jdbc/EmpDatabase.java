package com.bhavna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpDatabase {
	static Connection connection;
	static PreparedStatement ps;
	Scanner scanner =new Scanner(System.in);
	
	//connection to database
	static void connectToDB() {
		try {

			String dbURL = "jdbc:sqlserver://localhost;databaseName=MLDB;portNumber=1434;user=sa;password=Bhavna@123";
			connection = DriverManager.getConnection(dbURL);
			if (connection != null) {
				System.out.println("Connection Established");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	//Adding new Employee record
	static void addEmployee(Employee emp) {
		String query="INSERT INTO EMP VALUES(?,?,?,?,?)";
		try {
			ps=connection.prepareStatement(query);
			ps.setInt(1,emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setDouble(3, emp.getEmpSal());
			ps.setString(4, emp.getDeptId());
			ps.setString(5, emp.getDoj());
			ps.executeUpdate();
			System.out.println("record added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	//Adding new Department record
	static void addDept(Employee emp) {
		String query="INSERT INTO DEPT VALUES(?,?)";
		try {
			ps=connection.prepareStatement(query);
			ps.setString(1,emp.getDeptId());
			ps.setString(2, emp.getDeptName());
			ps.executeUpdate();
			System.out.println("record added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//closing the connection
	static void close() {
		try {
			if(connection!=null) {
				connection.close();
				System.out.println("Connection closed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//checking whether the Employee ID is present or not
	public static boolean isEmployeePresent(int empId) {
		String query="SELECT* FROM EMP WHERE EMPID=?";
		try {
			ps=connection.prepareStatement(query);
			ps.setInt(1, empId);
			ResultSet rs= ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	//checking whether the Department ID is present or not
	public static boolean isDeptPresent(String deptId) {
		String query="SELECT* FROM DEPT WHERE DEPTID=?";
		try {
			ps=connection.prepareStatement(query);
			ps.setString(1, deptId);
			ResultSet rs= ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//fetching the emp information along with dept name
	public void fetchEmpData() {
		String query="SELECT* FROM EMP,DEPT WHERE EMP.DEPTID=DEPT.DEPTID";
		try {
			ps=connection.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			System.out.println("empID is "+rs.getInt(1)+" and his/her name "+rs.getString(2)+",his/her salary"+rs.getDouble(3)+" "+rs.getString(4)+" "+ rs.getDate(5)+" "+rs.getString(7));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		public void updateEmployee() {
		String query="UPDATE EMP set EMPNAME=?,EMPSAL=?,DEPTID=?,DOJ=? WHERE EMPID=?";
		try {
				ps=connection.prepareStatement(query);
				
				
				System.out.println("Enter the employee id: ");
				int empId = scanner.nextInt();
				ps.setInt(5, empId);
				
				System.out.println("Enter the employee name to update: ");
				String empName = scanner.next();
				ps.setString(1, empName);
				
				System.out.println("Enter the employee salary to update: ");
				double empSalary = scanner.nextDouble();
				ps.setDouble(2, empSalary);
		
			System.out.println("Enter the department Id to update: ");
				String deptId = scanner.next();
				ps.setString(3, deptId);
				
				System.out.println("Enter the employee joining date to update: ");
				String empJoiningDate = scanner.next();
				ps.setString(4, empJoiningDate);

				ps.executeUpdate();
			
				System.out.println("Updated successfully");
				
			   System.out.println("Employee Id: "+empId+" Employee Name: "+empName+"Employee Salary: "+empSalary+" Employee Joining date: "+empJoiningDate+" DeptId: "+deptId );
			
	           
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
		//query to find the employees count in each department whose salary greater than 30000 (deptName,EmployeesCount)
		public void empSalDetails() {
		String query="SELECT COUNT(EMPID) as EMPCOUNT ,DEPTID FROM EMP HAVING EMPSAL>30000 GROUPBY DEPTID";
			try {
				ps=connection.prepareStatement(query);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					System.out.println("Department ID is: "+rs.getString("DeptID"));
					System.out.println("Number of employees in "+rs.getString("DeptID")+" department "+" whose salary greater than 30000: "+rs.getInt("EMPCOUNT"));
				}
			} catch (SQLException e) {
				
					e.printStackTrace();
				}
				
		}}					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	

