package NumberPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		System.out.println("Factorial of a given number " +n+ " is " + mul);

	}

}
