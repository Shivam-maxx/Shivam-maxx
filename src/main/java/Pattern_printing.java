public class Pattern_printing {
	    public static void main(String[] args) {
	        int num=5;
	       System.out.print("Q1..\n");
	         for(int i=1;i<=num;i++){
	             for(int j=1;j<=i;j++){
	                 System.out.print(j);
	             }
	             System.out.print("\n");
	         }
	         System.out.print("Q2..\n");
	         for(int i=1;i<2*num;i=i+2){
	             System.out.print(i);
	         }
	         for(int j=2*num-3;j>=1;j=j-2){
	             System.out.print(j);
	         }
	         System.out.println("\nQ3..");
	      
	         for(int i=1;i<=num;i++){
	             for(int j=2;j<=2*i;j=j+2){
	                 System.out.print(j);
	             }
	             for(int k=2*(i-1);k>=2;k=k-2){
	                 System.out.print(k);
	             }
	             System.out.print("\n");
	         }
	         System.out.print("Q4..\n");
	         for(int i=1;i<=num;i++){
	             for(int j=1;j<=i;j++){
	                 System.out.print(j);
	             }
	             for(int k=(i-1);k>=1;k--){
	                 System.out.print(k);
	             }
	             System.out.print("\n");
	         }
	         System.out.println("Q5..");
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
	         System.out.print("Q6..\n");
	        
	    }

	}

	


