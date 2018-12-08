package com.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	@Test
	public static void Start(){
	System.setProperty("webdriver.chrome.driver", "src//Drivers//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
    //WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
}
