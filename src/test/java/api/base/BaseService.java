package api.base;

import static io.restassured.RestAssured.*;

import api.filters.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	private static final String BASE_URL="http://64.227.160.186:8080"; 
	private RequestSpecification requestSpecification;
	
	//It we put it in the constructor then it will be called repeatedly during parallel execution.
	static{  //This code block will only execute once.
		RestAssured.filters(new LoggingFilter());;
	}
	public BaseService()
	{ 
		requestSpecification=given().baseUri(BASE_URL); 
	}
	
	protected Response postRequest(Object payload,String endpoints)
	{
		return requestSpecification.body(payload).log().body().accept(ContentType.JSON).contentType(ContentType.JSON)
				.post(endpoints); 
	}
	
	//it will set the bearer token for the get request.
	protected void setAuthToken(String token) {
		 requestSpecification.headers("Authorization","Bearer "+token);
	}
	
	protected Response getRequest(String endpoints) {
		return requestSpecification.get(endpoints);
	}
	
	protected Response updateRequest(Object payload,String endpoints) {
		return requestSpecification.body(payload).log().body().accept(ContentType.JSON)
				.contentType(ContentType.JSON).put(endpoints);
	}
	protected Response patchRequest(Object payload,String endpoints) {
		return requestSpecification.body(payload).log().body().accept(ContentType.JSON)
				.contentType(ContentType.JSON).patch(endpoints);
	}
	
}