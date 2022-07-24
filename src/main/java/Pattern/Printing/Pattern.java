package Pattern.Printing;

public class Pattern extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
		
	}

}
