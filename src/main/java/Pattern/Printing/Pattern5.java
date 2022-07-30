package Pattern.Printing;

public class Pattern5 extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=n;j++) {
				System.out.print(num++);
			}
			System.out.println();
		}
	}

}
