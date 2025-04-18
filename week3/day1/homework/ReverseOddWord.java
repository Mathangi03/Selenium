package week3.day1.homework;

public class ReverseOddWord {

	public static void main(String[] args) {
		
		String test ="I am a software tester";
		String[] splittest = test.split(" ");
	
		
		for(int i=0;i<splittest.length;i++)
			
		{
			
			if(i%2==1)
		   	
			{
				
				String output="";
				for(int j=splittest[i].length()-1;j>=0;j--)
					
				{
					output=output+splittest[i].charAt(j);
				}
				
				System.out.print(output + " ");
				
					
				}

			else 
			{
			 System.out.print(splittest[i]+ " ");	
			}
				
				
				
				
			}
		}
		
		
	}

