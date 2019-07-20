// Reference: https://www.geeksforgeeks.org/collections-shuffle-java-examples/
// Java program to demonstrate working of shuffle() 
// with user provided source of randomness. 
import java.util.*; 

public class GFG 
{ 
	public static void main(String[] args) 
	{ 
		ArrayList<String> mylist = new ArrayList<String>(); 
		mylist.add("code"); 
		mylist.add("quiz"); 
		mylist.add("geeksforgeeks"); 
		mylist.add("quiz"); 
		mylist.add("practice"); 
		mylist.add("qa"); 

		System.out.println("Original List : \n" + mylist); 

		// Here we use Random() to shuffle given list. 
		Collections.shuffle(mylist, new Random()); 
		System.out.println("\nShuffled List with Random() : \n"
													+ mylist); 

		// Here we use Random(3) to shuffle given list. 
		Collections.shuffle(mylist, new Random(3)); 
		System.out.println("\nShuffled List with Random(3) : \n"
													+ mylist); 

		// Here we use Random(3) to shuffle given list. 
		Collections.shuffle(mylist, new Random(5)); 
		System.out.println("\nShuffled List with Random(5) : \n"
													+ mylist); 

	} 
}