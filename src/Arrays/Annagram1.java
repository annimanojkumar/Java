package Arrays;

import java.util.Scanner;

public class Annagram1 {

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
		System.out.println("Enter the No of inputs");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{    
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the String ");
			String m=sc1.nextLine();
			String[] str=m.split(" ");

			char[] m1=str[0].toLowerCase().toCharArray();


			char []n1=str[1].toLowerCase().toCharArray();
			//System.out.println(n1.length);
			//System.out.println(m1.length);
			if(m1.length == n1.length)
			{

				bubblesort(m1);
				bubblesort(n1);
				//System.out.println(m1);
				//System.out.println(n1);

				int count=0;
				for(int k=0;k<m1.length;k++)
				{

					if(m1[k]==n1[k])
					{
						count++;
					}
				}

				//System.out.println(count);
				if(count==m1.length) {
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}






			}
			else {
				System.out.println("No");
			}








		}

	}


}
