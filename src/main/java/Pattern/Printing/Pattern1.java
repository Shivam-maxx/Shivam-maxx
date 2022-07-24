package Pattern.Printing;
public class Pattern1 extends Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number::");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("1");
			}
			System.out.print("\n");
		}
	}

}
