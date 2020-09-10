package com.morgagePr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator {
	//C:\Users\tesfo\eclipse-workspace\seleniump\practice 7\com.morgagePrc\src\test\resources
@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver84.exe");
		WebDriver driver = new ChromeDriver(); // opens Chrome browser
		driver.manage().window().maximize();
	
		
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.wait(2000);
		for(int i=0;i<20;i++) {
WebElement elm=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div["+i+"]'"));
elm.sendKeys("abcd");		
driver.wait(2000);
driver.close();
		}		
	
	
}
	}

	
