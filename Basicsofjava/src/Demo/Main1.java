package Demo;


import java.util.Collections;
import java.util.*;

import java.util.Scanner;

public class Main1{
	
	
	public static void main(String[] args) {
		int k1;
		// TODO Auto-generated method stub
		List<Employee> e1=new ArrayList<Employee>();
		
		e1.add(new Employee(1,"Krishiv",10000));
		e1.add(new Employee(2,"Nishta",18000));
		e1.add(new Employee(3,"Monika",12000));
		e1.add(new Employee(4,"Koustabh",22000));
		Collections.sort(e1);
		for(Employee x:e1)
		{
			System.out.println("Name="+x.getName()+"Id="+x.getId()+"salary"+x.getSalary());
		}
	
	}
}
	
	
class 	Employee implements Comparable<Employee>
	{
		int id;
		String name;
		int salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public Employee() {
			
			// TODO Auto-generated constructor stub
		}
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			
			if(salary==o.getSalary())
			return 0;
			else if(salary >o.getSalary())
				return 1;
			else
			return	-1;
		}
		
		
		
	}

	

