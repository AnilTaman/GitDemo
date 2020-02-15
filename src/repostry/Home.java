package repostry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='srchword']")
	WebElement Write;
	
	@FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
	WebElement sumit;
	
	public WebElement Written()
	{
		return Write;
	}
	public WebElement Sumitt()
	{
		return sumit;
	}
}
