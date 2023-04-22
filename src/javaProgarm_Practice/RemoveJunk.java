package javaProgarm_Practice;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sunil@Ramkishan@gound#$%&";
		       s=s.replaceAll("[^a-zA-Z0-9]", "");
		       System.out.println(s);
		       int lenght = s.length();
		       System.out.println(lenght);
		       for(int i=lenght-1; i>=0;i--)
		       {
		    	   char c = s.charAt(i);
		    	   System.out.print(c);
		       }

	}

}
