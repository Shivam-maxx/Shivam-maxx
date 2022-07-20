import java.util.Scanner;

public class S2Question7{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		if(Num1%4==0) {
			if(Num1%100==0) {
				if(Num1%400==0) {
					System.out.println(Num1+" Leap Year:");
				}
				else {
					System.out.println(Num1+" Not Leap Year:" );
				}
			}
			else {
				System.out.println(Num1+" Not Leap Year:" );
			}
		}
		else {
			System.out.println(Num1+" Not Leap Year:" );
		}
	}
}