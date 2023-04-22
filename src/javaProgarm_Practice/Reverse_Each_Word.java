package javaProgarm_Practice;

public class Reverse_Each_Word {

	public static void main(String[] args) {
          
		String s ="Welcome To java and Selenium";
		
		String[] arry = s.split(" ");
		//System.out.println(arry);
		String reversestring="";
		/*for(String str:arry)
		{
			String reversewords ="";
			for(int i =str.length()-1;i>=0;i--)
			{
				reversewords =reversewords+str.charAt(i);
				//System.out.print(reversewords);
			}
			reversestring=reversestring+reversewords+" ";
		}
		System.out.println(reversestring); */
		
		// using StringBuilder class
		
		for(String w:arry)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversestring=reversestring+sb.toString()+" ";
			
		}
		System.out.println(reversestring);
	}

}
