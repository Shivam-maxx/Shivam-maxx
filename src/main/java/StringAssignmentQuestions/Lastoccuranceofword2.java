package StringAssignmentQuestions;

import java.util.Iterator;

public class Lastoccuranceofword2 extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=sc.nextLine();
		String str2[]=str.split(" ");
		String str1=sc.nextLine();
		int c=0;
		for (int i=0;i<str2.length;i++) {
			if(str1.equals(str2[i])) {
				c=i;
			}
		}
		System.out.println("last"+str1+" Occurance "+c+" position::");
	}
}
