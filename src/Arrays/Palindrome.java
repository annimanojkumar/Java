package Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String S1="MADAMa";
		char ch[] = S1.toCharArray();
		String S2="";
		System.out.println(S1.length());
		for(int i=ch.length-1;i>=0;i--)
		{
			S2 =S2+ ch[i];
	    }
		
		if(S2.equals(S1))
		{
			System.out.println("Palindrome");
		}
		

	}

}
