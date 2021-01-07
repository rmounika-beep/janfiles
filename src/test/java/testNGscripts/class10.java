package testNGscripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class class10 {

@Test
public void dropdowncheck() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver ();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		//selct the drop down.
		//we use select for the drop downs.
		WebElement e=driver.findElement(By.xpath("//select[@name='coffee']"));
		Select dd=new Select(e);
	
		dd.selectByIndex(2);//it will select with sugar.
		Thread.sleep(2000);
		//below two are another ways.
		
		dd.selectByValue("crisp");//here crisp is value of the attribute.
		Thread.sleep(2000);
		dd.selectByVisibleText("With cream & sugar");
	
		Thread.sleep(3000);
		driver.close();
		
		//topics-dynamic drop downs.
				//open amazon and give serch book.here values are changing while giving search.
		
	List<WebElement> l=dd.getOptions();
	
	//assignment print all the values form the drop down using for loop or for each loop.
int count=	l.size();
	
	System.out.println(count);//here it returns the size value as 5.
	
for (int i=0;i<count;i++)
	{
		System.out.println(l.get(i).getText());
	}
	
	}
}