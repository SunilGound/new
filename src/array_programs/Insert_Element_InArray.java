package array_programs;

public class Insert_Element_InArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int element =100;
		int index_position=3;
		for(int i=a.length-1;i>index_position;i--)
		{
			a[i]=a[i-1];
		}
		a[index_position]=element;
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
