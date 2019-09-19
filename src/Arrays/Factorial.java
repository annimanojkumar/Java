package Arrays;

import java.util.Scanner;

public class Factorial {

	
	    public static void main(String args[] ) throws Exception {
	       Scanner sc=new Scanner(System.in);
	     
	       int n=sc.nextInt();
	       int[] array=new int[n];
	       for(int i=0;i<n;i++){
	    	 
	           array[i]=sc.nextInt();
	       }
	       int mul=1;
	       
	       for(int j=0;j<array.length;j++)
	       {
	           mul=mul*array[j];
	           }
	          System.out.println(mul);

	    }
	


}





