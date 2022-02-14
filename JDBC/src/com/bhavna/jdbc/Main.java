package com.bhavna.jdbc;

import java.sql.Date;
import java.util.Scanner;


//Create Employee,Department tables in DB, Should create the relations PrimaryKey ,foreign key
//with these tables and make sure use data types like bigint,varchar,date/datetime.
//
//1.fetch the data emplyeeid,employee name,employee sal,joining date of emp ,deptid, dept name using jdbc
//2.save employee and department tables using jdbc
//3.updating the employee table using jdbc
//4. write a query for find the number of employees in each department  
//whose employee sal  greater than 30000.(fetch coulms dept name,count of emplyee)

public class Main {
	public static void main(String[] args) {
		EmpDatabase ed=new EmpDatabase();
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, Select an option");
			System.out.println("1. Do you want to enter Employee record");
			System.out.println("2. Do you want to enter Department record");
			System.out.println("3. Fetch all Employee data along with dept details");
			System.out.println("4. To update employee");
			System.out.println("5. get emp count having sal>30000 ");
			System.out.println("6. Close SQL Connection");
			ed.selectByOption(scanner.nextInt());

			
}
	}


