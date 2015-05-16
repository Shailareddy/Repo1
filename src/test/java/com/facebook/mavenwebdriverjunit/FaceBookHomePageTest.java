package com.facebook.mavenwebdriverjunit;
import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookHomePageTest {
 WebDriver driver;
		
@Before
	public void testSetup(){
	    driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

@After
	public void testClose(){
		driver.quit();
	}

@Test
	public void testgetPageSignIn(){
	FaceBookHomePage fbdriver = new FaceBookHomePage(driver);
	//String actual = fbdriver.getPageSignIn(driver);
	assertEquals("Please re-enter your password", fbdriver.getPageSignIn());
    }

}
