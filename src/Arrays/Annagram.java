package Arrays;

import java.util.Scanner;

public class Annagram {
	
	
	
	public static void bubblesort(char[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					
					
					
				}
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String m=sc.nextLine();
		char []m1=m.toLowerCase().toCharArray();
		System.out.println("Enter the second string");
		String n=sc.nextLine();
		char []n1=n.toLowerCase().toCharArray();
		System.out.println(n1.length);
		System.out.println(m1.length);
		if(m1.length == n1.length)
		{
			
			bubblesort(m1);
			bubblesort(n1);
			System.out.println(m1);
			System.out.println(n1);
			
			int count=0;
			for(int k=0;k<m1.length;k++)
			{
				
				if(m1[k]==n1[k])
				{
					count++;
				}
			}
			
			System.out.println(count);
			if(count==m1.length) {
				System.out.println("anagram");
			}
			else
			{
				System.out.println("Not a anagram");
			}
			

			
			
			
			
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		
				
		
		
		
		
		
		

	}
	
	

	
		

}
