package javaProgarm_Practice;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=10;
		int b=20;
		System.out.println("Number before swapping a="+a);
		System.out.println("Number before swapping b="+b);
         
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping a="+a);
		System.out.println("Number after swapping b="+b);
         
	}

}
