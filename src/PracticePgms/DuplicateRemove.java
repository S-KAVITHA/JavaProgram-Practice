package PracticePgms;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String args[]){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(3);
		primes.add(5);
		
		System.out.println("list of prime numbers : " + primes);

		
		Set<Integer> removeDuplicate = new LinkedHashSet<Integer>(primes);
		primes.clear();
		primes.addAll(removeDuplicate);
		
		System.out.println("Duplicate removal : " + removeDuplicate);	

	}
}
