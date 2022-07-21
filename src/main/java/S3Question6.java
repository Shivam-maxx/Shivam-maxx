import java.util.Scanner;

public class S3Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		int number=sc.nextInt();
		System.out.println("Table Of "+ number);
		while(i<=10) {
			System.out.print(i*number + " ");
			i++;
		}
	}
}
