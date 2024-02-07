package arrays;

public class minandmax {
	
	
	public static void main(String[] args) {
		int num[]= {40,20,2,80,18};
	    int min=num[0];
		int max=num[0];
		int dif=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max) {
				max=num[i];
			}
			else if(num[i]<=min) {
				min=num[i];
			}
		}dif=max-min;
		System.out.println("Maximum value is :"+max);
		System.out.println("Minimum value is :"+min);
		System.out.println("Difference: "+dif);
	}

}
