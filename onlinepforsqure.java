package arrays;

public class onlinepforsqure {
	public static void main(String[] args) {
       
        int[] num = {5, 8, 12, 3, 7, 10, 6, 15};
        System.out.println("Element Index  Square");
        for (int i = 0; i <num.length; i++) {
            int element = num[i];
            int square = element * element;
            System.out.println( element+ "\t" + i + "\t" + square);
        }
    }
}
