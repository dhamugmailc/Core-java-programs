package practice;

abstract class portal{
	// private String n;
	abstract void welcome();
	abstract void raiserequest();
	 void showdetails(){
		 System.out.println("show the details ");
	 }
	
}
class teller extends portal{

	@Override
	void welcome() {
		System.out.println("Hello!, welcome you, please login here .");
	}

	@Override
	void raiserequest() {
		System.out.println("Raise request for change name.");
		
	}
	
}
class deputy extends teller {

	void loandetails() {
		System.out.println("loan deatails of customer");
	}
	
}
interface manager{
	void emtranfer();
}
interface rh{
	void bmtransfer();
	default void accountdetails(){
		System.out.println("account details of the customers ");
	}
}
class sthead extends deputy implements manager,rh{
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

 



public class Interface {
public static void main(String[]args) {
	
	teller em=new teller();
	deputy dm =new deputy();
	em.welcome();
	em.showdetails();
    em.raiserequest();
    System.out.println("---------------------------------------------");
	dm.welcome();
	dm.showdetails();
	dm.raiserequest();
    System.out.println("---------------------------------------------");
   sthead h=new sthead();
   h.emtranfer();
   h.showdetails();
   h.loandetails();
System.out.println("----------------------------------------------");
   h.bmtransfer();
   h.raiserequest();
   h.accountdetails();
	
}
}
