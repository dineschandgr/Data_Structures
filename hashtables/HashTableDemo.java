package io.datastructures.hashtables;


public class HashTableDemo {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put(5, "Chand");
		hashTable.put(5, "Mugund");
		hashTable.put(10, "Shrisha");
		
		System.out.println(hashTable);
		System.out.println(hashTable.get(5));
		System.out.println(hashTable);
	}

}
