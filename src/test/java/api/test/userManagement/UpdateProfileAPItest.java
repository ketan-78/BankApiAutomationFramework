package api.test.userManagement;

import org.testng.annotations.Test;

import api.base.UserManagementService;
import api.base.UtilityService;
import api.models.request.UpdateProfileRequest;
import api.models.response.UpdateProfileResponse;
import io.restassured.response.Response;

public class UpdateProfileAPItest {

	@Test
	public void updateProfile() {
		String token=UtilityService.getToken();

		UpdateProfileRequest updateProfileRequest=new UpdateProfileRequest("Ketan", "Chauhan", "ketan.chauhan0894@gmail.com", "0000000001");
		UserManagementService userManagement=new UserManagementService();
		Response response=userManagement.updateProfile(updateProfileRequest,token);
		UpdateProfileResponse updateProfileResponse=response.as(UpdateProfileResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(updateProfileResponse.getMobileNumber());
	}

}
