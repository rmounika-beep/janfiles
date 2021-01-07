package testNGscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class validation {

	//validation of data using testNG
	//hard assertion is validation
	//i f we wnat to print the stament in console then we have to give true
	//i f we dont give true it will be availble in log meand reports.
	//w eare learning a fucntionality called assertions
	//Assertions in TestNG: thse helps us to validate and verify expected data to actual data.
	//tow types of assertions as:
	//hard assertions: we have assert class and we have method called 	assertequals(expected output,actual output)
	//in the baobe if both are equal the complier will go head and execute it.if not quals it will fail the script.
	//soft assertions:
	
	
	
	
	@Test
	
	public void myvalidation()
	{
		Reporter.log("this tis my test case for checking validation ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Reporter.log("opening chrome browser ",true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		String expectedtitle="Wikipedia";	//incase if we give "wikipedia123"it will fail the test case as it does not match.
	String actualtitle=driver.getTitle();
	Reporter.log("saved current title value in varaible title ");
	//hard assertions to validate your output, use assert class //assert to imprt from testng.
	
	Assert.assertEquals(actualtitle,expectedtitle,"script failed as title dont match as expected ");
	//hard assertion
	//if expectedtitle and actualtitle match script will continue to execute 
	//if expectedtitle and actualtitle do not match script will stop to execute
		
	String expectedurl="https://www.wikipedia.org/"; 
	String url=driver.getCurrentUrl();
	Reporter.log("saved current url value in varaible url ");
System.out.println(url);
	
}}
