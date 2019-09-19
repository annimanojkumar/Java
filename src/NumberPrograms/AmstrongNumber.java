package NumberPrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		for(int j=1;j<=10000;j++)
		{
			
		
		int n=j;
		int n1 =n;
		int count=0;
		while(n1>0)
		{
			n1=n1/10;
			count++;
			
		}
		int sum=0;
		int copy=n;
		
		while(n  > 0)
		{   int mul=1;
			int rem = n%10;
			for(int i=1;i<=count;i++)
			{
				mul=rem*mul;
			}
				
			sum=sum+mul;
			n=n/10;
		
		
		}
		
	
	if(sum == copy)
	{
		
		System.out.println("the Amstrong Number is"+sum);
	}
	
			

	}
	

}
	
}
