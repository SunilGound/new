package javaProgarm_Practice;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java programming Langauge";
		int l1=s.length();
		String str = s.replace("a", "");
		int l2 = str.length();
		int count =l1-l2;
		System.out.println("Occurance of \"a\" in string is "+count);

	}

}
