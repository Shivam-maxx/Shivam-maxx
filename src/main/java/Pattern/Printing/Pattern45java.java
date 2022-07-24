package Pattern.Printing;

public class Pattern45java extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if((i==0 || i==num-1) || (j==0 || j==num-1))  {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=1;i<=num;i++) {
			int k=i;
			for(int j=1;j<=num;j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=1;i<=2*num;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=1;i<=num;i++) {
			int k;
			if(i%2==0) {
				k=2;
			}
			else {
				k=1;
			}
			for(int j=1;j<2*i;j+=2) {
				System.out.print(k);
				k=k+2;
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=1;i<=2*num;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");
		 for(int i=1;i<=num;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j);
             }
             System.out.print("\n");
         }
		 System.out.println("\n");
         for(int i=1;i<2*num;i+=2){
             System.out.print(i);
         }
         for(int i=2*num-1;i>=1;i-=2){
             System.out.print(i);
         }
         System.out.println();
         System.out.println("\n");
         for(int i=2;i<=2*num;i+=2){
             for(int j=2;j<=i;j+=2){
                 System.out.print(j);
             }
             for(int k=2*(i-1);k>=2;k-=2){
                 System.out.print(k);
             }
             System.out.print("\n");
         }
         System.out.println("\n");
         for(int i=1;i<=num;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j);
             }
             for(int k=(i-1);k>=1;k--){
                 System.out.print(k);
             }
             System.out.print("\n");
         }
         System.out.println("\n");
         for(int i=1;i<=num;i++){
             if(i%2!=0){
                 for(int j=1;j<=2*i;j++){
                     System.out.print(j);
                     j++;
                 }
             }
             else{
                 for(int j=2;j<=2*i;j++){
                     System.out.print(j);
                     j++;
                 }
             }
             System.out.println();
         }
	}

}