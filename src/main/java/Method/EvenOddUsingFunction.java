package Method;

public class EvenOddUsingFunction extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		//int num1=sc.nextInt();
		if(Even(num)){
			System.out.println("even::");
		}
		else {
			System.out.println("odd::");
		}

	}

	private static boolean Even(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			return true;
		}
		else{
			return false;
		}
	}

}
