
public class SWAPFIRSTANDLAST extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		int arr[]=new int[6];
		int k=0;
		int c=0;
		while(num!=0){
			int d=0;
			d=num%10;
			arr[k++]=d;
			num/=10;
			c++;
		}
		int temp=arr[0];
		arr[0]=arr[k-1];
		arr[k-1]=temp;
		for(int i=0;i<k-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
