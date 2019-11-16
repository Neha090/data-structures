package stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class ques5 {

	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String b=sc.next();
		int count=0;
		Stack<Character> s1=new Stack<>();
        
		for(int i=0;i<b.length();i++)
		{
			if((b.charAt(i)=='{') || (b.charAt(i)=='[') ||(b.charAt(i)=='('))
			{
				s1.push(b.charAt(i));
			}
			
			if((b.charAt(i)=='}') || (b.charAt(i)==']') ||(b.charAt(i)==')'))
			{
				count=1;
			
			 if((b.charAt(i)==')') && (s1.peek()=='('))
				{
					s1.pop();
					
				}
				
			else if((b.charAt(i)==']') && (s1.peek()=='['))
				{
					s1.pop();
				}
				
			else if((b.charAt(i)=='}') && (s1.peek()=='{'))
				{
					s1.pop();
				}
			}
				
		}
		
			if(s1.isEmpty())
			{
				System.out.println("BALANCED");
			}
			if(!s1.isEmpty())
			{
				System.out.println("UNBALANCED");
			}

	}
}
