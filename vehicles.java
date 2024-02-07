package practice;
import java.util.Scanner;

public class vehicles{
 void maindetails() {
	System.out.println("Main details :");
	System.out.println("          Tyres");
	System.out.println("          lights");
	System.out.println("          Engine");}
 public void colors() 
{	System.out.println("color vereities :");

	System.out.println("          Blue");
	System.out.println("          Red");
	System.out.println("          Black");

 }public class twowheelers extends vehicles{
	  void model() {
		twowheelers sc=new twowheelers(); 
        System.out.println("Enter the Bike model");
        String modelname=sc.toString();
}
 }
	
  
  public static void main(String[]args) {
	 vehicles vc = new vehicles();
	 Scanner ac=new Scanner(System.in);
	  vc.maindetails();
	  vc.colors();
	  vc.tyres();
	  vc.model();
	 
  }

private void model() {
	// TODO Auto-generated method stub
	
}
private void tyres() {
	System.out.println("MRF Tyre must be 2 in each two wheeler.");

}
}
