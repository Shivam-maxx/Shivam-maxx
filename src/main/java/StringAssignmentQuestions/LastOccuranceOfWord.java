package StringAssignmentQuestions;

public class LastOccuranceOfWord extends main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int arr[]=new int[100];
		String str=sc.nextLine();
		char a=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				arr[c++]=i;
			}
		}
		System.out.println("First Occurance of the Word is::");
		for(int i=0;i<c;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
