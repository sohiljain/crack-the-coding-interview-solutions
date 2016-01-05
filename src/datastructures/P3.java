package datastructures;

public class P3 {
	public static void main(String[] args) {

		StringBuffer string = new StringBuffer("asdfghgasdfg");

		outerloop:
			for (int i = 0; i < string.length(); i++) {
				for (int j = 0; j < string.length(); j++) {
					if(i!=j){
						if(string.charAt(i)==string.charAt(j)) {
							string.deleteCharAt(j);
						}
					}
				}
			}
		
		
		System.out.println(string);
	}
}
