package test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Initialization;
import pageClass.Myntra;

public class ScenarioBased {

	
	@Parameters({ "browser" , "url"})
	@BeforeTest
	public void browserInIt(String browser , String url) {
		Initialization.openBrowser(browser , url);
	}

	@Test
	public void practicalSecond() throws InterruptedException{
    
		Myntra.selectAndVerifyProduct();
   } 
	
	@AfterTest
	public void afterTest() {
		Initialization.driver.quit();
	}


}
