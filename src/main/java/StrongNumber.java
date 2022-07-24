
public class StrongNumber extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int i;
		System.out.println("Factorial Series::");
		for(i=1;i<=num;i++) {
			int j,fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.print(fact+" ");
		}
	}

}
