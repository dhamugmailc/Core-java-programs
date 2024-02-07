package practice;
import java.util.Scanner;
public class vehicle{
 String model,vehiclename;
 int maxspeed;
 void vehicle(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the vehicle name :");
    String vehiclename=sc.nextLine();  
 }
 void model(){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the model name :");
	    String modelname=sc.nextLine();  
 }
 void price(int price){
	 System.out.println("price is :"+price+" lakhs");
 }
 void fuel_capasity(int fuelcap){
	 System.out.println("fuel capasity is :"+fuelcap+" ltrs");
 }
 void milleage(int milleage{
	 System.out.println("milleage is :"+milleage+" kms");
 }
	public static void main(String[] args){
      vehicle vc=new vehicle();
      vc.vehicle();
      truck tc=new truck();
      vc.model();
      vc.price(40);
      vc.fuel_capasity(4000);
      vc.milleage(20);
      tc.maxspeed(120);
      System.out.println("*************************");
      
      vc.vehicle();
      car cr=new car();
      vc.model();
      cr.price(10);
      cr.fuel_capasity(2000);
      cr.milleage(30);
      cr.maxspeed(200);

      System.out.println("***************************");
      vc.vehicle();
      bike bk=new bike();
      vc.model();
      bk.fuel_capasity(500);
      bk.price(2);
      bk.milleage(50);
      bk.maxspeed(200);
      }	
 }
class truck extends vehicle{
	 void maxspeed(int maxspeed){
		System.out.println("maximum speed limit is :"+maxspeed);

	                            }
   }       

class car extends vehicle{
	 void maxspeed(int maxspeed) {
	    System.out.println("maximum speed limit is :"+maxspeed);
                                 }
    }
class bike extends vehicle{
	 void maxspeed(int maxspeed) {
			System.out.println("maximum speed limit is :"+maxspeed);

          }
}