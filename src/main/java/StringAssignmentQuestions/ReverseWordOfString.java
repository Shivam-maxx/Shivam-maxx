package StringAssignmentQuestions;

import java.util.Iterator;

public class ReverseWordOfString extends main {
	public static void main(String[] args) {
		String str=sc.nextLine();
		String str1=" ";
		int n=str.length();
		n=n-1;
		int c=1;
		for(int i=0;i<=n;i++) {
			if(str.charAt(i)!=str.charAt(n)) {
				c=0;
			}
			n--;
		}
		if(c==1) {
			System.out.println("String is Palindrome::"+str);
		}
		else {
			System.out.println("String is not Palindrome::"+str);
		}
	}
}
