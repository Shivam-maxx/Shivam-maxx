package Method;

import java.lang.Math;  

public class ArmStrongPrime extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		if(Prime(num)){
			System.out.println("Prime::");
		}
		else {
			System.out.println("Not Prime::");
		}
		if(ArmStrong(num)){
			System.out.println("ArmStrong::");
		}
		else {
			System.out.println("Not ArmStrong::");
		}

	}

	public static boolean Prime(int num) {
		// TODO Auto-generated method stub
		int i=1,flag=0;
		int n=num;
		 int m=n/2;      
		  if(n==0||n==1){  
			  return false;
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){            
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  {
			   return true;
		   }
		   return false;
		  }
		}  

	public static boolean ArmStrong(int num) {
		// TODO Auto-generated method stub
		int n=num;
		int n1=num;
		int c=0;
		int sum=0;
		while(n1!=0) {
			n1/=10;
			c++;
		}
		while(num!=0) {
			int d=num%10;
			sum+=(Math.pow(d, c));
			num/=10;
		}
		if(n==sum) {
			return true;
		}
		else{
			return false;
		}
	}

}
