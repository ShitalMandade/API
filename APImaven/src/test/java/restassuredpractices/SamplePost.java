package restassuredpractices;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePost {
	@Test
	 public void samplePost() {
		JSONObject jobj=new JSONObject();
		jobj.put("name", "Shital");
		jobj.put("address", "Goa");

 RestAssured.given().body(jobj.toString()).contentType(ContentType.JSON).when().post("http://localhost:3000/posts").then().log().all();
		
		
	}

}
