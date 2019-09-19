package Arrays;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the input");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=n;j>=1;j--)
	{
		if(i==j) {
			System.out.print("*");
		}
		else {
			System.out.print(j);
		}
	}
	System.out.println();
}

	}

}
