package StringAssignmentQuestions;

public class OccuranceofWord extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String str=sc.nextLine();
		char a=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				c=i;
//				break;
			}
		}
		System.out.println("First Occurance of the Word is::"+c);
	}

}
