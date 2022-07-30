package StringAssignmentQuestions;

import java.util.Iterator;

public class NumberOfOCCuranceOfWord1 extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=sc.nextLine();
		String str2[]=str.split(" ");
		String str1=sc.nextLine();
		int c=0;
		for (int i=0;i<str2.length;i++) {
			if(str1.equals(str2[i])) {
				c++;
			}
		}
		System.out.println(str1+" Occurance "+c+" times::");
	}
}
