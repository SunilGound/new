package array_programs;

public class One_dimensional_Array {

	public static void main(String[] args) {
		 int a[] = {10,20,30,40,50};
		 System.out.println("Lenght od array is "+a.length);
		 System.out.println(a[2]);
		 System.out.println(a);
		 
		 // for loop 
		 
		/* for(int i=0;i<a.length;i++)
		 {
			System.out.print(" "+a[i]);
		 }*/
		 
		 //for each loop
		 
		 for(int c : a) 
		 {
			 System.out.print(" "+c);
		 }
		
	}

}
