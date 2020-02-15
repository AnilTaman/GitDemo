package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import repostry.Home;
import repostry.Redifflg;

public class UI {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Redifflg lg=new Redifflg(driver);
		lg.US().sendKeys("Anil");
		lg.PW().sendKeys("12345");
		lg.HO().click();
		Home he=new Home(driver);
		he.Written().sendKeys("rediff");
		he.Sumitt().click();
		
	}

}
