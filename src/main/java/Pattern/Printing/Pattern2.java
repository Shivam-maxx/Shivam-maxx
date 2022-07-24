package Pattern.Printing;


public class Pattern2 extends Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int c;
		if(num>num1) {
			c=1;
		}
		else if(num1>num) {
			c=0;
		}
		else {
			c=2;
		}
		switch(c) {
		case 0:
			System.out.println("Number one is greater then number:");
			break;
		case 1:
			System.out.println("Number is greater than number one:");
			break;
		case 2:
			System.out.println("Both numbers are equal:");
			break;
		}
		
	}

}
