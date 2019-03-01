package com.secondMaven.com.secondMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Gowthami Pulicherla//Documents//chromedriverlatest//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/selenium-continuous-integration/");
		
		
		
		
		System.out.println("Hello world");
		
		System.out.println("Another hello world");

	}

}
