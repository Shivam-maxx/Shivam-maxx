import java.util.Scanner;

public class S2Question10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		int sum=0,i=1;
		num=sc.nextInt();
		while(i<=num) {
			sum=sum+i;
			i++;
		}
		System.out.print(sum);
	}	
}