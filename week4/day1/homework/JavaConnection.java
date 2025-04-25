package week4.day1.homework;

public class JavaConnection implements DatabaseConnection {
	
	

	public void connect() {
		
		System.out.println("system connected ");
	}


	public void disconnect() {

		System.out.println("System disconnected ");
		
	}

	public void executeUpdate() {
		
		System.out.println("system update executed ");
		
	}


	public static void main(String[] args) {
	
		JavaConnection obj= new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}

	
}
