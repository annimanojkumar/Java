package NumberPrograms;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		
		int copy=n;
		while(n > 0)
		{    
			int mul=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				mul=mul*i;
				
			}
			sum=sum+mul;
			System.out.println(sum);
			n=n/10;
		}
		
		if(sum == copy)
		{
			System.out.println("given number is Strong Number");
		}
		else
		{
			System.out.println("Given Number is Not a Strong Number");
		}
		
		
		
	}

}
