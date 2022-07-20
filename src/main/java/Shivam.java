
public class Shivam {
	
		    public static int Fact(int num){
		        if(num==0){
		            return 1;
		        }
		        else{
		            return num*Fact(num-1);
		        }
		    }
		    public static void main(String[] args) {
		        int num=5,Output;
		        Output=Fact(num);
		        System.out.println(Output);
		    }
	}
//        int num=5;
//        // 1...
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
////         2...
//         for(int i=1;i<2*num;i=i+2){
//             System.out.print(i);
//            
//         }
//         for(int i=2*num-1;i>=1;i=i-2){
//             System.out.print(i);
//         }
//         System.out.println();
////         3...
//         for(int i=2;i<=2*num;i=i+2){
//             for(int j=2;j<=i;j=j+2){
//                 System.out.print(j);
//             }
//             for(int k=2*(i-1);k>=2;k=k-2){
//                 System.out.print(k);
//             }
//             System.out.print("\n");
//         }
////         4...
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int k=(i-1);k>=1;k--){
//                 System.out.print(k);
//             }
//             System.out.print("\n");
//         }
////         5...
//         for(int i=1;i<=num;i++){
//             if(i%2!=0){
//                 for(int j=1;j<=2*i;j++){
//                     System.out.print(j);
//                     j++;
//                 }
//             }
//             else{
//                 for(int j=2;j<=2*i;j++){
//                     System.out.print(j);
//                     j++;
//                 }
//             }
//             System.out.println();
//         }
//        // 6...
//        
//    }
	
	
//	}

