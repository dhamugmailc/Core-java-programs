package practice;

//package practice;
import java.util.Scanner;
abstract  class vehiclemanufacture{

abstract void lights();
abstract void engine();
}
class twoWheelers extends vehiclemanufacture{
	 void colorVarities() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Color's Choice: ");
			int choice = sc.nextInt();
			String colors = null;
			switch (choice) {
			case 1:
				colors = "BLACK";
				break;
			case 2:
				colors = "WHITE";
				break;
			case 3:
				colors = "RED";
				break;
			case 4:
				colors = "BLUE";
				break;
			}
			System.out.println("Twowheeler's color: " + colors);
		}
	

	void lights() {
		// TODO Auto-generated method stub
		System.out.println("Xenon and LED lights");
	}
	void engine() {
		// TODO Auto-generated method stub
		System.out.println("straight-twin engine ");
	}
	void tyres() {
		System.out.println("MRF tyres ");
	}
	void costs(int c, int l, int e, int t) {
		int Selected_products = c + l + e + t;
		System.out.println("COST OF ALL PRODUCTS: " + Selected_products + " rupees");
	}
}
class fourWheelers extends vehiclemanufacture {
	void colorVarities() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Color's Choice: ");
		int choice = sc.nextInt();
		String colors = null;
		switch (choice) {
		case 1:
			colors = "BLACK";
			break;
		case 2:
			colors = "WHITE";
			break;
		case 3:
			colors = "RED";
			break;
		case 4:
			colors = "BLUE";
			break;
		}
		System.out.println("fourwheeler's color: " + colors);
	}
	void lights() {
	
		System.out.println("DRL and fog lights");
	}
	void engine() {
		System.out.println("DSL engine");
	}
	void tyres() {
		System.out.println("MRF tyres includes spare tyre ");
	}
	void windows() {
		System.out.println("Front and rear windows includes sun shade");
	}
	void costs(int c, int l, int e, int t, int w) {
		int Selected_products = c + l + e + t + w;
		System.out.println("COST OF ALL PRODUCTS: " + Selected_products + " rupees");
	}
}

class bikee extends twoWheelers {
	void selectBike() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Bike's brand choice: ");
		int choice = sc.nextInt();
		String brand=null;
		switch (choice) {
		case 1:
			brand = "bajaj";
			break;
		case 2:
			brand = "ROYAL ENFIELD";
			break;
		case 3:
			brand = "YAMAHA";
			break;
		case 4:
			brand = "HONDA";
			break;
		}
		System.out.println("Bike's brand: " + brand);
	}
}
class cars extends fourWheelers {
	void selectCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your car's brand name: ");
		int choice = sc.nextInt();
		String brand = null;
		switch (choice) {
		case 1:
			brand = "BMW";
			break;
		case 2:
			brand = "MARUTI SUZUKI";
			break;
		case 3:
			brand = "MERCEDES";
			break;
		case 4:
			brand = "TATA INNOVA";
			break;
		case 5:
			brand = "SKODA";
			break;
		}
		
	System.out.println("Cars brand: "+brand);
			
	}
}
		public class vehicless { 
			
		
		public static void main(String[] args) {
			bikee b = new bikee();
			b.selectBike();
			System.out.println("*Product Orders*");
			b.lights();
			b.engine();
			b.tyres();
			b.colorVarities();
			b.costs(2000, 1000, 52000, 1500);
			// twoWheelers tw=new twoWheelers();
			System.out.println("========================================");
			cars c = new cars();
			// fourWheelers fw=new fourWheelers();
			c.selectCar();
			System.out.println("*Product Orders*");
			c.colorVarities();
			c.lights();
			c.engine();
			c.tyres();
			c.windows();
			c.costs(4000, 2500, 78000, 6000, 5000);
		}

		
 }


