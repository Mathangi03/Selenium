package week4.day1.homework;

public class JavaConnectionAbstract extends MySqlConnection {
	

	public void connect() {

		System.out.println("system connected");
		
	}


	public void disconnect() {
		
		System.out.println("system disconnected");
		
	}

	
	public void executeUpdate() {

		System.out.println("system update executed");
		
	}


	public void executequery() {
		
		System.out.println("query executed");
	}


	public static void main(String[] args) {
	
		JavaConnectionAbstract obj= new JavaConnectionAbstract();
		obj.connect();
		obj.disconnect();
		obj.executequery();
		obj.executeUpdate();

	}

	
}
