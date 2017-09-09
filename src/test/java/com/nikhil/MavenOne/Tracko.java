package com.nikhil.MavenOne;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tracko
{
	WebDriver driver;
	@Parameters("browsertest")

	
  @BeforeClass
   public void abc(String browser)
	{
	
		
		
	  
	if(browser.equals("ChromeXYZ"))
	{
		 System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://dev.tracko.co.in/");
	}
		
	if(browser.equals("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.get("http://dev.tracko.co.in/");
	}
	if(browser.equals("IE"))
	{
		 System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
		  driver= new InternetExplorerDriver();
		  driver.get("http://dev.tracko.co.in/");
	}
	 
	  
	 }
	
	
  @Test
  public void f()
  {
	  System.out.println("This is Test");
  

  }
 
  public void signup() throws InterruptedException
  {
	  SignUp ref=new SignUp(driver);
	  ref.signup();
	  
  }
  public void login() throws InterruptedException
  {
	  LogIn ref=new LogIn(driver);
	  ref.login();
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
	  
  }

}
