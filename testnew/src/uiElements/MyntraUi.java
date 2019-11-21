package uiElements;

import org.openqa.selenium.By;




public class MyntraUi {

	
	public static  By menLink = By.xpath("//a[@href='/shop/men' and @class='desktop-main']");
	
	public static By logo = By.cssSelector(".myntraweb-sprite.desktop-logo.sprites-headerLogo");
	
	public static By tshirtsLink = By.xpath("//a[@href='/men-tshirts']");
	
	public static By sort = By.cssSelector(".sort-sortBy");
	
	
	
	public static By priceSort = By.xpath("//*[text()='Price: High to Low']");
	
	public static By allProducts = By.xpath("//*[@class='product-brand']");

	public static By bag = By.xpath("//a[@href=\"/checkout/cart\"]/span");

	public static By productsinBag = By.xpath("//*[@id='cartItemsList']/div//*[@class='itemContainer-base-itemLink']");
	
	
			
				
	
	
}
