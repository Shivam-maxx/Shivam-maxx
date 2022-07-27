package StringAssignmentQuestions;



public class Countalphanumberspecial extends main{
	public static void main(String[] args) {
		String str=sc.nextLine();
		int AlphaCount=0,DigitCount=0,SpecialCharecter=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				AlphaCount++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				AlphaCount++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				DigitCount++;
			}
			else {
				SpecialCharecter++;
			}
		}
		System.out.println("Alphabet Count::"+ AlphaCount);
		System.out.println("Digit Count::"+ DigitCount);
		System.out.println("Special Count::"+ SpecialCharecter);
	}

}
