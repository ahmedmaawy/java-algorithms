public class Program
{
    public static int vowelCount(String str) {
        char[] charArray = str.toCharArray();
        int vowelCount = 0;
        
        for(char singleChar: charArray) {
            Character myChar = new Character(singleChar);
            myChar = Character.toLowerCase(myChar);
            
            if("aeiou".contains(myChar.toString())) {
                vowelCount++;
            }
            
            // Long method:
            // if(myChar.equals('a') || myChar.equals('e') || myChar.equals('i') || myChar.equals('o') || myChar.equals('u')) {
            //    vowelCount ++;
            // }
        }
        
        return vowelCount;
    }
    
	public static void main(String[] args) {
	    String str1 = "How are you doing?";
	    String str2 = "Why why why why!";
	    String str3 = "Count the number of vowels here";
	    
	    System.out.println(vowelCount(str1));
	    System.out.println(vowelCount(str2));
	    System.out.println(vowelCount(str3));
	}
}