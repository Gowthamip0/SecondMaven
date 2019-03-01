package com.secondMaven.com.secondMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJenkins {

	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Gowthami Pulicherla//Documents//chromedriverlatest//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/selenium-continuous-integration/");
		
		
		
		
		System.out.println("Hello world");
		
		System.out.println("Another hello world");

	}

}
