package datastructures;

public class P1 {
	public static void main(String[] args) {
		
		String string = "lkasdjd";
		boolean unique=true;
		
		outerloop:
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if(i!=j){
					if(string.charAt(i)==string.charAt(j)) {
						System.out.println("The character " + string.charAt(i) + " repeats in the string at " + i + " and " + j + " positions");
						unique=false;
						break outerloop;
					}
				}
			}
		}
		
		if(unique)
		System.out.println("The string has all unique characters");
		
	}
}
