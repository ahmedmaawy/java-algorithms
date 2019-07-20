import java.util.*;

public class Program
{
    private static List<List<Integer>> chunkUp(Integer[] array, int size) {
        int arraySize = array.length;
        int currentIndex = 1;
        
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        List<Integer> mySubList = new ArrayList<Integer>();
        
        for(Integer item : array) {
            if(currentIndex % size != 0) {
                mySubList.add(item);
            } else {
                mySubList.add(item);
                myList.add(mySubList);
                mySubList = new ArrayList<Integer>();
            }
            
            if(currentIndex == arraySize && mySubList.size() < size) {
                myList.add(mySubList);
            }
            
            currentIndex ++;
        }
        
        return myList;
    }
    
    private static void iterateList(List<List<Integer>> list) {
        for(int i = 0; i < list.size(); i++) {
		    System.out.println(list.get(i));
		}
    }
    
	public static void main(String[] args) {
		Integer[] items = {4, 5, 4, 5, 6, 3, 4};
		
		List<List<Integer>> firstChunk = chunkUp(items, 2);
		List<List<Integer>> secondChunk = chunkUp(items, 5);
		List<List<Integer>> thirdChunk = chunkUp(items, 3);
		
		iterateList(firstChunk);
		iterateList(secondChunk);
		iterateList(thirdChunk);
	}
}