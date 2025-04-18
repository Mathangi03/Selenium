package week3.day1.homework;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	
	int[] a= {1, 4,3,2,8, 6, 7};
	
	//sort the array 
	
	Arrays.sort(a);
	
	for(int i=a[0];i<a.length;i++)
	{
		if(i!=a[i-1])
			
		{
			System.out.println("The Missing value is" +":" +i);
			break;
		}
	}
		
		
}
	
}
