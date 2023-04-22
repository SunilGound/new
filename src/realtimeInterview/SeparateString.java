package realtimeInterview;

public class SeparateString {

	public static void main(String[] args) {
		String s = "123AM25#$6CD";
		String allnumber = s.replaceAll("[^\\d]","");
		String allletter = s.replaceAll("\\d", "");
		String allletter1 = s.replaceAll("[^A-Z]","");
		String allletter2 = s.replaceAll("[^0-9]","");
		System.out.println(allnumber);
		System.out.println(allletter);
		System.out.println(allletter1);
		System.out.println(allletter2);


	}

}
