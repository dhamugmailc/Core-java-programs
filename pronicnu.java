package practice;

import java.util.Scanner;

public class pronicnu
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value :");
		int num=scan.nextInt();
		int p=0,y=0;
		for(int i=1;i<num;i++)
		{
			if(i*(i+1)==num)
			{
				p=1;   
				y=i;  
				break;	
			}
		}
			if(p==1) 
			{
				System.out.println("pronic number "+num+"="+y+"*"+(y+1));
			
			}
			else {
				   System.out.println("Not a pronic number");
			     }
	}

}
