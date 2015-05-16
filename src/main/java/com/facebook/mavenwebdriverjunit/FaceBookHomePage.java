package com.facebook.mavenwebdriverjunit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FaceBookHomePage {
WebDriver driver;
	
    public FaceBookHomePage(WebDriver driver){
    	this.driver = driver;
    }
	
	public String getPageSignIn(){
	
	//get email Textbox
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("jrgosalia@gmail.com");
	//get password Textbox
		WebElement passwdTextBox = driver.findElement(By.id("pass"));
		passwdTextBox.sendKeys("sdaygfyewa");
	//get Keepme Signin Checkbox
		WebElement keepCheckbox = driver.findElement(By.id("persist_box"));
		keepCheckbox.click();
	    WebElement loginbox = driver.findElement(By.id("u_0_n"));
	    loginbox.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement errorbox = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']"));
	   // System.out.println(errorbox.getText());
	    
	   return errorbox.getText();
	
	}
	
	
}
