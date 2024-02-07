package practice;

public class binarysquareroot {
	

public static int binarys(int num[],int t,int r ,int l) {
	while(l<=r) {
	int mid=l+(r-l)/2;
	//mid[];
	 int ans;
	ans=(int)Math.sqrt(t);
	if(num[mid]==t) {
    return mid;
	}
	if(t<num[mid]) {
		ans=mid;
	l=mid+1;
	
	}
	else {
	r=mid-1;
	}
	} 
	//int ans;
	return -1;
	//return mid(arr.length-1);
}
	
	public static void main(String[] args){
		int num[]= {-1,0,3,5,8,12};
		int n=num.length;
		int t=8;
		int s=binarys(num,t,n-1,0);
		//int mid=0;
		if(s==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found squareroot is :"+num);
		
	//System.out.println();	

}
}
