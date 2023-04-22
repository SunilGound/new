package realtimeInterview;

import java.util.Arrays;

public class ThirdHIghestNumberInarray {

	public static void main(String[] args) {
		
		int []a= {10, 2, 5, 4, 6, 17, 11, 22,120,200,100,12,23,44};
		
		Arrays.sort(a);
	    int len=  a.length;
	    System.out.println(len);
	    System.out.println(a[len-3]);
	    System.out.println(a[0]);
	}

}
