package week1.day2.homework;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int n , Firstnum=0, Secondnum=1 , nextnum;
       	System.out.print("The Fibonacci series is :" );
		
	
		
		for (int i=1; i<=10; i++)
		{
		
           
            nextnum=Firstnum + Secondnum;
            Firstnum=Secondnum;
            Secondnum=nextnum; 
        	System.out.print(+ Firstnum + ",");
		}
     
		
		

	}

}
