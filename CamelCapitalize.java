public class Program
{
    public static String camelCapitalize(String string) {
        String[] strings = string.split(" ");
        int stringIndex = 0;
        
        for(String str : strings) {
            char[] charArray = str.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            String newString = new String(charArray);
            
            strings[stringIndex] = newString;
            
            stringIndex ++;
        }
        
        return String.join(" ", strings);
    }
    
	public static void main(String[] args) {
		String s1 = "a strange string comes";
		String s2 = "this is a strange string";
		
		System.out.println(camelCapitalize(s1));
		System.out.println(camelCapitalize(s2));
	}
}