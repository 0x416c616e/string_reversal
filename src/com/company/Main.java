package com.company;

public class Main {

    public static void main(String[] args) {
	    String toReverse = "Hello world";
        char[] toReverseChars = toReverse.toCharArray();
        char[] reversedChars = toReverse.toCharArray();
	    for (int i = 0; i < toReverse.length(); i++) {
	        reversedChars[i] = toReverseChars[toReverseChars.length - i - 1];
        }
        String reservedString = String.valueOf(reversedChars);
	    System.out.println(reservedString);
    }
}
