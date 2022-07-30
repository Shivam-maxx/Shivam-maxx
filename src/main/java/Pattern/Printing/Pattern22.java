package Pattern.Printing;

public class Pattern22 extends Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc .nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i%2!=0) {
					if(j%2!=0) {
						System.out.print("1");
					}
					else {
						System.out.print("0");
					}
				}
				else {
					if(j%2!=0) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				}
			}
			System.out.print("\n");
		}

	}

}
