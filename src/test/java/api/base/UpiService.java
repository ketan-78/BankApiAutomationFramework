package api.base;

import java.util.HashMap;

import io.restassured.response.Response;

public class UpiService extends BaseService{
	
private static final String BASE_PATH="/api/upi/"; 
	
	public Response initiate(String token,Object payload)
	{
		setAuthToken(token);
		return postRequest(payload, BASE_PATH+"payment/initiate");
	}
	
	public Response status(String token,String ref) {
		setAuthToken(token);
		return getRequest(BASE_PATH+"payment/status/"+ref);
	}
	
	public Response qrCode(String token,Object payload) {
		setAuthToken(token);
		return postRequest(payload,BASE_PATH+"qr-code/generate");
	}
	
	public Response verify(String token,String upiId) {
		setAuthToken(token);
		HashMap<String,String> payload=new HashMap<>();
		payload.put("upiId", upiId);
		return postRequest(payload, BASE_PATH+"verify");	
	}

}
