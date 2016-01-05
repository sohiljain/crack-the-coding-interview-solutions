package datastructures;

public class P2 {
	public static void main(String[] args) {
		
		char[] string = {'a','b','c','0'};

		int i = 0;
		char c = 0;
		
		while (c != '0') {
			c = string[i];
			i++;
		}
		
		System.out.println(i);
		
		for (int j = i-1; j >=0 ; j--) {
			System.out.println(string[j]);
		}
		
		
	}
}
