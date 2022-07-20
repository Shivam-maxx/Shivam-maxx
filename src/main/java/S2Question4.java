import java.util.Scanner;

public class S2Question4{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		if(Num1%2==0) {
			System.out.println("Number is Even " + Num1);
		}
		else {
			System.out.println("Number Is odd " + Num1);
		}
	}
}