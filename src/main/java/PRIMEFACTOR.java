public class PRIMEFACTOR extends main {
	public static void main(String[] args) {
		System.out.println("Enter the number::");
		int num=sc.nextInt();
		System.out.println("prime factor is::");
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num=num/i;
			}
		}
		if(num>2) {
			System.out.print(num);
		}
	}

}
