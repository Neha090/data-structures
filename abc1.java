package achievers;

import java.util.Scanner;

public class abc1 {
	
	void reverse(String str) {
		
		char ch[]=str.toCharArray();
		int n=str.length(),h=0;
		char arr[]=new char[n];
		char ar[]=new char[n];
		
		for(int i=0;i<n;i++)
		{
        if ((ch[i] >= 48 && ch[i] <= 57) || (ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122))
        {
        	arr[h]=ch[i];
        	h++;
        }
		}
        
		
		int b=h-1;
		
		for(int ii=0;ii<h;ii++)
		{
			ar[ii]=arr[b];
			b--;
		}
		
		int l=0;
		for(int i=0;i<n;i++)
		{
		  if ((ch[i] >= 48 && ch[i] <= 57) || (ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122))
		     {
				 System.out.print(ar[l]);
				 l++;
				 
			}
		  else
		  {
			  System.out.print(ch[i]);
			 
		  }
	
		}
		
       
	}
	
	public static void main(String args[])
	{
		abc1 obj=new abc1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		
		obj.reverse(str);
	}

}
