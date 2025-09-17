package api.base;

import io.restassured.response.Response;

public class AccountService extends BaseService{

	private static final String BASE_PATH="/api/accounts";
	
	public Response modifyAccount(Object payload,String token) {
		setAuthToken(token);
		return postRequest(payload, BASE_PATH);
	}
	
	public Response AccountNumberDetail(String actNo,String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH+"/"+actNo);
	}
	
	public Response AccountsDetail(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH+"/user");
	}
}
