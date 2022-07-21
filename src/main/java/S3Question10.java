import java.util.Scanner;

public class S3Question10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[6];
		int k=0;
		int c=0,k1=0;
		
		while(num!=0) {
			int d=num%10;
			arr[k1++]=d;
			c++;
			num/=10;
		}
		int i,j;
		for(i=0;i<=c-1;i++) {
			int k2=0;
			for(j=0;j<=c-1;j++) {
				if(arr[i]==arr[j]) {
					k2++;
				}
				else {
					k1++;
				}
			}
			System.out.println(arr[i]+" exist "+k2+" times:");
		}
	}
}
