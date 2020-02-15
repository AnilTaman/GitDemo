package repostry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Redifflg {
	WebDriver driver;
	public Redifflg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By hom=By.xpath("//a[contains(text(),'Home')]");
	
	public WebElement US()
	{
		return driver.findElement(username);
	}
	public WebElement PW()
	{
		return driver.findElement(password);
	}
	public WebElement HO()
	{
		return driver.findElement(hom);
	}
}
