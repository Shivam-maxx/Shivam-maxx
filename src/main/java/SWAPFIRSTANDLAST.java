
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
		int arr1[]=new int[6];
		int k1=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[k1++]=arr[i];
		}
		int temp=arr1[1];
		arr1[1]=arr1[k];
		arr1[k]=temp;
		for(int i=1;i<=k;i++) {
			System.out.print(arr1[i]);
		}
	}

}
