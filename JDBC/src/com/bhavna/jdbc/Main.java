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
		EmpDatabase eb=new EmpDatabase();
		EmpDatabase.connectToDB();
		char status = 'Y';
		Employee emp=new Employee();
		Scanner scanner = new Scanner(System.in);
		eb.fetchEmpData();
		do {
			System.out.println("Welcome, Select an option");
			System.out.println("1. Do you want to enter Employee record");
			System.out.println("2. Do you want to enter Department record");
			System.out.println("3. Fetch all Employee data along with dept details");
			System.out.println("4. get emp count having sal>30000");
			System.out.println("5. Close SQL Connection");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1: {
				System.out.println("How many records do you want to enter");
				int n = scanner.nextInt();
				scanner.nextLine();
				for(int i=0; i<n; i++)
				{	
				
					
					System.out.println("Enter Employee ID");
					emp.setEmpId(scanner.nextInt());
					if(EmpDatabase.isEmployeePresent(emp.getEmpId())) {
						System.out.println("EmployeeID "+emp.getEmpId()+" is already present.");
						continue;
					}
					System.out.println("Enter Employee name");
					emp.setEmpName(scanner.next());
					System.out.println("Enter Salary of Employee");
					emp.setEmpSal(scanner.nextInt());
					System.out.println("Enter Employee DOJ");
					emp.setDoj(scanner.next());
					System.out.println("Enter Department ID to which employee belongs to");
					String deptId = scanner.next();
					scanner.nextLine();
					if(EmpDatabase.isDeptPresent(deptId))
					{
						emp.setDeptId(deptId);
						EmpDatabase.addEmployee(emp);
					}
					else
					{
						System.out.println("Invalid Department");
						System.out.println("Do you want to create a Department Y/N");
						status = scanner.nextLine().charAt(0);
						if(status == 'Y' || status == 'y' )
						{
							System.out.println("Enter Department name");
							emp.setDeptName(scanner.next());
							emp.setDeptId(deptId);
							EmpDatabase.addDept(emp);
							
							EmpDatabase.addEmployee(emp);
						}
					}
				}
				System.out.println("Do you want to return to main menu Y/N");
				status = scanner.nextLine().charAt(0);
				break;
			}
			case 2: {
				System.out.println("How many records do you want to enter");
				int n = scanner.nextInt();
				scanner.nextLine();
				for(int i=0; i<n; i++)
				{
					System.out.println("Enter Department name");
					String name = scanner.next();
					System.out.println("Enter Department ID");
					String deptId = scanner.next();
					scanner.nextLine();
					if(EmpDatabase.isDeptPresent(deptId)) {
						System.out.println("DeptID "+deptId+" is already exist");
						continue;
					}
					EmpDatabase.addDept(emp);
					
				}
				System.out.println("Do you want to return to main menu Y/N");
				status = scanner.nextLine().charAt(0);
				break;
			}
			case 3:{
				eb.fetchEmpData();
				System.out.println("Do you want to return to main menu Y/N");
				status = scanner.nextLine().charAt(0);
				break;
				
			}
			case 4:{
				eb.empSalDetails();
				System.out.println("Do you want to return to main menu Y/N");
				status = scanner.nextLine().charAt(0);
				break;
				
			}
			case 5: {
				EmpDatabase.close();
				status='N';
				break;
			}
			default:
				System.out.println("Invalid Option");
				System.out.println("Choose an option");
			}
			System.out.println();
		}while(status == 'Y' || status == 'y');
		scanner.close();
		System.out.println("Thank you");

}
	}

