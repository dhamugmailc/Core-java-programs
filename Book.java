package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class paperbook {
	
	 void front() {
		    String titlepage="computer applications";
			String acknowledge="Approved by government of tamilnadu";
			int price=150;
			int edition=2018;
		 System.out.println("Front page :-");
			Map<Integer,String> a=new HashMap<>();
			a.put(1,"introduction");
			a.put(2,"number system");
			
			System.out.println("Titlepage: "+titlepage);
			System.out.println("acknowledge: "+acknowledge);
			System.out.println("price: "+ price);
			System.out.println("edition: "+edition);
			System.out.println("Table contents: ");
			System.out.println(a);
			
			
	}
void body() {
	String chapter1="introduction=> we are learn computer to store our data and do several opeation in it";
	String chapter2="number system=> In computer we have number system and also alphabets";
	System.out.println("Body of book :-");
	System.out.println();
	System.out.println("Chapter 1: "+chapter1);
	System.out.println("Chapter 2: "+chapter2);
	System.out.println();
	System.out.println("*********************************");
}
void end() {
	System.out.println("Author names:");
	System.out.println();
	List<String>a=new ArrayList<>();
	a.add("kannan.m");
	a.add("mr.ramkrishnan");
	a.add("mr.mohandas");
	System.out.println(a);
	System.out.println();
	System.out.println("experts:");
	List<String>b=new ArrayList<>();
	b.add("mr.kavin");
	b.add("mr.radha");
	b.add("mr.mohankumar");
	System.out.println(b);
	System.out.println();
	System.out.println("*********************************");

	}
}
 class ebook extends paperbook{
	
	public void front2() {
		 Map<Integer,String> a=new HashMap<>();
			
			a.put(3,"operating System");
			a.put(4,"windows");
			//System.out.println("ta");
			System.out.print(a);
		
	}
 }
 class audio_vedio extends ebook{
	 
	 
	public void front3() {
		Map<Integer,String> a=new HashMap<>();
		a.put(5,"linux");
		a.put(6,"word processor");
		//System.out.println("ta");
		System.out.println(a);
		
	}
		
		
 }

public class Book {

	public static void main(String[] args) {
   /* paperbook p=new paperbook();
	p.front();
	p.body();
	p.end();*/
	/*ebook e=new ebook();
	e.front();
	e.front2();*/
	audio_vedio a=new audio_vedio();
	a.front();
	a.front2();
	a.front3();
	
	}

}
