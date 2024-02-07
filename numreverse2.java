package practice;

public class numreverse2 {

	public static void main(String[] args) {
		int a=36875;
		int i=0;
		while(a>0) {
			i=i*10+a%10;
			a=a/10;
		}
System.out.println(i);
	}

}
