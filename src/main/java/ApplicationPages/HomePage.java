package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppUtils.Base;

public class HomePage extends Base {

	
	
	public HomePage()
	{
		super();
	
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="fromPlaceName")
WebElement from;
	

	public WebElement vrfyFromBox()
	{
		return from;
	}
	
	
	
	
	
	
	
	
}
