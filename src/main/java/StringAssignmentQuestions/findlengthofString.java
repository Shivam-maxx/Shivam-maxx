package StringAssignmentQuestions;

public class findlengthofString extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your String::");
		String str=sc.nextLine();
		int length=str.length();
		System.out.println("Length of String is::"+length);
		String Str1=" ";
		for(int i=0;i<length;i++){
			Str1[i]=str[i];
			
		}
	}

}
