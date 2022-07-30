package StringAssignmentQuestions;

import java.util.Iterator;

public class RemoveAllOccuranceOfWord extends main{

	public static void main(String[] args) {
		int c=0;
		char[] str=sc.nextLine().toCharArray();
		char a=sc.next().charAt(0);
		int i;
		char b=sc.next().charAt(0);
		for(i=0;i<str.length;i++) {
			if(str[i]==a) {
				c=i;
				str[c]=b;
			}
		}
		for(int j=0;j<str.length;j++) {
			System.out.print(str[j]);
		}
	}

}