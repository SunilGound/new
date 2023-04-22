package javaProgarm_Practice;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number:");
		try (Scanner sc = new Scanner(System.in))
		{
			int number = sc.nextInt();
			if(number%2==0)
			{
				System.out.println(number+" is Even number" );
			}
			else
			{
				System.out.println(number+" is odd number" );

			}
		}
		

	}

}
