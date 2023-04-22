package string;

public class ComparisonOfEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 =new String("sunil");
		String s2 =new String("sunil");
		String s3="amit";
		String s4="amit";
		//use of == operator
		System.out.println(s1==s2);   // False
		System.out.println(s3==s4);  // True
		
		// use of equals() method
		
		System.out.println(s1.equals(s2)); //True
		System.out.println(s3.equals(s4)); //True



	}

}
