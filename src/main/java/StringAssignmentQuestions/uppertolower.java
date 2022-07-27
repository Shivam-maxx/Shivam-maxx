package StringAssignmentQuestions;

public class uppertolower extends main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=sc.nextLine();
		String str1=new String();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			 Character c = str.charAt(i);
	            if (Character.isLowerCase(c))
	                sb.replace(i, i + 1,
	                            Character.toUpperCase(c) + "");
	            else
	                sb.replace(i, i + 1,
	                            Character.toLowerCase(c) + "");
		}
		 System.out.println("String after case conversion::" + str1);    
	}

}
