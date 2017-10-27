package com.selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class YoutubeDemo {
	WebDriver driver;
	JavascriptExecutor js;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neouser\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchElement();
	}
	
	public void searchElement() {
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("1 million dance studio");
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js= (JavascriptExecutor) driver;
		//js.executeAsyncScript("scroll(0,800)");
//		
		List<WebElement> we = driver.findElements(By.xpath("//*[@id='title-wrapper']//a"));
		System.out.println(we.size());
		System.out.println(we.get(5).getText());
	//	we.get(6).click();
				
				
//				driver.findElement(By.xpath("//a[contains(text(),'Despacito - Luis Fonsi, Daddy Yankee')]")).click();
	//	js.executeScript("arguments[0].scrollIntoView(true);",element);
		//element.click();
	//	Actions actions = new Actions(driver);
	//	actions.moveToElement(element);
		// actions.click();
	//	actions.perform();
	}
	public static void main(String[] args) {
		YoutubeDemo yd = new YoutubeDemo();
		yd.invokeBrowser();
	}

}
