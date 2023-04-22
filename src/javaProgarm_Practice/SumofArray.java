package javaProgarm_Practice;

public class SumofArray {

	public static void main(String[] args) {
		
		int a[] = {2,6,4,7,8,9};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
          System.out.println(sum);
	}

}
