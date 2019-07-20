import java.util.*;

public class Program
{
	public static void main(String[] args) {
	    String originalString = "abba";
	    String stringTwo = "mystring";
	    
		String [] originalReverse = originalString.split("");
		String [] stringTwoReverse = stringTwo.split("");
		
		Collections.reverse(Arrays.asList(originalReverse));
		Collections.reverse(Arrays.asList(stringTwoReverse));
		
		String originalReverseString = String.join("", originalReverse);
		String stringTwoReverseString = String.join("", stringTwoReverse);
		
		System.out.println(originalString.equals(originalReverseString));
		System.out.println(stringTwo.equals(stringTwoReverseString));
	}
}