package practice;

interface manager{
	
 void employeetransfer();	
	static void loandetails() {
		System.out.println("loan payments");
	}
}
interface regionalhead{
	void managertransfer();
	default void salesheadtrans() {
		System.out.println("we can define body by using defualt method");
	}
	
}
class zonalhead implements manager,regionalhead{

	@Override
	public void managertransfer() {
		System.out.println("poonamalee");
		
	}

	@Override
	public void employeetransfer() {
		System.out.println("porur");
		
	}
	
}
public class interfaceforexample {
public static void main(String[] args) {
	zonalhead z=new zonalhead();
	z.managertransfer();
	z.employeetransfer();
}
}
