package api.test.authentication;

//import org.testng.Assert;
import org.testng.annotations.Test;

import api.base.AuthService;
import io.restassured.response.Response;

public class ForgotPasswordAPItest {
	
		@Test
		public void forgotPassword(){
		
		AuthService authService=new AuthService();
		Response response=authService.forgotPassword("ketan.chauhan0894@gmail.com");
		System.out.println(response.asPrettyString());
	}
}
