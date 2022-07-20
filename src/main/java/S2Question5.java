import java.util.Scanner;

public class S2Question5{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		if(Num1%5==0 && Num1%11==0) {
			System.out.println("Number is Divisible " + Num1);
		}
		else {
			System.out.println("Number Is Not Divisible " + Num1);
		}
	}
}