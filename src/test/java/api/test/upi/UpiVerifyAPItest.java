package api.test.upi;

import org.testng.annotations.Test;

import api.base.UpiService;
import api.base.UtilityService;
import io.restassured.response.Response;

public class UpiVerifyAPItest {
	
	@Test
	public void verify() {
		
		String token=UtilityService.getToken();
		
		UpiService upiService=new UpiService();
		Response response=upiService.verify(token, "Zudio@abc");
		System.out.println(response.asPrettyString());
	}

}
