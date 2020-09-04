package io.datastructures.hashtables;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
	//put(k,v)
	//get(k) : v
	//remove(k)
	//k - int
	//v - string
	//Collisions : chaining
	//KeyValuepair class with 2 fields
	//LinkedList<Entry>[]
	//[LL,LL,LL,LL,LL]
	
	private LinkedList<Entry>[] entries;
	
	public HashTable() {
		super();
		this.entries = new LinkedList[5];
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
		
		getOrCreateBucket(key).add(new Entry(key,value));
	}

	private int hashFunction(int key) {
		int hashValue = key%entries.length;
		return hashValue;
	}
	
	public String get(int key) {
		var entry = getEntry(key);
		return (entry == null) ? null : entry.value;
	}
	
	private Entry getEntry(int key) {
		var index = hashFunction(key);
		var bucket = entries[index];
		if(bucket !=null) {
			for(Entry entry: bucket) {
				if(entry.getKey() == key)
					return entry;
			}
		}
		return null;
	}
	
	public void remove(int key) {
		var entry = getEntry(key);
		if(entry == null)
			throw new IllegalStateException();
		
		 getBucket(key).remove(entry);
	}
	
	private LinkedList<Entry> getBucket(int key){
		return entries[hashFunction(key)];
	}
	
	private LinkedList<Entry> getOrCreateBucket(int key){
		var index = hashFunction(key);
		var bucket = entries[index];
		if(bucket == null)
			entries[index] = new LinkedList<>();
		
		bucket = entries[index];
		return bucket;
	}

	@Override
	public String toString() {
		return "HashTable [hashTable=" + Arrays.toString(entries) + "]";
	}
	
	
	
}
