package collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	int age;
	double salary;
	public Employee(String name,int age,double salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
}
public class Averagesalary {

	public static void main(String[] args) {
		List<Employee>e=new ArrayList<>();
		e.add(new Employee("dhamu",21,25000));
		e.add(new Employee("arun",35,250000));
		e.add(new Employee("kiran",40,205000));
		e.add(new Employee("rawat",38,225000));
		e.add(new Employee("divan",25,30000));
		 
		int sum=0;
		int cnt=0;
		for(Employee em:e) {
			if(em.age>30) {
				sum+=em.salary;
				cnt++;
			}
		}if(cnt>0) {
			int avg=sum/cnt;
			System.out.println("The average salary above of 30 age -> "+avg);
		}
		else {
			System.out.println("No employess older than 30");
		}
	}

}
