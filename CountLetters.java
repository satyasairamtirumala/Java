package javaprogrammer;
import java.util.*;
import java.util.ArrayList;
import java.math.*;


	class CountLetters {
	    
	    public static int frequencyOfChar(String str, char ch) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static char mostFrequentChar(String str) {
	        int max = 0;
	        char maxChar = ' ';
	        str = str.replace(" ", ""); // Remove spaces

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int freq = frequencyOfChar(str, ch);
	            if (freq > max) {
	                max = freq;
	                maxChar = ch;
	            }
	        }

	        return maxChar;
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();

	        char c = mostFrequentChar(str);
	        int freq = frequencyOfChar(str.replace(" ", ""), c);

	        System.out.println("Most frequent character: " + c);
	        System.out.println("Frequency: " + freq);

	        sc.close();
	    }
	

    }
	
