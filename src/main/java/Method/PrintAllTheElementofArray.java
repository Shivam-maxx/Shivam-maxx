package Method;

public class PrintAllTheElementofArray extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(func(n,arr));

	}

	private static int func(int n, int[] arr) {
		// TODO Auto-generated method stub
		if(n>=0) {
			func(n-1,arr);
			System.out.println(arr[n]);
			
		}
	}

}
