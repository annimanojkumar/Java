package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        System.out.println(t);
        /*while(t-->0)
        {
            String str=br.readLine().trim();
            long vowel=0;
            long n=str.length();
            for(int i=0;i<n;i++)
            {
                char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vowel=vowel + ((i+1)*(n-i));
            }
            result.append(vowel+"\n");
        }
        System.out.println(result);*/
    }

}
