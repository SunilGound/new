package javaProgarm_Practice;

public class Even_Odd_number_count {

	public static void main(String[] args) {
        
		int num=123456;
		int Evencount=0;
		int Oddcount=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				Evencount++;
			}
			else
			{
				Oddcount++;
			}
			num=num/10;
		}
		
		System.out.println("No of even digits:"+Evencount);
		System.out.println("No of odd digits:"+Oddcount);

	}

}
