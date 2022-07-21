package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {

	public WebDriver driver=null;
	private String baseUrl;
	public CommonFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void launchApplication()
	{
		myWait(30);
		baseUrl = "http://www.google.com";
		System.out.println("Inside launch Application");
		driver.get(baseUrl);
	}
		
	// Method to highlight object
		public void highLighterMethod(WebDriver driver, WebElement element){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			}
	
	public void myWait(int myTime)
	{
		
		driver.manage().timeouts().implicitlyWait(myTime, TimeUnit.SECONDS);
	}
}
