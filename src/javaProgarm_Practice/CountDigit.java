package javaProgarm_Practice;

public class CountDigit {

	public static void main(String[] args) {
        
		int num = 1234578;
		int count = 0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No of digits:"+count);
	}

}
