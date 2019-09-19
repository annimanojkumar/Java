package Arrays;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test Cases");
		int NoOfTestCase = sc.nextInt();
	for(int i=0;i<NoOfTestCase;i++)
		{
			int count = 0;
			System.out.println("enter No of Elements in Array");
		 int 	NoOfElementsarray = sc.nextInt();
		int array[] = new int[NoOfElementsarray];
			for(int j=0;j<NoOfElementsarray;i++) {
				 array[j] = sc.nextInt();
				if(array[j]%2 == 0)
				{
					count++;
				}
				
				
			}
			System.out.println(count);
		}
	
		

	}

}
