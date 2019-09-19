package Arrays;

import java.util.Scanner;

public class TestClass {
	public static void main(String args[] ) throws Exception {
        

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of string ");
        int n=sc.nextInt();
        sc.nextLine();
        
        
        for(int i=1;i<=n;i++)
        {
        	System.out.println("Enter the nstring ");
        	String s = sc.nextLine();
        	//String s2=s.toString();
        	//System.out.println(s2);
        	
           char ch[] = s.toCharArray();
          // System.out.println(ch);
           String s1 = "";
            for(int j=ch.length-1;j>=0;j--)
            {
                s1 = s1+ch[j];
                
             }
            System.out.println(s1);
		
			  if(s1.equals(s)) { int length = s1.length(); if(length % 2 == 0){
			  System.out.println("Yes EVEN"); } else { System.out.println("Yes ODD"); } }
			  else { System.out.println("NO"); }
			 
            
            
        }
        

    }
}

	
	


