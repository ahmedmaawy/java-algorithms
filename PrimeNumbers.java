import java.util.*;

public class Program
{
	public static void main(String[] args) {
		int primeNumberTo = 50;
		
		boolean[] isPrime = new boolean[primeNumberTo];
		isPrime[0] = false;
		isPrime[1] = false;
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		
		// Fill up array
		for(int num = 2; num < primeNumberTo; num++) {
		    isPrime[num] = true; 
		}
		
		// Compute primes
		for(int num = 2; num < primeNumberTo; num++) {
		    if(isPrime[num - 2]) {
		        for (int j = num * 2; j <= primeNumberTo; j += num) {
                    isPrime[j - 2] = false;    
                }
		    }
		}
		
		// Add to a final list
		for(int num = 2; num < primeNumberTo; num++) {
		    if(isPrime[num]) {
		        primeNumbers.add(num);
		    }
		}
		
		System.out.println(primeNumbers);
	}
}