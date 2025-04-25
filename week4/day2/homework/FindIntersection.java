package week4.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		// declare Array List 1

		List<Integer> numberList1 = new ArrayList<Integer>();

		// declare Array List 2

		List<Integer> numberList2 = new ArrayList<Integer>();

		// Add number to List 1

		numberList1.add(3);
		numberList1.add(2);
		numberList1.add(11);
		numberList1.add(4);
		numberList1.add(6);
		numberList1.add(7);

		// Add number to List 2

		numberList2.add(1);
		numberList2.add(2);
		numberList2.add(8);
		numberList2.add(4);
		numberList2.add(9);
		numberList2.add(7);

		System.out.println(numberList1);
		System.out.println(numberList2);

		int sizeofList1 = numberList1.size();
		int sizeofList2 = numberList2.size();
		
		System.out.println(sizeofList1 +":" +sizeofList2);
		
		//Iterate through length of list 
		
		for(int i=0;i<sizeofList1;i++)
			
		{
			for(int j=0; j<sizeofList2;j++)
			{
				
				if(numberList1.get(i)==numberList2.get(j))
					
				{
					
					System.out.println("The Intersection numbers are :" +numberList1.get(i));
				}
			}
			
		}

	}

}
