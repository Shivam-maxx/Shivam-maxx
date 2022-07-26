package Pattern.Printing;

public class Pattern6 extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter your number:");
		int num=sc.nextInt();
		int j,i;
		System.out.println("*");
		for(i=1;i<=num;i++) {
			int k=1;
			for(j=1;j<2*i;j++) {
				if(j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(k++);
				}
			
			}
			k=j;
			for(j=i;j>=1;j--) {
				System.out.print(k--);
			}
			System.out.print("*");
			System.out.println("\n");
		}
	}

}
