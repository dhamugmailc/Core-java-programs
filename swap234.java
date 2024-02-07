package practice;

public class swap234 {

	public static void main(String[] args) {
	int a=2;
	int b=3;
	int c=4;
	
	a=a+b+c;
	b=a-(b+c);
	c=a-(b+c);
	a=a-(b+c);
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

}
