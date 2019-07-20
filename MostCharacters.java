import java.util.*;

public class Program
{
	public static void main(String[] args) {
		String theString = "Hello There";
		HashMap <String, Integer> charMap = new HashMap <String, Integer>();
		
		String [] characters = theString.split("");
		
		for(String character : characters) {
		    Integer numTimes = charMap.get(character);
		    if(numTimes != null) {
		        charMap.put(character, numTimes + 1);
		    } else {
		        charMap.put(character, 1);
		    }
		}
		
		String mostChar = "";
		Integer mostCharCount = 0;
		
		for(String theCharacter : charMap.keySet()) {
		    Integer charCount = charMap.get(theCharacter);
		    
		    if(charCount > mostCharCount) {
		        mostChar = theCharacter;
		        mostCharCount = charCount;
		    }
		}
		
		System.out.println("Most Characters :" + mostChar);
	}
}