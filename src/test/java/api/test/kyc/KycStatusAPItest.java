package api.test.kyc;

import org.testng.annotations.Test;

import api.base.KycService;
import api.base.UtilityService;
import api.models.response.KycStatusResponse;
import io.restassured.response.Response;

public class KycStatusAPItest {
	
	@Test
	public void kycStatus() {
		String token=UtilityService.getToken();
		
		KycService kycService=new KycService();
		Response response =kycService.getToken(token);
		KycStatusResponse kycStatusResponse=response.as(KycStatusResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(kycStatusResponse.getOverallStatus());
		
	}

}
