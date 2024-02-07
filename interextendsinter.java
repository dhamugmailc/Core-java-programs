package practice;
interface A {
    void details();
    default void loan() {
    	System.out.println("loan");
    }
}

interface B extends A {
    void creditcard();
}
class C implements A,B
{

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interextendsinter {
public static void main(String[] args) {
	A a;
	a=new C();
	a.details();
	a.loan();
	
	
}
}
