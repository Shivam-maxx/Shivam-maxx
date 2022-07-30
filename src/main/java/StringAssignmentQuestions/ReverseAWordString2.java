package StringAssignmentQuestions;

import java.util.regex.Pattern;

public class ReverseAWordString2 extends main{
	public static void main(String[] args)
	{
		String s2 = sc.nextLine();
		System.out.println(reverseWords(s2));
	}
		static String reverseWords(String str)
		{
			Pattern pattern=Pattern.compile("\\s");
			String[] p = pattern.split(str);
			String result = "";

			for (int i = 0; i < p.length; i++) {
				if (i == p.length - 1)
					result = p[i] + result;
				else
					result = " " + p[i] + result;
			}
			return result;
		}
}
