package Arrays;

import java.util.Scanner;

public class MonkRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Test Cases");
        int t=sc.nextInt();
        
        for(int i=1;i<=t;i++){
        	System.out.println("Enter the No of elements");
            int n=sc.nextInt();
            System.out.println("Enter the no of rotation");
            int r=sc.nextInt();
            int[] n1=new int[n];
            for(int j=0;j<n;j++)
            {
            	System.out.println("enter the array");
                n1[j]=sc.nextInt();
            }
            
            
            for(int k=1;k<=r;k++)
            {
            	int temp=0;
              for(int l=0;l<n;l++)
              {
            	  
               if(l==0)
               {
                   temp=n1[n-1];
                  
               }
               else
               {
                   n1[n-l]=n1[n-l-1];
                   
                   
               }
               
              } 
              n1[0]=temp;
            }
            for(int m=0;m<n;m++) {
            	System.out.print(n1[m]);
            }
            
        }


	}

}
