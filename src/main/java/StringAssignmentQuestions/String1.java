package StringAssignmentQuestions;

public class String1 extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if (str.charAt(i)==str1.charAt(j)) {
					c=1;
				}
				else {
					c=0;
				}
			}
		}
		if(c==1) {
			System.out.println("Both String Are Equal::");
		}
		else {
			System.out.println("String are not equal::");
		}
	}

}
