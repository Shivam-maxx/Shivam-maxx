import java.util.Scanner;

public class Question5{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Radius= sc.nextInt();
		int Dimeter=2*Radius;
		double Circumfarence=2*3.14*Radius;
		double Area=3.14*Radius*Radius;
		System.out.print(Dimeter + " " +Circumfarence + " " + Area);
	}
}