package StringAssignmentQuestions;

import java.util.Iterator;

public class ReplaceFirstOccuranceOfCharecter extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		char[] str=sc.nextLine().toCharArray();
//    	StringBuffer sb = new StringBuffer(str);
		char a=sc.next().charAt(0);
		int i;
		char b=sc.next().charAt(0);
		for(i=0;i<str.length;i++) {
			if(str[i]==a) {
				c=i;
				break;
			}
		}
		str[c]=b;
//		sb.replaceFirst(a, b);
		for(int j=0;j<str.length;j++) {
			System.out.print(str[j]);
		}
	}

}