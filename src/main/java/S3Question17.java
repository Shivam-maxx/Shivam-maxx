
public class S3Question17 extends main{
	public static void main(String[] args) {
		System.out.println("Enter the number::");
		int num=sc.nextInt();	
		int power=sc.nextInt();
		int mul=1,i=1;
		while(i<=power) {
			mul=mul*num;
			i++;
		}
		System.out.println("power::"+mul);
	}
}
