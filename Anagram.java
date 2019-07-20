import java.util.*;

public class Program
{
	public static void main(String[] args) {
		String str1 = "Keep";
		String str2 = "Peek";
		
		str1.replaceAll("\\s", "");
		str2.replaceAll("\\s", "");
		
		char[] myCharArray1 = str1.toLowerCase().toCharArray();
		char[] myCharArray2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(myCharArray1);
		Arrays.sort(myCharArray2);
		
		System.out.println(Arrays.equals(myCharArray1, myCharArray2));
	}
}