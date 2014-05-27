package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEcl {
	public static void main(String [] args){
		
		WebDriver driver = new FirefoxDriver();
		WebElement field;
		driver.get("http://www.google.com");
		field = driver.findElement(By.id("gbqfq"));
		field.sendKeys("automation testing");
		field.submit();
		
	}
}
