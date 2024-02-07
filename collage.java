package practice;

import java.util.Scanner;

abstract class departments{
	 private String name;
	abstract void student1();
	abstract void student2();
	 
	
}
class commerce extends departments{

	@Override
	void student1() {
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[6];
		float total=0,avg=0;
		System.out.println("commerce student1");
		for(int i=0;i<3 ;i++) {
		System.out.println("Enter subject"+(1+i)+" mark  :" );	
		 int n = 0;
		marks[n]=sc.nextFloat();
		 total=total+marks[n];
       }
		 System.out.println(total);

	}

	@Override
	void student2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[6];
		float total=0,avg=0;
		System.out.println("commerce student2");
		for(int i=0;i<3 ;i++) {
		System.out.println("Enter subject"+(1+i)+" mark  :" );	
		 int n = 0;
		marks[n]=sc.nextFloat();
		 total=total+marks[n];

	}
		 System.out.println(total);

	
	}

}
	

class science extends departments{

	@Override
	void student1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[6];
		float total=0,avg=0;
		System.out.println("science student1");
		for(int i=0;i<3 ;i++) {
		System.out.println("Enter subject"+(1+i)+" mark  :" );	
		 int n = 0;
		marks[n]=sc.nextFloat();
		 total=total+marks[n];

	}
		 System.out.println(total);

		
	}


	@Override
	void student2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[6];
		float total=0,avg=0;
		System.out.println("science student2");
		for(int i=0;i<3 ;i++) {
		System.out.println("Enter subject"+(1+i)+" marks  :" );	
		 int n = 0;
		marks[n]=sc.nextFloat();
		 total=total+marks[n];
	}

		System.out.println(total);

	
}
}

public class collage {
	
	public static void main(String[] args) {
		commerce c=new commerce();
		c.student1();
		System.out.println("**************************");
		science s=new science();
		c.student2();

	}
}


