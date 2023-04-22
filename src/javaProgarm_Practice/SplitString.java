package javaProgarm_Practice;

public class SplitString {

	public static void main(String[] args) {

		String s = "Selenium,TestNG,maven,Postman";
		String[] arry = s.split(",");
		System.out.println(arry.length);
		/*for(String s1:arry)
		{
			System.out.println(s1);
		}*/
		
		// for loop
		
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
	}

}
