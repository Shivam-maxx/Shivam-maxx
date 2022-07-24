/**
 * 
 */

/**
 * @author ashup
 *
 */
public class S3Question18 extends main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		System.out.println("The Factors are::");
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
