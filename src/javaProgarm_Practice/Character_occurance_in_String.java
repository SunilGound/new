package javaProgarm_Practice;

public class Character_occurance_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s ="sunil ramkisham gound";
		int lemght1 = s.length();
		System.out.println(lemght1);
		int lenght2 = s.replace("i","").length();
		System.out.println(lenght2);

		int count = lemght1-lenght2;
		System.out.println(count);
		

	}

}
