package api.test.account;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.base.AccountService;
import api.base.UtilityService;
import api.models.response.BankDetailsResponse;
import io.restassured.response.Response;

public class BankDetailsAPItest {
	
	@Test
	public void bankDetails() throws JsonMappingException, JsonProcessingException {
		
		String token=UtilityService.getToken();
		
		AccountService accountService=new AccountService();
		Response response=accountService.AccountsDetail(token);
		System.out.println(response.asPrettyString());
		
		//Deserialize Using Jackson’s ObjectMapper to map the array data
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData=response.asPrettyString();
		BankDetailsResponse[] accountArray=objectMapper.readValue(jsonData, BankDetailsResponse[].class);
		System.out.println(accountArray[1].getOwnerName());
		
		//to print the account numbers of all the account holders
		for(BankDetailsResponse act:accountArray) {
			System.out.println(act.getAccountNumber());
		}
	}

}
