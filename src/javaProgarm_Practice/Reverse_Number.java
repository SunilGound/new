package javaProgarm_Practice;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int rem=0;
		int rev;
		while(num>0)
		{
			rem=num%10;
			rev=rem;
			System.out.print(rev);
			num=num/10;
		}

	}

}
