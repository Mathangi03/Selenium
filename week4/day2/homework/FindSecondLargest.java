package week4.day2.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		List<Integer> numberList1 = new ArrayList<Integer>();

		// add numbers to list

		numberList1.add(3);
		numberList1.add(2);
		numberList1.add(11);
		numberList1.add(4);
		numberList1.add(6);
		numberList1.add(7);

		System.out.println(numberList1);

		// collection class is used and by default it is sorted in ascending order

		Collections.sort(numberList1);
		System.out.println("collection after sorting :" + numberList1);

		// to get size

		int sizeofList = numberList1.size();
        System.out.println("The size of List is :" +sizeofList);
        
        //to print second largest 
        
        Integer dataAtIndex = numberList1.get(sizeofList-2);
        System.out.println("The second largest is : "+dataAtIndex);

	}

}
