package arrays;
import java.util.Scanner;
public class squareofarr {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int []e= {10};
		System.out.println("Enter the number");
		 //index
		int index=0;
		 for(int i=0;i<e.length;i++) {
			 
		 for(int j=0;j<e.length;j++) {
		  int sqre=0;
          if(e[i]==e[j])
			 {
			  index = i;
			   sqre=e[i]*e[i];
		     }
			System.out.println("Index of element:"+index);
			System.out.println("Square of element:"+sqre);
	     }
			

   }
}
}
