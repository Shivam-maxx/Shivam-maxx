import javax.sound.midi.Soundbank;

public class PRIMENUMBERSERIES extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Range::");
		int num=sc.nextInt();
		int i=1,j;
		int sum=0;
		System.out.println("Prime number series::");
		while(i<=num) {
			int count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				sum+=i;
			}
			i++;
		}
		System.out.println("\nSum of series is::"+sum);

	}

}
