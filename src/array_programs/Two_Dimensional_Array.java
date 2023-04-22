package array_programs;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		 
		int a[][] = {{12,20,30,},{40,50,60,70},{10,20,30,40,50}};
		
		/*System.out.println(a);               //[[I@76ed5528
		System.out.println(a[0][2]);        //30
		System.out.println(a.length);       //2
		System.out.println(a[0].length);    //3
		System.out.println(a[1].length);    //4
		System.out.println(a[1][2]);*/        //60
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
