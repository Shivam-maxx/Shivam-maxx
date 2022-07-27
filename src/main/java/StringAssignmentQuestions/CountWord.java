package StringAssignmentQuestions;

public class CountWord extends main{
	public static void main(String[] args) {
		String str=sc.nextLine();
		int WordCount=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				WordCount++;
			}
		}
		System.out.println("Number Of Word is::"+WordCount);
	}
}
