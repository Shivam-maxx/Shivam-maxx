package Pattern.Printing;

public class Pattern66 extends Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				int num=2;
				for(int j=1;j<=i;j++) {
					System.out.print(num);
					num+=2;
				}
			}
			else {
				int num=1;
				for(int j=1;j<=i;j++) {
					System.out.print(num);
					num+=2;
				}
			}
			System.out.println();
			
		}

	}

}
