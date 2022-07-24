public class ARMSTRONG extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int k=num;
		int num1=k;
		int num2=k;
		int sum=0,c=0;
		while(k!=0) {
			c++;
			k/=10;
		}
		while(num1!=0) {
			int d=0;
			d=num1%10;
			int sum1=1;
			for(int i=1;i<=c;i++) {
				sum1=sum1*d;
			}
			sum=sum+sum1;
			num1=num1/10;
		}
		if(num2==sum) {
			System.out.println("Armstrong:");
		}
		else {
			System.out.println("Not Armstrong:");
		}
	}

}
