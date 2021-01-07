package testNGscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class4_annotations {

	@BeforeMethod
	
	public void login()
	
	{
		System.out.println("login into mail box ");
	}
	@Test(priority='1')
	public void createmail()
	{
		System.out.println("to create email test scripts executed");
	}
	
	@Test(priority='2')
	public void modifyemail()
	{
		System.out.println("to modify eamil test steps executed");
	}
	
	@Test(priority='3')
	public void deleteemail()
	{
	System.out.println("to create email test steps executed");
}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout into mail box");
	}
}
