package arrays;
import java.util.Scanner;
public class evenindexodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num = new int[20];
        int evenS = 0;
        int oddS = 0;
        System.out.print("Enter required Array elements: ");
        int elements=s.nextInt();
       for (int i = 0; i < elements; i++) {
       	num[i] = i + 1;
        }
        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i] + " ");
            if (i % 2 == 0) {
                evenS += num[i];
            } else {
                oddS += num[i];
            }
        }
        System.out.println();
        System.out.println("Sum of elements at even indexes: " + evenS);
        System.out.println("Sum of elements at odd indexes: " + oddS);
    }
}
