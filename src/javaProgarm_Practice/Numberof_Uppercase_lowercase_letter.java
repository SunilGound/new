package javaProgarm_Practice;

public class Numberof_Uppercase_lowercase_letter {

	public static void main(String[] args) {
       String str = "Sunil ramkishan Gound";
       str = str.replaceAll("\\s", "");
       int Uppercount=0;
       int lowercount=0;
       char[] c = str.toCharArray();
       for(char ch :c) 
       {
    	   if(ch>='A' && ch<='Z')
    	   {
    		   Uppercount++;
    	   }
    	   else if(ch>='a' && ch<='z')
    	   {
    		   lowercount++;
    	   }
       }
       System.out.println(Uppercount);
       System.out.println(lowercount);
	}
}

