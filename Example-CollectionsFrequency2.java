// Reference: https://www.geeksforgeeks.org/java-util-collections-frequency-java-examples/
// Java program to get frequency of an element 
// with java.utils.Collections.frequency() 

import java.util.*; 

public class FrequencyDemo 
{ 
	public static void main(String[] args) 
	{ 
		// Let us create an array of integers 
		Integer arr[] = {10, 20, 20, 30, 20, 40, 50}; 

		// Please refer below post for details of asList() 
		// https://www.geeksforgeeks.org/array-class-in-java/ 
		int freq = Collections.frequency(Arrays.asList(arr), 20); 

		System.out.println(freq); 
	} 
} 