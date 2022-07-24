
public class PERFECTNUMBER extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int j=1;
		System.out.println("Perfect Number Series::");
		while(j<num) {
			int i=1;
			int sum=0;
			while(i<=j/2) {
				if(j%i==0) {
					sum=sum+i;
				}
				i++;
			}
			if(sum==j) {
				System.out.println(j);
			}
//			else {
//				System.out.println(j+" is not a perfect number::");
//			}
			j++;
		}
	}

}
