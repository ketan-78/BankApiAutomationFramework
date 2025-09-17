package api.test.authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.base.AuthService;
import api.models.request.SignUpRequest;
import io.restassured.response.Response;

public class SignUpAPItest {
	
	@Test
	public void signUp()
	{
		SignUpRequest signUpRequest=new SignUpRequest.Builder()
				.username("RasasaahulRoyy")
				.firstName("Rahuly")
				.lastName("Royy")
				.email("rahasasaaulroy1y@gmail.com")
				.password("123456y")
				.mobileNumber("9123456789")
				.build();
		AuthService authService=new AuthService();
		Response response=authService.signup(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
