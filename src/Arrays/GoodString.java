
package Arrays;

import java.util.Scanner;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Sting");
	/*	String s1=sc.nextLine().toLowerCase();
		char[] s=s1.toCharArray();
		for(int i=1;i<s.length;i++)
		{   
			String s2="";
			
			if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ) {
				s2=s2+s[i];
				for(int j=i+1;j<s.length;j++) {
					if(s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u' ) {
						s2=s2+s[j];
						
					}
					
				}
				
					
					//System.out.println(s2);
				}
				System.out.println(s2);
				
				
				
			
			
		}*/
		String name=sc.nextLine();
		char a[]= new char[name.length()];
      a = name.toCharArray();
        int count = 0; int maxCount = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i] =='a'|| a[i] =='e'|| a[i] =='i'||a[i] =='o'||a[i] =='u'){
                count++;
               // System.out.println(count);
            }else 
            {
                if(count>maxCount)
                    maxCount = count;
                count=0;
            }
        }
        if(count>maxCount){
                maxCount = count;
        }
        
        System.out.println(maxCount);

	}

}
