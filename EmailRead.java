package com.selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailRead {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neouser\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.google.com/mail");
		searchElement();
	}
	
	public void searchElement() {
		try {
		driver.findElement(By.xpath("//*[@class='Xb9hP']//input")).sendKeys("qsuryawanshi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='CwaK9']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='Xb9hP']//input")).sendKeys("madhura123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='CwaK9']//span")).click();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='zF']"));
		
		String sMailer = "Madhura Suryawanshi";
		
		for(int i=0; i<elements.size();i++) {
			
		//		System.out.println(elements.get(i).getText());
				if(elements.get(i).getText().equals(sMailer)) {
					Thread.sleep(30);
					elements.get(i).click();
				}
		
			}
		driver.findElement(By.xpath("//*[@class='ajz']")).click();
	List<WebElement> elements1 = driver.findElements(By.xpath("//*[@class='gL']//span[1]"));
	
		System.out.println(elements1.get(0).getText());
		System.out.println(elements1.get(4).getText());
		System.out.println(elements1.get(6).getText());
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@class='ajz']")).click();

	//	System.out.println(driver.findElement(By.xpath("//*[@id=':2s']//text()")).getText());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		EmailRead er = new EmailRead();
		er.invokeBrowser();

	}

}
