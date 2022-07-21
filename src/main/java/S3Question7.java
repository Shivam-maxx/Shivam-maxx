import java.util.Scanner;

public class S3Question7 {
	public static void main(String[] args) {
		System.out.println("Enetr The Number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[6];
		int c=0;
		int k=0;
		while(num!=0) {
			int d=0;
			d=num%10;
			num=num/10;
			c++;
			arr[k]=d;
			k=k+1;
		}
		int Sum=arr[0]+arr[c-1];
		System.out.print("Number of Digit: "+c+"\nFirst Digit: "+arr[c-1]+"\nLast Digit: "+arr[0]+"\nSum of First and Last digit: "+Sum);
	}

}
