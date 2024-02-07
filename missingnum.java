package arrays;

public class missingnum {
void missingnum() {
	int num[]= {1,2,4,5,6,8,7};
	int sum1=0,sum2=0;
	for(int i=0;i<num.length;i++) {
		sum1+=num[i];
	}
	for(int i=1;i<=8;i++) {
        sum2+=i;		
	}
	System.out.println("Missing number is :"+(sum2-sum1));
}
public static void main(String[] args) {
		
  missingnum m=new missingnum();
             m.missingnum();

}
}
