package arrays;

public class buy_and_sell {

	public static void main(String[] args) {
    int price[]= { 20,50,70,85,90};
    int n=price.length;
    int profit=0;
    for(int i=1;i<n;i++) {
    	if(price[i-1]<price[i]) {
    		profit+=price[i]-price[i-1];
    		System.out.println(price[i-1]+" "+price[i]+" "+profit);
    	}
    	//profit=0;
    }
    System.out.println("highest profit is :"+profit);
	}

}
