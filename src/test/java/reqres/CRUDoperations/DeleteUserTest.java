package reqres.CRUDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteUserTest {

	@Test
	public void deleteUser()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		ValidatableResponse validate = response.then();
		validate.log().all();
	}
}
