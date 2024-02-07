package practice;

public class star_increase_decrease {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
