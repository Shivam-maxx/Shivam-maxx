package StringAssignmentQuestions;

import java.util.Iterator;

public class RemoveFirstOccuranceOfGivenWord extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=sc.nextLine();
		int i;
		String str2[]=str.split(" ");
		String str1=sc.nextLine();
		int c=0;
		for (i=0;i<str2.length;i++) {
			if(str1.equals(str2[i])) {
				c=i;
				break;
			}
		}
		str2[c]=" ";
		for(int j=0;j<str2.length;j++) {
			System.out.print(str2[j]);
		}
	}
}
