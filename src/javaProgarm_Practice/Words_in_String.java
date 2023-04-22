package javaProgarm_Practice;

import java.util.Scanner;

public class Words_in_String {

	public static void main(String[] args) 
	{
		int count=1;

		String s = new String();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the string:");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i) ==' ' &&  s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
