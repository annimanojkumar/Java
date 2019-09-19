package NumberPrograms;

public class NoOfDigit {

	public static void main(String[] args) {
		int n=135;
		System.out.println(n);
		int count = 0;
		while(n > 0)
		{
			n = n/10;
			count++;
		}
		
		System.out.println("No Of Digits is"+count);

		
		
		
		
		
	}

}
