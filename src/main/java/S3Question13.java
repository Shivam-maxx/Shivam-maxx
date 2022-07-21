public class S3Question13 {
	public static void main(String[] args) {
	int i=1;
	int sumOfEven=0;
	int sumOfOdd=0;
	int sum=0;
	while(i<=100) {
		sum=sum+i;
		if(i%2==0) {
			sumOfEven+=i;
		}
		else {
			sumOfOdd+=i;
		}
		i+=1;
	}
	System.out.println("Sum of All Even Numbers:"+sumOfEven);
	System.out.println("Sum of All Odd Numbers:"+sumOfOdd);
	}
}
