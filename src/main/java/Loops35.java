import java.util.Scanner;

public class Loops35 
{

	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 while(n!=0) {
				int a=n;
				int sum=0;
				while(a!=0)
				{
					int c=0,d=1;
					c=a%10; 
					for(int i = 1;i<=c;i++) 
					{
					d = d * i;
					}
					sum = sum + d;
					a=a/10;
				}
				if(sum==n)
				{
				System.out.print(n+" ");
				}
				n--;
		 }
	}
	}
}