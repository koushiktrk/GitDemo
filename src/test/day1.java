package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void last()
	{
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("last");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Bye");
	}
}
