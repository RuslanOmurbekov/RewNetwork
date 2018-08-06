package steps;
import com.jayway.restassured.specification.RequestSpecification;

import beans.CustomResponse;
import beans.Repository;

import com.jayway.restassured.http.*;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.path.json.JsonPath;


import com.jayway.restassured.RestAssured;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import utilities.WebServiceRunner;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Sort {
	public static RequestSpecification request;
	public static Response response;
	private static CustomResponse resp;
	private static ObjectMapper mapper = new ObjectMapper();	
	
}
