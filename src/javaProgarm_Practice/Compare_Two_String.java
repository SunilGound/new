package javaProgarm_Practice;

import java.util.Scanner;

public class Compare_Two_String {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = sc.next();
		System.out.println("Enter Second string:");
		String s2 = sc.next();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("string are equal");
		}
		else
		{
			System.out.println("string are not equal");
		}
	}

}
