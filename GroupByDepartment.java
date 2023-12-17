package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {

	public static void main(String[] args) {
		Employee e1 = new Employee("Kishor","DEV","2222");
		Employee e2 = new Employee("SANDESH","DEV","2222");
		Employee e3 = new Employee("VIJAY","HR","2222");
		Employee e4 = new Employee("GANESH","Sales","2222");
		Employee e5 = new Employee("SACHIN","DEV","2222");
		
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
		
		Map<String,Long> departmentEcount=eList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.print(departmentEcount);
		
	}
}

class Employee{
	String name;
	String department;
	String salary;
	public Employee(String eName,String eDeprt,String eSalary) {
		this.department=eDeprt;
		this.name=eName;
		this.salary=eSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	} 
	
}


