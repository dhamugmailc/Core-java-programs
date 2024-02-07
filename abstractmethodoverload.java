package practice;
abstract class c{
	abstract void salarycal();
}
class m extends c{
void salarycal(int annualsal,int months) {
		
		System.out.println("PERMONTH SALARY             :"+annualsal/months);
		
	}
	void salarycal(int pma,int dim,int bo ,int annualsal) {
		
		System.out.println("PERDAY SALARY               :"+pma/dim);
		
		System.out.println("THIS MONTH SALARY WITH BONUS:"+((annualsal/bo)+pma));
		
	}
	@Override
	void salarycal() {
		// TODO Auto-generated method stub
		
	}
	
}
public class abstractmethodoverload {

	public static void main(String[] args) {
		m d=new m();
		//	System.out.println("annual sal,months,");
			d.salarycal(450000,12);
			d.salarycal(37500,30,8,450000);

	}

}
