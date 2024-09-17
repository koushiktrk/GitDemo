package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void befoClass() {
		System.out.println("Will be executed before any methods in the class");
	}

	@Parameters({ "URL" })
	@Test
	public void WebLogin(String urlName) {

		System.out.println("Web Login");
		System.out.println(urlName);

	}

	@Test
	public void MobileLogin() {

		System.out.println("Mobile Login");

	}
	
	@Test
	public void MobileLeogin() {

		System.out.println("Mobile Login");

	}

	@Test(dataProvider="getData")
	public void MobileLogout(String username, String password) {

		System.out.println("Mobile Logout");
		System.out.println(username);
		System.out.println(password);

	}

	@BeforeMethod
	public void BeforeEvery() {
		System.out.println("I will execute before every method in class day3");
	}

	@BeforeSuite
	public void BfSuite() {
		System.out.println("1");
	}

	@Test(groups = { "Smoke" })
	public void MobileSignin() {

		System.out.println("Mobile Signin");

	}

	@AfterMethod
	public void AfterEvery() {
		System.out.println("I will execute after every method in class day3");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("will be executed after all the methods in the class");
	}

	@Test(dependsOnMethods = { "WebLogin" })
	public void APILogin() {

		System.out.println("Api Login");

	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination - username,password - good credit history
		// 2nd combination - username,password - no credit history
		// 3rd combination - username,password - fradulent credit history

		// Declare a multi dimensional array object
		Object[][] data = new Object[3][2];

		// 3 - because there are 3 combinations
		// 2 - because we are sending two values

		// 1st combination
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		// columns in the row are nothing but values for that particular
		// combination(row)

		// 2nd combination
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";

		// 3rd combination
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;

	}

}
