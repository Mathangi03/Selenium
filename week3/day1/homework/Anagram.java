package week3.day1.homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int length1 = text1.length();
		int length2 = text2.length();
		
		if (length1==length2)
		
		{
			
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
		    Arrays.sort(charArray1);
		    Arrays.sort(charArray2);
		    
		    if(Arrays.equals(charArray1, charArray2))
		    	
		    {
		    	
		    	System.out.println("The given Strings are Anagram");
		    	
		    }
		    
		    else
		    	
		    {
		    	
		    	System.out.println("The given strings are not Anagram");
		    }
		    
		}
		
		
		else
			
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			
		}
		
		

	}

}
