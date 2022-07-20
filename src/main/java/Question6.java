import java.util.Scanner;

public class Question6{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lengthInCenti= sc.nextInt();
		double lengthInMeter= (lengthInCenti/100);
		double lengthInKiloMeter=(lengthInCenti/10000);
		System.out.print(lengthInMeter + " " +lengthInKiloMeter );
	}
}