import java.util.Scanner;

public class S2Question3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		if(Num1>0) {
			System.out.println("NumBer is Positive "+Num1);
		}
		else if(Num1==0) {
			System.out.println("NumBer Is Zero "+ Num1);
		}
		else {
			System.out.println("NumBer is Negeative "+ Num1);
		}
	}
}