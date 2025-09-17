package api.base;

import io.restassured.response.Response;

public class UserManagementService extends BaseService{
	
private static final String BASE_PATH="/api/users/"; 
	
	public Response getProfile(String token)
	{
		setAuthToken(token);
		return getRequest(BASE_PATH+"profile");
	}

	public Response updateProfile(Object payload,String token)
	{
		setAuthToken(token);
		return updateRequest(payload,BASE_PATH+"profile");
	}
	
	public Response changePassword(Object payload,String token)
	{
		setAuthToken(token);
		return updateRequest(payload,BASE_PATH+"change-password");
	}
	
	public Response modifyUser(Object payload,String token)
	{
		setAuthToken(token);
		return patchRequest(payload,BASE_PATH+"profile");
	}
}
