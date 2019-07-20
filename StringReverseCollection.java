import java.util.*;

public class Program
{
    
    
	public static void main(String[] args) {
		String[] myString = "MyString".split("");
		
		Collections.reverse(Arrays.asList(myString));
		String reversedString = String.join("", myString);
		System.out.println(reversedString);
	}
}