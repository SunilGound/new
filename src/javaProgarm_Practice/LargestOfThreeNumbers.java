package javaProgarm_Practice;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
         int a,b,c;
         a=400;
         b=200;
         c=300;
         if(a>b && a>c)
         {
        	 System.out.println("a is greater");
         }
         else if(b>c && b>a)
         {
        	 System.out.println("b is greater");
 
         }
         else if(c>b && c>a)
         {
        	 System.out.println("c is greater");
 
         }
         else 
         {
        	 System.out.println("all are equal");
 
         }
	}

}
