package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPageObject 

{
WebDriver driver;
	
	public ProductListPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(css="ul#menu3 a:nth-of-type(2)")
	public WebElement all;
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	public WebElement e;
	
	@FindBy(xpath="//span[contains(text(),'Head Phone')]")
	public WebElement h;
}
