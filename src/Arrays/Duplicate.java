package Arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		String s1 = "";
		for(int i=0;i<=ch.length-1;i++) 
		{
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j] = ' ';

				}
			}
			s1=s1+ch[i];


		}

		char []ch1=s1.toCharArray();
		for(int k=0;k<ch1.length;k++) {
			if(ch1[k]!=' ') {
				System.out.print(ch1[k]);
			}
		}

		//System.out.println(s1);




	}

}
