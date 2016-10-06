package com.psl.testng;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.junit.After;
import org.junit.Before;
import org.junit.experimental.categories.Category;

public class SeleniumTest{
	
	//public static HtmlUnitDriver driver 	  		= new HtmlUnitDriver();
	private WebDriver driver;
	
  @Test
  public void testEmpDtls() throws InterruptedException {
	  
	  

		driver.findElement(By.name("uname")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).submit();
		Assert.assertEquals("Login Success", driver.getTitle());
			
  }
  
  @BeforeTest
  public void beforeTest() {
	  File file = new File("D:\\ENG\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
	  driver.get("http://localhost:8888/OpenSourcePipeline/LoginPage.jsp");
  }
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  try {
		Thread.sleep(3000);
		driver.close();driver.quit();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  
  }
}

