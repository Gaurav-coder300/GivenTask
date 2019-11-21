package seleniumUtil;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Initialization;

public class SeleniumUtil {
  
	
	public static void moveToElement(WebElement webElement) {
		Actions a = new Actions(Initialization.driver);
        a.moveToElement(webElement).build().perform();
}
	
	public static void moveToElement(By identifier) {
		Actions a = new Actions(Initialization.driver);
        a.moveToElement(Initialization.driver.findElement(identifier)).build().perform();
}
	
	public static void clickElement(By identifier) {
		Initialization.driver.findElement(identifier).click();		
	}
	
	public static void waitVisibilityOfElement(By identifier , int time) {
		WebDriverWait wait = new WebDriverWait(Initialization.driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(identifier));	
	}

	   public static void capturescreen(WebDriver driver, String screenShotName, String status)
       {
           try {
              

               File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               FileUtils.copyFile(scrFile, new File("./Screenshots/" + screenShotName + ".png"));
               System.out.println("Printing screen shot taken for className "+ screenShotName);

           }
           catch (Exception e)
           {
               System.out.println("Exception while taking screenshot " + e.getMessage());
           }

       }
   }

