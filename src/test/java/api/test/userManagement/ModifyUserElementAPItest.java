package api.test.userManagement;

import org.testng.annotations.Test;

import api.base.UserManagementService;
import api.base.UtilityService;
import api.models.request.ModifyUserRequest;
import api.models.response.ModifyUserResponse;
import io.restassured.response.Response;

public class ModifyUserElementAPItest {
	
	@Test
	public void modifyUser() {
		
		String token=UtilityService.getToken();
		
		ModifyUserRequest modifyUserRequest=new ModifyUserRequest.Builder().firstName("Ketan")
				.lastName("Chauhan")
				.email("ketan.chauhan0894@gmail.com")
				.mobileNumber("1234567890")
				.address("India")
				.build();
		UserManagementService userManagementService=new UserManagementService();
		Response response=userManagementService.modifyUser(modifyUserRequest, token);
		ModifyUserResponse modifyUserResponse=response.as(ModifyUserResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(modifyUserResponse.getAddress());
	}
	
	
	

}
