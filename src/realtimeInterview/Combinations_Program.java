package realtimeInterview;

public class Combinations_Program {

	public static void main(String[] args) {
		String numb="abc";
		

		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				for (int j2 = 0; j2 < 3; j2++)
				{
					if(i!=j && i!=j2 && j!=j2) {
					System.out.println(""+numb.charAt(i)+numb.charAt(j)+numb.charAt(j2));
					}
				}
			}

		}

	}
}
