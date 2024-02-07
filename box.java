package practice;

public class box {
	  void volume() {
		System.out.println("no volume");
	}
	void volume(int l,int b, int h) {
		int vol=l*b*h;
		System.out.println("volume of box :"+vol);
	}
	void volume(double l,double b) {
		double length_breadth =l*b;
		System.out.println(length_breadth );
	}
	public static void main(String[] args) {
	box b=new box();
	b.volume();
	b.volume(4.0,4.0);
	b.volume(5,5,5);
	}

	

}
