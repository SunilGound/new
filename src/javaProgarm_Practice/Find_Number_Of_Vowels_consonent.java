package javaProgarm_Practice;

public class Find_Number_Of_Vowels_consonent {

	public static void main(String[] args) {
		String str = "Sunil Ramkishan Gound";
		str=str.toLowerCase();
		str=str.replaceAll("\\s", "");
		int vowelscount=0;
		int consonentcount=0;
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if( c=='a' || c == 'e' || c=='i' ||  c=='o' || c=='u')
			{
				vowelscount++;

			}
			else
			{
				consonentcount++;
				System.out.println();

			}



		}


        System.out.println("Total number of character are "+str.length());
		System.out.println("No of vowels are " + vowelscount);
		System.out.println("No of consonent are " + consonentcount);

	}

}
