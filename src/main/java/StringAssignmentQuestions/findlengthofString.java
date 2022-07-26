package StringAssignmentQuestions;

public class findlengthofString extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your String::");
		String str=sc.nextLine();
		String Str3=sc.nextLine();
		String Str2=new String();
		int length=str.length();
		System.out.println("Length of String is::"+length);
		String Str1=new String();
		for(int i=0;i<length;i++){
			 Str1+=str.charAt(i);
			
		}
		System.out.println("new String "+Str1);
		System.out.println("After Concatinating Two String::");
		for(int i=0;i<length;i++) {
			Str2+=str.charAt(i);
		}
		for(int i=0;i<length;i++) {
			Str2+=Str3.charAt(i);
		}
		System.out.println(Str2);
	}

}
