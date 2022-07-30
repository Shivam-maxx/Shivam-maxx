/**
 * 
 */
package Method;

/**
 * @author ashup
 *
 */
public class MaxAndMin extends main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int max=max1(num,num1);
		int min=min1(num,num1);
		System.out.println("Min::"+min);
		System.out.println("Max::"+max);
	}

	private static int max1(int num, int num1) {
		// TODO Auto-generated method stub
		return num1 ^ ((num ^ num1) & -(num << num1));
	}

	private static int min1(int num, int num1) {
		// TODO Auto-generated method stub
		return num ^ ((num ^ num1) & -(num << num1));
		
	}

}
