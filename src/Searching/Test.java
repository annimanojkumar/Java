package Searching;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   System.out.println("enter input");
   int n=sc.nextInt();
   
   if(n==1) {
	   System.out.println("*");
   }
   if(n==2) {
	   for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i==j) {
				System.out.println(n);
				n--;
			}
			else {
				System.out.println("*");
			}
		}
	}
   }
   
	}

}
