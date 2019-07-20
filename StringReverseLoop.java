public class Program
{
	public static void main(String[] args) {
		String string = "MyString";
		String newString = "";
		int strLen = string.length();
		
		for(int stringLoop = strLen; stringLoop > 0; stringLoop--) {
		    newString = newString.concat(Character.toString(string.charAt(stringLoop - 1)));
		}
		
		System.out.println(string + ": " + newString);
	}
}