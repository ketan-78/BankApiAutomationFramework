package api.test.authentication;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.base.AuthService;
import api.models.request.LoginRequest;
import api.models.response.LoginResponse;
import io.restassured.response.Response;

@Listeners(api.listeners.TestListener.class)
public class LoginAPItest {
	
	@Test(description="To verify if API for login is working..")
	public void loginTest()
	{
		LoginRequest loginRequest=new LoginRequest("kTc7", "swaggerAPI");
		AuthService authService=new AuthService();
		Response response=authService.login(loginRequest);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getId());
		
		Assert.assertEquals(loginResponse.getEmail(), "ketan.chauhan0894@gmail.com");
		Assert.assertEquals(loginResponse.getId(), 2442);
		Assert.assertTrue(loginResponse.getToken()!=null);
		

		
	}
}
