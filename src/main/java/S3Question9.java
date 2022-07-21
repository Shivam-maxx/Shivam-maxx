import java.util.Scanner;

public class S3Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check wether number is pelindrome or not:");
		num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		if(rev==num1) {
			System.out.println(num1+" Number is pelindrome:");
		}
		else {
			System.out.println(num1+" Number is not pelindrome:");
		}
	}

}
