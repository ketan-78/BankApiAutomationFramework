package api.test.userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.base.UserManagementService;
import api.base.UtilityService;
import api.models.request.ChangePasswordRequest;
import io.restassured.response.Response;

public class ChangePasswordAPItest {
	
	@Test
	public void changePassword() {
		
		String token=UtilityService.getToken();
		System.out.println(token);
		
		ChangePasswordRequest changePasswordRequest=new ChangePasswordRequest("swaggerAPI", "swaggerAPII", "swaggerAPII");
		UserManagementService userManagementService=new UserManagementService();
		Response response=userManagementService.changePassword(changePasswordRequest, token);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(),200 );
	}

}
