
public class S3Question4 {
	public static void main(String[] args) {
		int i=1;
		System.out.println("All The Even number between 1 to 100:");
		while(i<=100) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("\nAll the odd number between 1 to 100:");
		int j=1;
		while(j<=100) {
			if(j%2!=0) {
				System.out.print(j+" ");
			}
			j++;
		}
	}
}
