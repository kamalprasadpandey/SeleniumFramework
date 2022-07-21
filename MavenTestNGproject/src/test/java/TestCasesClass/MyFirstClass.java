package TestCasesClass;
import utility.HighlightObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CommonFunctions;
public class MyFirstClass {
	

	public WebDriver driver;
	
	@BeforeTest
	public void setup () throws Exception
	{
	String projectPath=System.getProperty("user.dir");
	//chrome setup
	System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	driver =new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void firstTC() throws Exception
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.launchApplication();
		cf.myWait(30);
		Thread.sleep(10000);
		WebElement ele =driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		 //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
		//HighlightObject ho= new HighlightObject(driver);
		//ho.highLighterMethod(driver,ele);
		cf.highLighterMethod(driver, ele); //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
		
	}
	
	
	
	
	
	@AfterTest
	public void after()
	{
		//driver.close();
	}

}
