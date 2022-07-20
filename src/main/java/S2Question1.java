import java.util.Scanner;

public class S2Question1{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		int Num2=sc.nextInt();
		int Num3=sc.nextInt();
		if(Num1>Num2 && Num1>Num3) {
			System.out.println(Num1);
		}
		else if(Num2>Num1 && Num2>Num3) {
			System.out.println(Num2);
		}
		else {
			System.out.println(Num3);
		}
	}
}