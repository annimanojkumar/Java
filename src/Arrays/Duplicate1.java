package Arrays;

import java.util.Scanner;

public class Duplicate1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int countr=1;
			int countl=1;
			for(int k=0;k<i;k++)
			{
				if(ch[i]==ch[k])
				{
					countl++;
				}
			}
			
			if(countl==1)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						countr++;
					}
				}
			}
			if(countr>1) {
				System.out.println(ch[i]+ " repeating"+countr+"times" );
			}
			
				
		}
		
		
		
		

	}

}
