package collection;

import java.util.ArrayList;
import java.util.List;

class employe{
	String name;
	String depart;
	int salary;
	public employe(String name,String depart,int salary) {
		this.depart=depart;
		this.name=name;
		this.salary=salary;
	}
	String getname() {
		return name;
			}
	String getdepart() {
		return depart;
	}
	int getsalary() {
		return salary;
		
	}
	
}
public class highestsalarylist {

	public static void main(String[] args) {
		List<employe>em=new ArrayList<>();
		em.add(new employe("ram", "HR", 100000));
		em.add(new employe("dhamu","manager",40000));
		int high=0;
		String n="";
		String n2="";
		for(employe e:em) {
			if(e.getsalary()>high) {
				high=e.getsalary();
				 n=e.getname();
				 n2=e.getdepart();
			}
		}
		System.out.println("*"+n+" get highest salary of: Rs."+high);
		System.out.println("*"+n+" is in '"+n2+"' department");

	}

}
