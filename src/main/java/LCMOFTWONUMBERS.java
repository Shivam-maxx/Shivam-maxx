
public class LCMOFTWONUMBERS extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number::");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int i,LCM=0;
		int num3,a;
		if(num>num1) {
			num3=a=num;
		}
		else {
			num3=a=num1;
		}
		while(num!=0) {
			if(num3%num==0 && num3%num1==0) {
				LCM=num3;
				break;
			}
			num3+=a;
		}
		System.out.println("LCM of two numbwr is::"+LCM);
	}

}
