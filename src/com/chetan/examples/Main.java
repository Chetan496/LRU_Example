package com.chetan.examples;

import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		LRUCache<String, String> lruCache = new LRUCache<String, String>(3) ;
		lruCache.put("1", "one");
		lruCache.put("2", "two");
		lruCache.put("3", "three");
		
		System.out.println("After adding 3 entries");
		for(Map.Entry<String, String> entry: lruCache.getAll()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		lruCache.get("1") ; // we accessed 1 , so 2 shud be replaced
		lruCache.put("4", "four");
		System.out.println("After adding one more entry");
		
		for(Map.Entry<String, String> entry: lruCache.getAll()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
