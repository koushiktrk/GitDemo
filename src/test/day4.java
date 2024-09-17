package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({ "URL","APIKey/username" })
	@Test
	public void WebLogin(String urlName, String key) {

		System.out.println("WebloginHome");
		System.out.println(urlName);
		System.out.println(key);
	}

	@Test(groups = { "Smoke" })
	public void MobileLogin() {

		System.out.println("MobileloginHome");

	}

	@Test
	public void LoginApi() {

		System.out.println("ApiLoginHome");

	}

}
