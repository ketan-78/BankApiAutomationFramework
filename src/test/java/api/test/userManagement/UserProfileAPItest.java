package api.test.userManagement;

import org.testng.annotations.Test;

import api.base.UserManagementService;
import api.base.UtilityService;
import api.models.response.UserManagementResponse;
import io.restassured.response.Response;

public class UserProfileAPItest {

	@Test
	public void profile() {
		String token=UtilityService.getToken();
		
		UserManagementService userManagement=new UserManagementService();
		Response response=userManagement.getProfile(token);
		UserManagementResponse userManagementResponse=response.as(UserManagementResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(userManagementResponse.getEmail());
	}
	
}
