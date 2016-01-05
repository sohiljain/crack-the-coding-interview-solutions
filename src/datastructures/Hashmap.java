package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {

	public static void main(String[] args) {
		System.out.println(arrayList());
	}

	public HashMap<Integer, Integer> hashMap() {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0, j = 2 ; i < 5; i++, j++) {
			hashMap.put(i, j);
		}
		return hashMap;
	}
	
	public static ArrayList<String> arrayList() {
		ArrayList<String> arrList = new ArrayList<String>();
		for (char i = 'a'; i < 'e'; i++) {
			arrList.add(String.valueOf(i));
		}
		return arrList;
	}

}