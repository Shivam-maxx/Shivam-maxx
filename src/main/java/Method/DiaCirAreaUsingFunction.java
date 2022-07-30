/**
 * 
 */
package Method;

/**
 * @author ashup
 *
 */
public class DiaCirAreaUsingFunction extends main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		System.out.println("Area::"+Fun(num));
		System.out.println("Diameter::"+fun1(num));
		System.out.println("Circumference::"+Fun1(num));
	}

	private static double Fun1(int num) {
		// TODO Auto-generated method stub
		return 3.14*num*num;
	}

	private static double fun1(int num) {
		// TODO Auto-generated method stub
		return 2*num;
	}

	private static double Fun(int num) {
		// TODO Auto-generated method stub
		return 2*3.14*num;
	}

}
