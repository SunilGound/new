package pattren_Programs;

public class Diamond_Shape_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 4; i++) 
		{
			
			for (int j = 0; j <= i; j++) 
			{
				
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		for (int j = 0; j <= 3; j++)
		{
			for (int j2 = j; j2 <= 3; j2++) 
			{
				
				System.out.print("* ");
				
			}
			System.out.println();
			
		}

	}

}
