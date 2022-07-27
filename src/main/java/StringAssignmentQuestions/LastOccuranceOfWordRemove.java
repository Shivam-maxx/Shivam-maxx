package StringAssignmentQuestions;

public class LastOccuranceOfWordRemove extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		char a=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				c=i;
			}
		}
		sb.delete(c, c+1);
		System.out.println("last Occurance Remove::"+sb);
	}

}