package restassuredpractices;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetOpration {
	@Test
	public void sampleGetRequest()
	{
		Response resp = RestAssured.get("http://localhost:3000/posts");
		System.out.println("status code "+resp.getStatusCode());
		System.out.println("contentType "+resp.getContentType());
		System.out.println("responcetime "+resp.getTime());
		System.out.println("complete response body");
		resp.prettyPrint();
		
		
	
	/*JSONObject jobj=new JSONObject();
	jobj.put("name", "Shital");
	jobj.put("id", 2);
	jobj.put("adress", "OAR");*/
		
	}

}
