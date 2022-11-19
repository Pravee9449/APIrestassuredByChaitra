package reqres.CRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
	
	@Test
	public void getAllUsers()
	{
		//JSONObject obj=new JSONObject();
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		ValidatableResponse validation = resp.then();
		validation.log().all();
		
	}

}
