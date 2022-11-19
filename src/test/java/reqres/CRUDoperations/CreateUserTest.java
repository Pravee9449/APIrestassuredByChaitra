package reqres.CRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {
	
	@Test
	public void createuser()
	{
		//create prerequisites-body
		JSONObject obj=new JSONObject();//works similar to hashmap
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		//send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.post("https://reqres.in/api/users");
		
		
		//validate the response
//		System.out.println(resp.getStatusCode());
//		System.out.println(resp.prettyPeek());
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
