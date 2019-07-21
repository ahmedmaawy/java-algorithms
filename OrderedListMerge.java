import java.util.*;

public class Program
{
	public static void main(String[] args) {
		Integer[] l1 = {1, 3, 10};
		Integer[] l2 = {5, 6, 9};
		
		int l1Index = 0, l2Index = 0;
		int l1Size = l1.length;
		int l2Size = l2.length;
		
		List<Integer> l3 = new ArrayList<Integer>();
		
		while(l1Index <= (l1Size - 1) && l2Index <= (l2Size - 1)) {
		    if(l1[l1Index] < l2[l2Index]) {
		        l3.add(l1[l1Index]);
		        l1Index ++;
		    } else {
		        l3.add(l2[l2Index]);
		        l2Index ++;
		    }
		}
		
		// Very good possibility we may miss the last element
		if(l1Index == (l1Size - 1)) {
		    l3.add(l1[l1Index]);
		}
		
		if(l2Index == (l2Size - 1)) {
		    l3.add(l2[l2Index]);
		}
		
		System.out.println(Arrays.toString(l3.toArray()));
	}
}