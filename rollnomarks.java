package arrays;
import java.util.Scanner;
public class rollnomarks {
	void roll()
	{
	//int j=0;
	//int marks[]=new int[3];
	String stu[]= new String[5];
	 int submarks[]=new int[3];
	Scanner sc=new Scanner(System.in);
	//System.out.println(" Marks :-");
	 int sum=0,avg=0;
	for(int j=0;j<stu.length;j++){
	  System.out.print("student name"+(j+1)+":");
      String name=sc.next();
      System.out.println("Roll no:");
      int rollno=sc.nextInt();
      int i;
      for(i=0;i<submarks.length;i++) {
    		System.out.print("subject"+(i+1)+":");
    		submarks[i]=sc.nextInt();
    		sum+=submarks[i];//sum=sum+submarks =0+30+80+90 
         }
	  avg=sum/submarks.length;
      System.out.println("*sum of all subjects\t\taverage");
	  System.out.println("\t\t"+sum+"\t=\t"+avg+" \t\t");
			sum=0;
			 //int i = 0;
			 //System.out.println("\t"+marks[j]+"\t\t"+marks[j]);
             //System.out.println("Average marks : "+avg);
             //System.out.println("sum of all subjects : "+ sum);
			 //int k=submarks[i];
	 }
  }

	public static void main(String[]args) {
		rollnomarks rm=new rollnomarks();
		rm.roll();
	}
}

