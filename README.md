## Lists / ArrayList

```java
List<List<Integer>> myList = new ArrayList<List<Integer>>();
myList.add(xyz);
myList.get(index);
myList.set(0, "Opel");
myList.remove(0);
myList.clear();
myList.size();
```

## Hashmaps

```java
// Create a HashMap object called capitalCities
HashMap<String, String> capitalCities = new HashMap<String, String>();
capitalCities.put("England", "London");
capitalCities.get("England");
capitalCities.remove("England");
capitalCities.clear();
capitalCities.size();

// Print keys
for (String i : capitalCities.keySet()) {
	System.out.println(i);
}
```

## Arrays

```java
Arrays.sort(myCharArray1);
Arrays.parallelSort(myCharArray1); 
List<char> charList = Arrays.asList(myCharArray1);

// Example 1: Array Binary Search
int intArr[] = { 10, 20, 15, 22, 35 };
Arrays.sort(intArr);
int intKey = 22;
int arrayIndex = Arrays.binarySearch(intArr, intKey);

// Example 2: Array Comparison
int intArr[] = { 10, 20, 15, 22, 35 };
int intArr1[] = { 10, 15, 22 };
int comparison = Arrays.compare(intArr, intArr1); // returns 1
int comparisonUnsigned = Arrays.compareUnsigned(intArr, intArr1); // returns 1

// Example 3: Array copy
int intArr[] = { 10, 20, 15, 22, 35 };
System.out.println(Arrays.toString(Arrays.copyOf(intArr, 10))); // [10, 20, 15, 22, 35, 0, 0, 0, 0, 0]
System.out.pringln(Arrays.toString(Arrays.copyOfRange(intArr, 1, 3))); // [20, 15]

// Example 4: How equal are multidimentional arrays?
int intArr[][] = { { 10, 20, 15, 22, 35 } };  
int intArr1[][] = { { 10, 15, 22 } };
Arrays.deepEquals(intArr, intArr1); // false

// Example 5: Get hash code of a multidimentional array
Arrays.deepHashCode(intArr); // 38475344
// For single dimensional arrays:
Arrays.hashCode(intArr);

// Example 6: Get the 1st element with a mismatch
int intArr[] = { 10, 20, 15, 22, 35 }; 
int intArr1[] = { 10, 15, 22 };
Arrays.mismatch(intArr, intArr1); // 1
```
* [Deeper Array Reference](https://www.geeksforgeeks.org/array-class-in-java/)
* [Small reference on Sorting](https://www.baeldung.com/java-sorting-arrays)

## Collections

```java
// Simple Binary Search
List al = new ArrayList(); 
al.add(1); 
al.add(2); 
al.add(3); 
al.add(10); 
al.add(20); 
index = Collections.binarySearch(al, 15); 

// Complex Binary Search
List<Domain> l = new ArrayList<Domain>(); 
l.add(new Domain(10, "quiz.geeksforgeeks.org")); 
l.add(new Domain(20, "practice.geeksforgeeks.org")); 
l.add(new Domain(30, "code.geeksforgeeks.org")); 
l.add(new Domain(40, "www.geeksforgeeks.org")); 

Comparator<Domain> c = new Comparator<Domain>() 
{ 
	public int compare(Domain u1, Domain u2) 
	{ 
		return u1.getId().compareTo(u2.getId()); 
	} 
};
int index = Collections.binarySearch(l, new Domain(10, null), c);

// Swap
// Swap items at indexes 1 and 3 
Collections.swap(mylist, 3, 1);

// Shuffle
Collections.shuffle(mylist);
// Here we use Random(3) to shuffle given list (User defined Shuffle). 
Collections.shuffle(mylist, new Random(3));
// Are 2 collections disjoint? (Have no elements in common)
Collections.disjoint(mylist1, mylist2);
Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2))); // If Array

// Disjoint Example: Array
// ================
Integer arr1[] = {10, 20, 30, 40, 50}; 
Integer arr2[] = {60, 70, 80, 90, 100}; 
Integer arr3[] = {50, 70, 80, 90, 100}; 
Double  arr4[] = {50.0, 60.0, 110.0}; 

System.out.println("is arr1 disjoint to arr2 : " + 
	Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2))); // true
  
System.out.println("is arr1 disjoint to arr3 : " + 
	Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr3))); // false
  
System.out.println("is arr1 disjoint to arr4 : " + 
	Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr4))); // true
	
// Collections - Frequency: How many times does an item appear in a list?
int freq = Collections.frequency(mylist, "code"); 

// Rotate Collections
// to rotate the element by distance 2 
Collections.rotate(mylist, 2);
Collections.rotate(Arrays.asList(arr), 2);
```

## Misceleneous Utilities

```java
// Remove all punctuations etc from a String
str1.replaceAll("\\s", "");
// Array to list
List<T> items = Arrays.asList(arr1);

// Character Array to String
String newString = new String(charArray);
// String to Character Array
char[] charArray = str.toCharArray();
```