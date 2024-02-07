package collection;

public class buysell2 {

	public static void main(String[] args) {
    int price[]= { 20,50,70,85,90};
    int n=price.length;
    int profits=0;
	int highprofit=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    		if(price[i]<price[j]){
    			profits=price[j]-price[i];
//    			System.out.println(price[i]+" "+price[j]+" "+profits);

				if(profits>highprofit) {
    	    				highprofit=profits;	
    		}	
    		}
    	}
    }
	//System.out.println(profits);
    System.out.println("highest profit is: "+highprofit);
	}

}
