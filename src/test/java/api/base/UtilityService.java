package api.base;

import api.models.request.LoginRequest;
import api.models.request.UpiInitiateRequest;
import api.models.response.LoginResponse;
import api.models.response.UpiInitiateResponse;
import io.restassured.response.Response;

public class UtilityService {

	public static String getToken() {
		LoginRequest loginRequest=new LoginRequest("kTc7", "swaggerAPI");
		AuthService authService=new AuthService();
		Response response=authService.login(loginRequest);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		//System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		return loginResponse.getToken();
		
	}
	
	public static String getTransactionReference(String token) {		
		UpiService upiService=new UpiService();
		UpiInitiateRequest upireInitiateRequest=new UpiInitiateRequest("fromUPI@abc", "toUPI@acb", 10000, "Payment");
		Response response=upiService.initiate(token, upireInitiateRequest);
		UpiInitiateResponse upiInitiateResponse=response.as(UpiInitiateResponse.class);
		//System.out.println(response.asPrettyString());
		System.out.println(upiInitiateResponse.getTransactionRef());
		return upiInitiateResponse.getTransactionRef();
		
	}
}
