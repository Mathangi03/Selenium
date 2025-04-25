package week4.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		List<String> Companies = new ArrayList<String>();
		
		//add values to array 
		
		Companies.add("HCL");
		Companies.add("Wipro");
		Companies.add("Aspire Systems");
		Companies.add("CTS");
	
		System.out.println(" The list of companies are :" +Companies);
		
		//sort the List 
		
		Collections.sort(Companies);
		System.out.println("The list after sorting : " +Companies);
		
		//size of list 
		
		int sizeofList = Companies.size();
		System.out.println("The list size is :" +sizeofList);
		
		List<String> ReverseCompanies = new ArrayList<String>();
		
		//To print in reverse order 
		for(int i=sizeofList-1 ; i>=0; i--)
		{
			ReverseCompanies.add(Companies.get(i));
		}
		
		System.out.println("The List of reverese order is :" +ReverseCompanies);

	}

}
