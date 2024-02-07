package arrays;
import java.util.Scanner;
public class marksroll {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int roll_no = 3;
			int subjects = 3;

			int stuno[][] = new int[roll_no][subjects];
			int rollnum[] = new int[roll_no];

			for (int i = 0; i < roll_no; i++) {
				System.out.print("Enter Roll Number:");
				int s1 = sc.nextInt();

				for (int j = 0; j < subjects; j++) {
					System.out.print("Enter " + (j + 1) + " Subject mark: ");
					int s = sc.nextInt();

				}
				System.out.println("-----------------");
			}
			for (int i = 0; i < roll_no; i++) {
				int totalMarks = 0, avg;
				System.out.println("Roll Number:" + rollnum[i]);
				for (int j = 0; j < subjects; j++) {

					totalMarks = stuno[i][j] + stuno[i][j];

				}
				avg = totalMarks / subjects;
				System.out.println("Total Mark: " + totalMarks);
				System.out.println("Average: " + avg);
			
				
			}

		}

	}

