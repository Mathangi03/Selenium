package week4.day1.homework;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks()

	{
		System.out.println("Child class Common tasks are performed");

	}

	public static void main(String[] args) {
		
		LoginPage obj= new LoginPage();
		obj.findelement();
		obj.clickElement();
		obj.enterText();
		obj.performCommonTasks();

	}

}
