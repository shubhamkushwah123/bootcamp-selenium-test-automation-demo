package com.mentorbabaa.selenium;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
       
    	
    	//1. Setting up Web Driver
    	//System.setProperty("webdriver.chrome.driver", "/Users/shubham/Documents/softwares/chrome-driver/chromedriver");
    	
    	
    	System.out.println("Script Started");
    	WebDriverManager.chromedriver().setup();
    	
    	ChromeOptions chromeOptions = new ChromeOptions();
    	
    	chromeOptions.addArguments("--headless");
    	
    	//2. Initialize Driver
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	
    	//3. Open Broser and get the App
    	driver.get("http://3.22.248.177:8081/addressbook-2.0/");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(By.className("v-button")).click();
    	
    	Thread.sleep(1000);
    	//locate and enter the value for firstname
    	driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
    	
    	Thread.sleep(1000);
    	//locate lastname and enter the value
    	driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
    	
    	Thread.sleep(1000);
    	//locate phone number and enter value
    	driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
    	
    	Thread.sleep(1000);
    	//locate email and enter value
    	driver.findElement(By.id("gwt-uid-11")).sendKeys("shubham@xyz.com");
    	
    	Thread.sleep(1000);
    	//locate date of birth and enter value
    	driver.findElement(By.id("gwt-uid-13")).sendKeys("14/02/2024,");
    	
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
    	
    	//String output = driver.findElement(By.className("v-Notification")).getText();
    	
    	//System.out.println(output);
    	
    	//assertEquals("Saved 'Shubham Singh Kushwah'.",output);
    	
    	
    	
    	
        //Take Screenshot
    	
    	TakesScreenshot scrShot = ((TakesScreenshot)driver);
    	
    	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
    	
        File destFile = new File("success-report.jpg");
        
        FileUtils.copyFile(srcFile,destFile);
        
        System.out.println("Screenshot is stored at " + destFile.getAbsolutePath());
    	
        //  Close the Browser
    	driver.quit();
    	
    	
    	
    	
    }
}
