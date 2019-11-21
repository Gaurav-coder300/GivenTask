package pageClass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Initialization;
import seleniumUtil.SeleniumUtil;
import uiElements.MyntraUi;

public class Myntra {

	public static void selectAndVerifyProduct() throws InterruptedException {
		
		try {
		
			
			  SeleniumUtil.waitVisibilityOfElement(MyntraUi.logo, 30); Thread.sleep(5000L);
			  SeleniumUtil.moveToElement(MyntraUi.menLink);
			  
			  SeleniumUtil.moveToElement(MyntraUi.tshirtsLink);
			  SeleniumUtil.clickElement(MyntraUi.tshirtsLink);
			  
			  SeleniumUtil.moveToElement(MyntraUi.sort);
			  SeleniumUtil.waitVisibilityOfElement(MyntraUi.priceSort, 10);
			  
			  SeleniumUtil.moveToElement(MyntraUi.priceSort);
			  SeleniumUtil.clickElement(MyntraUi.priceSort);
			 
		
		List<WebElement> productBrands = Initialization.driver.findElements(MyntraUi.allProducts);
		for(int i=0; i<2;i++) {
			WebElement element = productBrands.get(i);
			
			SeleniumUtil.moveToElement(element);
			    Initialization.driver.findElement(By.xpath("(//*[contains(@class,'product-base')]//*[@class='product-actions ']//*[text()='Add to bag'])["+(i+1)+"]")).click();
				Initialization.driver.findElement(By.xpath("(//*[@class='product-base product-isActive']//*[@class='product-sizeButton'])["+(i+1)+"]")).click();


	           }
		
		SeleniumUtil.clickElement(MyntraUi.bag);
		List<WebElement> addedProducts = Initialization.driver.findElements(MyntraUi.productsinBag);
		if(addedProducts.size()==2) {
			System.out.println("2 products added successfully description is below");
		}
		else {
			System.out.println( addedProducts.size() + " products are added instead of 2 description is below");
		}
		 for(WebElement h:addedProducts) {
			 
			 System.out.println(h.getText());
		 }
		
		
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
