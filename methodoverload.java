package practice;

 public class methodoverload {
	 public void methodoverload() {
		 
	 }
	
	void salarycal(int annualsal,int months) {
		
		System.out.println("PERMONTH SALARY             :"+annualsal/months);
		
	}
	void salarycal(int pma,int dim,int bo ,int annualsal) {
		
		System.out.println("PERDAY SALARY               :"+pma/dim);
		
		System.out.println("THIS MONTH SALARY WITH BONUS:"+((annualsal/bo)+pma));
		
	}
	
	
	public static void main(String args[]) {
		
		//Scanner f=new Scanner(System.in);
		
		methodoverload d=new methodoverload();
	//	System.out.println("annual sal,months,");
		d.salarycal(450000,12);
		d.salarycal(37500,30,8,450000);
		
				
	}

}
