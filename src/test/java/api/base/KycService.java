package api.base;

import io.restassured.response.Response;

public class KycService extends BaseService{
	
private static final String BASE_PATH="/api/kyc/"; 
	
	public Response getToken(String token)
	{
		setAuthToken(token);
		return getRequest(BASE_PATH+"status");
	}

}
