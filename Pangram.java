package Pangram;


	import java.util.HashSet;
	import java.util.Scanner;

	public class Pangram {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = s.nextLine();
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	    
	    public static boolean isPangram(String s) {
	        s = s.toLowerCase(); // Convert the input to lowercase for case-insensitivity
	        HashSet<Character> letters = new HashSet<>();
	        
	        for (char c : s.toCharArray()) {
	            if (Character.isLetter(c)) {
	                letters.add(c);
	            }
	        }
	        
	        return letters.size() == 26; // There are 26 letters in the English alphabet
	    }
	}


