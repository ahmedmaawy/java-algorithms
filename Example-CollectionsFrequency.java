// Reference: https://www.geeksforgeeks.org/java-util-collections-frequency-java-examples/
// Java program to demonstrate working of 
// java.utils.Collections.frequency() 

import java.util.*; 

public class FrequencyDemo 
{ 
	public static void main(String[] args) 
	{ 
		// Let us create a list of strings 
		List<String> mylist = new ArrayList<String>(); 
		mylist.add("practice"); 
		mylist.add("code"); 
		mylist.add("code"); 
		mylist.add("quiz"); 
		mylist.add("geeksforgeeks"); 

		// Here we are using frequency() method 
		// to get frequency of element "code" 
		int freq = Collections.frequency(mylist, "code"); 

		System.out.println(freq); 
	} 
}