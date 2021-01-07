package testNGscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {

	//topics:softassertion:
	//this is verification
	//softassert ,asserequals(actual,expected)
	//steps
	//create object for sortassert clas
	//call method assertequals();
	//in the last, call method assertall;
@Test
	
	public void myvalidation()
	{
		Reporter.log("this tis my test case for checking validation ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Reporter.log("opening chrome browser ",true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		String expectedtitle="Wikipedia123";	//it incorrect expected title
	String actualtitle=driver.getTitle();
	Reporter.log("saved current title value in varaible title ");
	
	SoftAssert	sf=new SoftAssert();
	sf.assertEquals(actualtitle, expectedtitle,"expectedtitle doesnt match actualtitle");
	
		
	//soft assertion :here we verify the results and not validate
	//if expectedtitle and actualtitle match script will continue to execute 
	//if expectedtitle and actualtitle do not match script will continue the execution but will also give error message to user where results dont match
	
	//soft assertion incase if does not  match expected and actual output it will throw the error but it will continue to execute the script.
	//soft assertion here we verify the results 
		
	
	String expectedurl="https://www.wikipedia.org/"; 
	String actualurl=driver.getCurrentUrl();
	Reporter.log("saved current url value in varaible url ");
System.out.println(actualurl);
sf.assertEquals(actualurl, expectedurl,"expected url do nto amtch the actual url");
sf.assertAll();
	}}
