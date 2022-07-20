import java.util.Scanner;

public class question7{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int TempInCel=sc.nextInt();
		int TempInFahr1=sc.nextInt();
		double convertInFahr = (TempInCel*9/5)+32;
		double convertInTemp = (TempInFahr1-32)*5/9;
		System.out.print(convertInFahr + " " + convertInTemp);
	}
}