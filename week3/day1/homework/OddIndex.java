package week3.day1.homework;

public class OddIndex {

	public static void main(String[] args) {
		
		String name="changeme";
		
		//convert string to Character array 
		
		char[] charname = name.toCharArray();
		
		for(int i=1;i<charname.length;i=i+2)
			
		{
			charname[i]= Character.toUpperCase(charname[i]);	
				
		}
		
		System.out.println(charname);

				
			
			
		}
		
		

	}

