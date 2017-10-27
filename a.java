package com.selenium.webdriver.basic;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class a {

	String Username = "";
	String Password = "";
	String sEmailHost = "imap.mail.yahoo.com";
	String sEMailStoreType = "imaps";
	String sUrl;
	String Box_Email_address = "qa-team@sdxcentral.com";
	String Box_Password = "neova@123";
	private static WebDriver driver;
	private String sTodayssDate = "2017-07-03";

	public static void main(String[] args) {
		
		SDX_Newsletter_Daily_Scenario();
		
	}
	public static void SDX_Newsletter_Daily_Scenario() {
		try {
					
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.get("http://mailchi.mp/sdxcentral/top-tech-ceo-salaries-linux-open-sources-iot-project-456569?e=89de56382a");
					Thread.sleep(1000);
					File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//					sTodayssDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
					FileUtils.copyFile(scrFile, new File("D:\\Java_Test\\SeleniumDemo\\Screenshot\\a" + ".png"));
					
					driver.close();
						}
		catch(Exception e)
	{
		System.out.println("Exception" + e.getMessage());
	}
}}
