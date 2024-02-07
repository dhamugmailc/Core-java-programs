package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

 public class Paperbook {
	 void front() {

		 String titlepage="computer applications";	
		 System.out.println(titlepage);
			String acknowledge=" Approved by government of tamilnadu";
			int price=150;
			int edition=2018;
			Map<Integer,String> a=new HashMap<>();
			a.put(1,"introduction");
			a.put(2,"number system");
			a.put(3,"operating System");
			a.put(4,"windows");
			
	}


void body() {
	String chapter="1";
	
}
void end() {
	String author="kannan.m";
	
	}
	public static void main(String[] args) {
		Paperbook p=new Paperbook();
		p.front();
		p.body();
		p.end();
		
	}
	

}
