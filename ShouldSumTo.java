import java.util.*;

public class Program
{
	public static void main(String[] args) {
		Integer[] arr = {3, 5, 2, -4, 8, 11};
		Integer shouldSumTo = 7;
		
		List<Integer[]> sumList = new ArrayList<Integer[]>();
		
		for(Integer item: arr) {
		    for(Integer subItem: arr) {
		        if((item + subItem) == shouldSumTo) {
		            Integer[] arrayItem = { item, subItem };
		            sumList.add(arrayItem);
		        }
		    }
		}
		
		for(int index = 0; index < sumList.size(); index++) {
		    System.out.println(Arrays.toString(sumList.get(index)));
		}
	}
}