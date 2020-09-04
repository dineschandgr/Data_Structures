package io.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo {
	public static void main(String args[]) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
	//	numbers.removeAt(3);
		//numbers.print();
		//System.out.println(numbers.indexOf(3));
		//System.out.println("max value is "+numbers.maxValue());
		numbers.reverse();
		numbers.print();
		numbers.insertAt(200,2);
		numbers.insertAt(500,1);
		numbers.insertAt(500,1);
		numbers.insertAt(500,1);
		numbers.insertAt(500,1);
		numbers.print();
		
		Array other = new Array(3);
		other.insert(10);
		other.insert(40);
		other.insert(50);
		
		Array intersect = numbers.intersect(other);
		intersect.print();
		
		List<String> list = new ArrayList<>();
		
	}
}
