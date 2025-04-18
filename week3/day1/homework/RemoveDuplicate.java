package week3.day1.homework;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
        int count=0;
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		//System.out.println(split[3]);
		
		for(int i=0;i<split.length;i++)
		{
			
			for(int j=i+1;j<split.length;j++)
				
			{
				
				if (split[i].equals(split[j]))
					
				{
					
					split[j]="";
					//count=count++;
				}
			}

			System.out.print(" "+split[i]);
		
		}
		
	}

	}


