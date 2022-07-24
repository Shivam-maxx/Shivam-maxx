
public class HCFOFTWONUMBERS extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your numbers::");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int i;
		int HCF = 0;
		for(i=2;i<=num || i<=num1;i++) {
			if(num%i==0 && num1%i==0) {
				HCF=i;
			}
		}
		System.out.println("HCF of two numbers is::"+HCF);
	}

}
