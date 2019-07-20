import java.util.*;

public class Program
{
	public static void main(String[] args) {
		Integer[] numbers = { 354, 500, -200, 78, -86 };
		
		for(Integer num : numbers) {
		    Integer numberSign = Integer.signum(num);
		    
		    num = num * numberSign;
		    
		    String [] numString = String.valueOf(num).split("");
		    Collections.reverse(Arrays.asList(numString));
		    Integer finalNumber = Integer.parseInt(String.join("", numString)) * numberSign;
		    
		    System.out.println(finalNumber);
		}
	}
}