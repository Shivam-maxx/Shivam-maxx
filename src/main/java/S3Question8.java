import java.util.Scanner;

public class S3Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr The Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[6];
		int Rev=0;
		int prod=1;
		int c=0;
		int k=0;
		int num1=num;
		while(num!=0) {
			int d=0;
			d=num%10;
			Rev=(Rev*10)+d;
			prod*=d;
			num=num/10;
			c++;
			arr[k]=d;
			k+=1;
		}
		System.out.print("Previous Number: "+num1+"\nFirst Digit: "+arr[c-1]+"\nLast Digit: "+arr[0]+"\nReverse Of Nummber: "+Rev+"\nprduct of the number:"+prod);
		int temp=arr[0];
		arr[0]=arr[c-1];
		arr[c-1]=temp;
		System.out.print("\nAter Swap:\n"+"First Digit:"+arr[c-1]+"Last Digit"+arr[0]);
	}

}
