package Arrays;

import java.util.Scanner;

public class Pqalindromejava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the string");
        String name=sc1.nextLine();
        char[] ch=name.toCharArray();
        String name1="";
        for(int i=ch.length-1;i>=0;i--){
            name1=name1+ch[i];
        }
        if(name1.equals(name)){
            if(name1.length()%2==0)
            {
                System.out.println("YES EVEN ");
            }else{
                System.out.println("YES ODD");
            }
        }
        else
        System.out.println("NO");

    
		}
	}

}
