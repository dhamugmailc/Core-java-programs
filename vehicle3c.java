package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class vehicleproject{
	private String  name;
	private String modelname;
	private double price;
	private String specification;
	private String colors;	
		
	public vehicleproject(String  name,String modelname,double price,String specification,String colors){
	this.name=name;
	this.modelname=modelname;
	this.specification=specification;
	this.price=price;
	this.colors=colors;
	} 
	/*public void setname(String name) {
		this.name=name;
	}*/
	
	public String getname(){
		return name;
	}
	public String getmodelname(){
		return modelname;
	}
	public double getprice(){
		return price;
	}
	public  String getspecification() {
		return specification;
	}
	public String getcolors() {
		return colors;
	}
}

public class vehicle3c {

	public static void main(String[] args) {
		
		 List< vehicleproject>vc =new ArrayList<>();
	     vc.add(new vehicleproject("royal enfield","classic 350",224500,"millage 40 kms ","red ,nevy blue , grey"));
	     vc.add(new vehicleproject("bajaj","pulsar 150",124500,"millage 60kms ","red ,blue ,black "));
	     vc.add(new vehicleproject("bajaj","pulsar ns200",134500,"millage 50kms ","red ,blue ,black "));
	     vc.add(new vehicleproject("yamaha","rx 125",120000,"millage 50kms ","red ,black "));
	     vc.add(new vehicleproject("honda","splender",70000,"millage 50kms ","red ,black,blue"));
	     vc.add(new vehicleproject("royal enfield","hunter 350",150000,"millage 40kms ","red ,black,blue "));
	     vc.add(new vehicleproject("tvs","apache 150",130000,"millage 60kms ","red ,black,blue,white,green "));
	     vc.add(new vehicleproject("honda","shine",77378.50,"millage 80kms ","red ,black "));
	     vc.add(new vehicleproject("ola","electric s1",100000,"millage 100kms ","red ,black,blue,yellow "));
        	  
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the vehicle name of two wheeler:");
	     String vehiclename=sc.nextLine();
	     System.out.println("Enter the model name :");
	     String model=sc.nextLine();
	     String n="";
	     String mn="";
	     double p=0;
	     String sp="";
	     String c="";
	     
	     for(vehicleproject v:vc) {
	    	 //if(v.getname().equals(vehiclename)) {
	    		 if(v.getname().equals(vehiclename)&&v.getmodelname().equals(model)) { 
	    		 /*System.out.println(v.price);
	    		 System.out.println(v.specification);
	    		 System.out.println(v.colors);*/
	    		 n=v.getname();
	    		 mn=v.getmodelname();
	    		 p=v.getprice();
	    		 sp=v.getspecification();
	    		c= v.getcolors();
	    	 }	       	
	     }
	     
	     if(!n.isEmpty()) {
	    	 System.out.println("This is :"+n+" "+mn);
	      // System.out.println("model: "+mn);
	    	 System.out.println("price: "+p);
	    	 System.out.println("specification: "+sp);
	    	 System.out.println("color varieties: "+c);
	     
	     }else {
	    	 System.out.println("not found");
	     }
	     
	}
}


