package arrays;
import java.util.Scanner;
public class factorialvalue {
void cube(){
	int values[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values");
	int num=sc.nextInt();
	int j=1;
	for(int i=1;i<=num;i++) {
		j*=i;
		System.out.print(" "+j);
	}
	
}
	public static void main(String[] args) {
		factorialvalue f =new factorialvalue();
		f.cube();

	}

}
