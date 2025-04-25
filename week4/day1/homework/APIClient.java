package week4.day1.homework;

public class APIClient {
	
	public void sendRequest(String endpoint)
	
	{
		
		System.out.println("Endpoint is printed :" +endpoint);

	}
	
	public void sendRequest(String endpoint , String requestbody, boolean string)
	{
		
		System.out.println("Endpoint , requestbody, requestStatus is printed  :" +endpoint +":" +requestbody +":" +string);
		
	}

	public static void main(String[] args) {

		APIClient obj= new APIClient();
		obj.sendRequest("End of document");
		obj.sendRequest("End of document", "Body is printed",true);
		

	}

}
