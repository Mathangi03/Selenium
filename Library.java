package week2.day1.homework;

public class Library {
	
	
	public String addBook(String bookTitle)
	
	{
		System.out.println("Book added successfully" + " - " +bookTitle);
		
		return bookTitle; 
	}
	
	
	public void issueBook()

	{
		System.out.println("Book Issued successfully");
	}

	public static void main(String[] args) {
		
		//syntax - classname objName = new Clasname()
		
		Library bookIssue = new Library();
		bookIssue.addBook("Frozen part 1");
		bookIssue.issueBook();
		

	}

}
