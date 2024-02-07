package practice;

public class swapp4variable {

	public static void main(String[] args) {
		        int a=20;
				int b=15;
				int c=30;
				int d=12;
			
				System.out.println("Before swaping:");
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
				
				a=c-b;
				b=b+a;
				c=(b+d)-b;
		        d=(b*c)/(b-c);
				System.out.println("after swaping:");
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
				
			}
}
