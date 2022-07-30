package Method;

public class FindCubeUsingRecursion extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number::");
		int n=sc.nextInt();
		int num=3;
		int cube;
		cube=recursion(n,num);
		System.out.println("Cube Is::"+cube);
	}
	private static int recursion(int n,int num) {
		// TODO Auto-generated method stub
		if(num!=0) {
			return n*recursion(n, num-1);
		}
		else {
			return 1;
		}
	}

}
