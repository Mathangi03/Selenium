package week3.day2.homework;

public class LoginTestData extends TestData {
	
	
	public void  enterUsername() 
	
	{
		
		System.out.println("Username entered");
	}
	
	public void enterPassword() 
	
	{
		System.out.println("Passsword entered");
	}

	public static void main(String[] args) {
		
		LoginTestData obj=new LoginTestData();
		obj.enterUsername();
		obj.enterPassword();
		obj.enterCredentials();
		obj.navigateToHomePage();
		

	}

}
