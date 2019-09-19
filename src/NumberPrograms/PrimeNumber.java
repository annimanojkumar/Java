package NumberPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the seat number");
        // Write your code here
        int t=s.nextInt();
        while(t!=0){
            int n=s.nextInt();
            int m=12;
            int si=0;
            if(n>=1 && n<=108){
                if(n%12==1){
                    System.out.println((n+11)+" WS");
                    
                }
                else if(n%12==2){
                    System.out.println((n+9)+" MS");
                }
                else if(n%12==3){
                    System.out.println((n+7)+" AS");
                }
                else if(n%12==6){
                    System.out.println((n+1)+" WS");
                    
                }
                else if(n%12==5){
                    System.out.println((n+3)+" MS");
                }
                else if(n%12==4){
                    System.out.println((n+5)+" AS");
                }
                else if(n%12==7){
                    System.out.println((n-1)+" WS");
                    
                }
                else if(n%12==8){
                    System.out.println((n-3)+" MS");
                }
                else if(n%12==9){
                    System.out.println((n-5)+" AS");
                }
                else if(n%12==10){
                    System.out.println((n-7)+" AS");
                    
                }
                else if(n%12==11){
                    System.out.println((n-9)+" MS");
                }
                else if(n%12==0){
                    System.out.println((n-11)+" WS");
                }
            }
        }
        s.close();
    }
}


