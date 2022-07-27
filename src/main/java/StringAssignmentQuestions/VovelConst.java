package StringAssignmentQuestions;

public class VovelConst extends main{
	public static void main(String[] args) {
		String str=sc.nextLine();
		int VovelCount=0,ConstCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				VovelCount++;
			}
			else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
				VovelCount++;
			}
			else {
				ConstCount++;
			}
		}
		System.out.println("Volel::"+VovelCount + "\nConstCount::"+ConstCount);
	}
}
