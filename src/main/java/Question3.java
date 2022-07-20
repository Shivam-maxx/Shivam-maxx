import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Length= sc.nextInt();
		int Breadth=sc.nextInt();
		int Parameter=2*Length*Breadth;
		System.out.print(Parameter);
		int Area=Length*Breadth;
		System.out.print(Area);
	}
}