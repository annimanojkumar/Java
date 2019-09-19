package Arrays;

import java.util.Scanner;

public class SumOfQ {
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Integer");

        int N = s.nextInt();

        // Define an array of integers of size N. 
        int[] numArray = new int[N];        


        int sum = 0;
        for(int i=0; i<N; i++){
            numArray[i] = s.nextInt(); 
            
            
        }

        // Write the logic to add these numbers here:
        
        for(int i=0;i<N;i++) {
        sum=sum+(numArray[i]*numArray[i]);
        }

        // Print the sum
        System.out.print(sum);
        s.close();
    }

}
