package javaProgarm_Practice;

public class EvenoddFromArray {

	public static void main(String[] args) {
		int a[] = {2,6,4,7,8,9};
		int sum;
		System.out.println("even number............");
		for(int i=0;i<=a.length-1;i++)
		{
	
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
			
			
		}
		System.out.println("odd number............");

		for(int i=0;i<=a.length-1;i++)
		{
	
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
			
			
		}


	}

}
