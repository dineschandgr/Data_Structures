package io.datastructures.hashtables;

import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
	
	Map<Integer,Integer> hashMap = new HashMap<>();
	
	//O(n)
	public int mostFrequent(int[] array) {
		
		for(int num : array) {
			var count = hashMap.get(num) != null ? hashMap.get(num) : 0;
			hashMap.put(num, ++count);
		}
		
		int max = 1;
		int mostRepeatedNum = 0;
		
		//O(1)
		for(var item :  hashMap.entrySet()) {
			int value = item.getValue();
			if(value > max) {
				max = value;
				mostRepeatedNum = item.getKey();
			}
		}
		System.out.println(" most repeated element is "+mostRepeatedNum +" with "+max+ " repitions");
		return mostRepeatedNum;
		
	}
	
	
	//O(n^2)
	public int countPairsWithDiff(int[] array,int k) {
		
		HashSet<Point> set = new HashSet<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<array.length;i++) {
			for(int j = i+1;j<array.length-1;j++) {
			if(array[i] % k != 0)
				map.put(array[i],array[i+1]);
			//if(array[i+1] - array[i] == k)
				//set.add(new Point(array[i],array[i+1]));
			}
		}
		return map.size();
		
	}
	
	//O(n)
	 public int countPairsWithDiff1(int[] numbers, int difference) {
	        // For a given number (a) and difference (diff), number (b) can be:
	        //
	        // b = a + diff
	        // b = a - diff
	        //
	        // We can iterate over our array of numbers, and for each number,
	        // check to see if we have (current + diff) or (current - diff).
	        // But looking up items in an array is an O(n) operation. With this
	        // algorithm, we need two nested loops (one to pick a,
	        // and the other to find b). This will be an O(n^2) operation.
	        //
	        // We can optimize this by using a set. Sets are like hash tables
	        // but they only store keys. We can look up a number in constant time.
	        // No need to iterate the array to find it.

	        // So, we start by adding all the numbers to a set for quick look up.
	        Set<Integer> set = new HashSet<>();
	        for (var number : numbers)
	            set.add(number);

	        // Now, we iterate over the array of numbers one more time,
	        // and for each number check to see if we have (a + diff) or
	        // (a - diff) in our set.
	        //
	        // Once we're done, we should remove this number from our set
	        // so we don't double count it.
	        var count = 0;
	        for (var number : numbers) {
	            if (set.contains(number + difference))
	                count++;
	            if (set.contains(number - difference))
	                count++;
	            set.remove(number);
	        }

	        // Time complexity of this method is O(n).

	        return count;
	    }
	 
	 
	 //O(n)
	 public int[] twoSum(int[] array, int target) {
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 for(int i = 0; i<array.length;i++) {
			 var diff = target - array[i];
			 if(map.containsKey(diff)){
				return new int[] {map.get(diff),i}; 
			 }
			 map.put(array[i], i);
		 }
		return null;
		 
	 }
}
