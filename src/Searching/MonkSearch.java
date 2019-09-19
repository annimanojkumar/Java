package Searching;

import java.util.Scanner;

public class MonkSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of test cases");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
        	int count=0;
        	
        	Scanner sc1 = new Scanner(System.in);
        	System.out.println("Enter the string");
            String s=sc1.nextLine();
            int l=s.length();
            char[] ch=new char[l];
            ch=s.toCharArray();
            
            for(int j=0;j<l;j++)
            {
                if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' )
                {
                    count++;
                }
                
                
            }
            System.out.println(count);
            
            
        }
		
		
		
	}

}
