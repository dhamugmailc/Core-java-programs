package practice;
import java.util.Scanner;

abstract class companyportal{
	 private String name;
	abstract void welcome();
	abstract void raiserequest();
	 void login() {
	 }
	 void showdetails(){
		 System.out.println("show the details ");
	 }
	
}
class employee extends companyportal{

	@Override
	void welcome() {
		System.out.println("Hello!, welcome you, please login here .");
	}

	@Override
	void raiserequest() {
		System.out.println("Raise request for change name.");
		
	}		
	}
	

class DBM extends companyportal{

	@Override
	void welcome() {
		System.out.println("Hello!, welcome you, please login here .");
	}

	@Override
	void raiserequest() {
		System.out.println("Raise request for change employee to another branch.");
		
	}
	
}
interface BM{
	void emtranfer();
}
interface regionalhead{
	void bmtransfer();
}
class hr implements BM,regionalhead{

	

	@Override
	public void emtranfer() {
		// TODO Auto-generated method stub
		System.out.println("* Bm has rights to transfer employee *");	
	}
	@Override
	public void bmtransfer() {
		// TODO Auto-generated method stub
		System.out.println("* Regoinal head has rights to tranfer bm *");
	}
}

 
public class Abstractc extends Exception{
public static void main(String args[]) {
	
	employee em=new employee();
	DBM dm =new DBM();
	em.welcome();
	em.showdetails();
    em.raiserequest();
    System.out.println("---------------------------------------------");
	dm.welcome();
	dm.showdetails();
	dm.raiserequest();
    System.out.println("---------------------------------------------");
   ///hr h=new hr();
   //h.emtranfer();
//System.out.println("----------------------------------------------");
  // h.bmtransfer();

}
}
