package com.bhavna.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {
	
	 static List<Employee> list=new ArrayList<Employee>();
	  {
		 list.add(new Employee("Ravi",27000,"Hyderabad"));
		 list.add(new Employee("Keerthana",47986.87,"Noida"));
		 list.add(new Employee("Vivek",65911.62,"Banglore"));
		 list.add(new Employee("Gayathri",34690,"Chennai"));
		 list.add(new Employee("Sathish",55035,"Noida"));
		 list.add(new Employee("Krishna",29911.80,"Hyderabad"));
		 list.add(new Employee("Salman",109782.54,"Chennai"));
		 list.add(new Employee("Rudra",36964,"Banglore"));
		 list.add(new Employee("Ramana",72360,"Hyderabad"));	 
	 }
	public void empDetails() {
		//*.Using Streams find the employee count whose name starts with "S"
		List names=list.stream().filter(d->d.empName.startsWith("S")).collect(Collectors.toList());
		System.out.println("The number of employee whose name starts with \"S\" are "+names.size()+" and the details of them are "+"\n"+names);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		//*.Using Parallel Stream Print all the Employees with location "Hyderabad"
		List details=list.parallelStream().filter(d->d.location.contains("Hyderabad")).collect(Collectors.toList());
		System.out.println("Employee with location \"Hyderabad\""+"\n"+details);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		//		*.Get Location and employees in that location output : Map<String, List<Employees>> 
		//		ex : key : "Hyderabad" value : Employees who reside in 	 Hyderabad
		System.out.println("The details of the employee who reside in a particular location ");
		Map<String, List<Employee>>  groupByLocationMap = 
					list.stream().collect(Collectors.groupingBy(Employee::getLocation));
		System.out.println(groupByLocationMap);
		System.out.println("--------------------------------------------------------");
		System.out.println();


		//*.Using Streams Check if any Employee's Salary is > 100000
//		details= list.stream().anyMatch(m->m.salary>100000)
		if(list.stream().anyMatch(m->m.salary>100000))
			System.out.println("There is atleast one  employee with sal greater than 100000");
		else
			System.out.println("No records found");
		System.out.println("--------------------------------------------------------");

		//* Using Lambds's Write a logic to sort EmployeeList based on Name 
		System.out.println("Sorting by Name");
		list.sort((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		System.out.println(list);

		//* Using Lambds's Write a logic to sort EmployeeList based on location
		System.out.println("Sorting by Location");
		list.sort((e1,e2)->e1.getLocation() .compareTo(e2.getLocation()));
		System.out.println(list);

		
	}
}

























