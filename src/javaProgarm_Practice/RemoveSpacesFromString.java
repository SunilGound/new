package javaProgarm_Practice;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String s = "Sunil ramkishan Gound";
		System.out.println(s);    
		System.out.println(s.trim());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.equalsIgnoreCase("sunil ramkishan gound"));
		System.out.println(s.charAt(6));
		System.out.println(s.substring(6));
		System.out.println(s.substring(2, 9));
		System.out.println(s.replaceAll("\\s", ""));

	}

}
