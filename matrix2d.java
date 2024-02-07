package arrays;
import java.util.ArrayList;
public class matrix2d {
	public static void main(String[] args) {
		
	
int num[][]={{12,23,43},{4,5,19},{8,7,9}};
int sum=0; 
System.out.println("columns:");
for(int i=0;i<num.length;i++) {
	for(int j=0;j<num.length;j++) {
		System.out.print(num[i][j]+" ");
		sum+=num[i][j];
	}
	System.out.println("sum of column :"+sum);
	System.out.println("---------------------");
	sum=0;
}
System.out.println("rows:");
for(int j=0;j<num.length;j++){

for(int i=0;i<num.length;i++){
		System.out.print(num[j][i]+" ");
		sum+=num[i][j]; 
	}
	
	System.out.println("sum of  row  :"+sum);
	System.out.println("|");
	//System.out.println("");
	sum=0;
}
	}
}



