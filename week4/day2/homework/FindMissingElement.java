package week4.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
     
		
		//declare a list 
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		//add numbers to List 
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(10);
		numberList.add(6);
		numberList.add(8);
		
		System.out.println("The number List is :" +numberList);
		
		//sort collection 
		
		Collections.sort(numberList);
		System.out.println("The List after sorting is :" +numberList);
		
		//get the size of list 
		
		int sizeofList = numberList.size();
		System.out.println("The List size is :" +sizeofList);
		
		for(int i=0; i<sizeofList-1 ;i++)
			
		{
			Integer currentElement = numberList.get(i+1);
			Integer nextElement=numberList.get(i)+1;
			
			//System.out.println(currentElement);
			//System.out.println(nextElement);
			
			if(currentElement!=nextElement)
			{
				int gapNum =numberList.get(i)+1;
				System.out.println("The Missing numbers is :"+gapNum);
			}
			
			else 
				
			{
				continue;
			}
		}

	}

}
