package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testannotation2 {

	//we don't want to execute in alphabeticlaly and we want it as per the priority, so we wnat to excute wikipage first so we can add priority.
	//so we ahve to make to put proroity for evry test method.
	
	@Test(priority='1')
	public void wikipage()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.wikipedia.org/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Deepak Damegunta");
driver.findElement(By.xpath("//*[@type='submit']")).click();
driver.close();
	}
	//incase if we miss to marl prority as 2 then it will execute first as main page then wikipage.
	@Test(priority='2')
	public void Mainpage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Special:Search?search=selenium+testing&go=Go&ns0=1");
	driver.findElement(By.linkText("Main page")	).click();
	Thread.sleep(4000);
	driver.quit();
	}
	
}
