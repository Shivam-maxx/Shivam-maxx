
public class S3Question19 extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number::");
		int num,i;
		num=sc.nextInt();
		int fact=1;
		for(i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of number is::"+fact);
	}

}
