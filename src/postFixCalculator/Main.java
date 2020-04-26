package postFixCalculator;

public class Main {

	public static void main(String[] args) {
		
		String firstString = "34+52/*";
		System.out.println("String: " + firstString);
		String[] arr = explode(firstString);
		Double result = Calculator.calculator(arr);
		System.out.println("result: " + result);
		String secondString = "94-63/+";
		System.out.println("String: " + secondString);
		arr= explode(secondString);
		result = Calculator.calculator(arr);
		System.out.println("result: " + result);
	}

	

	public static String[] explode(String s) {
	    String[] arr = new String[s.length()];
	    for(int i = 0; i < s.length(); i++)
	    {
	        arr[i] = String.valueOf(s.charAt(i));
	    }
	    return arr;
	}
}
