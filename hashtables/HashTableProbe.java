package io.datastructures.hashtables;

import java.util.Arrays;

public class HashTableProbe {

	private Entry[] hashTable;
	int count;
	
	HashTableProbe(int size){
		hashTable = new Entry[size];
	}
	
	private class Entry{
		private int key;
		private String value;
		
		public Entry(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + "]";
		}
		
	}
	
		public void put(int key, String value) {
			var entry = getEntry(key);
			if(entry != null) {
				entry.value = value;
				return;
			}
			
			if(isFull())
		        throw new IllegalStateException();
			 
			hashTable[getIndex(key)] = new Entry(key,value);
			count++;
		}
		
		private boolean isFull() {
			return count == hashTable.length;
		}

		public String get(int key) {
			var entry = getEntry(key);
			return entry != null ? entry.value : null;
		}
		
		public void remove(int key) {
			var index = getIndex(key);
			if(index == -1 || hashTable[index] == null)
				return;
			
			hashTable[index] = null;
			count--;
		}

		private Entry getEntry(int key) {
			var index = getIndex(key);
			return index > 0 ? hashTable[index] : null;
		}
		
		private int getIndex(int key) {
			int steps = 0;
			while(steps < hashTable.length) {
				int index = index(key,steps++);
				var entry = hashTable[index];
				if(entry == null || entry.getKey() == key)
					return index;
			}
			
			return -1;
		}
		
		private int index(int key, int i) {
		    return (hash(key) + i) % hashTable.length;
		}

		private int hash(int key) {
		   return key % hashTable.length;
		}

		private int size() {
			return count;
		}
		
		@Override
		public String toString() {
			return "HashTableProbe [hashTable=" + Arrays.toString(hashTable) + "]";
		}
		
		
}
