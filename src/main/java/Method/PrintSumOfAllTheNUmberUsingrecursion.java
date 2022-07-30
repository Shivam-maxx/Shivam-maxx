package Method;

public class PrintSumOfAllTheNUmberUsingrecursion extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		System.out.println(Print(num));
	}

	private static int Print(int num) {
		// TODO Auto-generated method stu
		if(num>1) {
			return num+Print(num-1);
		}
		else {
			return num;
		}
	}

}
