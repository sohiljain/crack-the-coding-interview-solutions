package datastructures;

import java.util.Arrays;

public class P4 {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("sohil");
		StringBuffer b = new StringBuffer("ilhos");
		
		System.out.println(anagram("ssohil", "ilhos"));
		System.out.println("These two strings are anagrams: " + checkAnagram(a,b));
	}

	public static boolean anagram(String s, String t) {

		if (s.length() != t.length()) return false;

		int[] letters = new int[256];

		int num_unique_chars = 0;

		int num_completed_t = 0;

		char[] s_array = s.toCharArray();

		for (char c : s_array) { // count number of each char in s.

			if (letters[c] == 0) 
			++num_unique_chars;

			++letters[c];

		}

		for (int i = 0; i < t.length(); ++i) {

			int c = (int) t.charAt(i);

			if (letters[c] == 0) { // Found more of char c in t than in s.

				return false;

			}

			--letters[c];

			if (letters[c] == 0) {

				++num_completed_t;

				if (num_completed_t == num_unique_chars) {

					// it’s a match if t has been processed completely

					return i == t.length() - 1;

				}

			}

		}

		return false;
	}
	
	private static <E> boolean checkAnagram(StringBuffer a, StringBuffer b){
		boolean check;
		
		char []a1 = a.toString().toCharArray();
		char []a2 = b.toString().toCharArray();
		
		for (int i = 0; i < a2.length; i++) {
			loop1:
			for (int j = 0; j < a1.length; j++) {
				if (a2[i]==a1[j]) {
					a1[j]='0'; a2[i]='0'; break loop1;
				}
			}
		}
		
		if (Arrays.equals(a1, a2)) 
			check = true;
		else 
			check = false;
		
		return check;

	}
	
	
}