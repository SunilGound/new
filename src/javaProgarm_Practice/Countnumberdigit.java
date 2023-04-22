package javaProgarm_Practice;

public class Countnumberdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 int num=123456;

				int count=0;
				while(num>0)
				{
					
					num=num/10;
					count++;
					
				}
				System.out.println("Number of digit in number is "+count);

	}

}
