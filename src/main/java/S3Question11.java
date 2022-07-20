import java.util.Scanner;

public class S3Question11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter The Number:");
		number=sc.nextInt();
		while(number>=1) {
			System.out.print(number + " ");
			number--;
		}
	}
}
