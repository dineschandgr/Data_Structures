package io.datastructures.hashtables;

import java.util.Arrays;

public class HashTableExercisesDemo {

	public static void main(String[] args) {
		HashTableExercises hashTableExercises = new HashTableExercises();
		int[] array = {1,2,2,2,2,3,3,3,4};
		hashTableExercises.mostFrequent(array);
		
		int array2[] = {1,7,5,9,2,12,3};
		int k = 2;
		System.out.println("no of unique pairs is " +hashTableExercises.countPairsWithDiff1(array2,k));
		
		int array3[] = {2,7,11,15};
		int target = 9;
		System.out.println("indices is " +Arrays.toString(hashTableExercises.twoSum(array3, target)));
	}

}
