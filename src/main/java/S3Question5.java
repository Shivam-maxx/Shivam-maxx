import java.util.Scanner;

public class S3Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int Sum=0;
		System.out.println("All the natural number:");
		while(i<=num){
			System.out.print(i + " ");
			i++;
			Sum=Sum+i;
		}
		System.out.println("\nSum of All the natural number:"+ Sum);
	}
}
