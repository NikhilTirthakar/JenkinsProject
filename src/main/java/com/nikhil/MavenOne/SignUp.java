package com.nikhil.MavenOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp 
{
	WebDriver driver;
	public SignUp(WebDriver driver2)
	{
		// TODO Auto-generated constructor stub
		driver = driver2;
	}
	public void signup() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains (text(),'Sign Up Free')]")).click();
	  //driver.findElement(By.xpath("//a[text()='Sign Up Free']")).click();
	  
	  
	  
	  // driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[6]/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Nikhil");
		driver.findElement(By.id("email")).sendKeys("alliswell@tracko.com");
		driver.findElement(By.id("mobile")).sendKeys("4444444443");
		driver.findElement(By.id("sub_btn_signup")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("otp")).sendKeys("123456");
		driver.findElement(By.id("sub_btn_verify")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		///html/body/div[3]/div[2]/button[1]
		driver.findElement(By.id("password")).sendKeys("niki@12345");
		driver.findElement(By.id("repassword")).sendKeys("niki@12345");
		driver.findElement(By.id("sub_btn_setpass")).click();	
	}

}
