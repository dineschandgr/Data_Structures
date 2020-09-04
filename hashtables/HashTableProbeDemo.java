package io.datastructures.hashtables;

public class HashTableProbeDemo {

	public static void main(String[] args) {
		HashTableProbe hashTableProbe = new HashTableProbe(5);
		hashTableProbe.put(0, "DC");
		hashTableProbe.put(0, "SDC");
		hashTableProbe.put(1, "welcome");
		hashTableProbe.remove(1);
		hashTableProbe.put(13, "welcome");
		System.out.println("val is "+hashTableProbe);
	}

}
