package Arrays;

import java.util.Scanner;

public class RemoveDuplicare {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the syring ");
		String s=sc.nextLine();
		char array[]=s.toCharArray();
	
		int j=0;
		char[] charArray = new char[20];
		System.out.println(array.length);
		for (int i = 0; i < array.length-1; i++) {
			System.out.println(i + " ");
			for (int k = i+1; k < array.length-1; k++) {
//				System.out.print(i + " ");
//				System.out.print(k);
				if(array[i]!= array[k]) {
				charArray[j++] = array[i];
				System.out.println(array[i]);
				}
			}
//			if(array[i] != array[i+1]) {
//				charArray[j++] = array[i];
//			}
		}
		charArray[j++] = array[array.length-1];
		
//		for (int i = 0; i < charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}
		
		
	}

}
