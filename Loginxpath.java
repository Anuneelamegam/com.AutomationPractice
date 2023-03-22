package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginxpath {
	public Loginxpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/login']")
    public WebElement login;
	
	@FindBy(xpath = "(//input[@placeholder='Email Address'])[1]")
    public WebElement Emailaddress;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password;
	
	@FindBy(xpath ="(//button[@class='btn btn-default'and contains(.,Login)])[1]")
    public WebElement Login;
	
	@FindBy(xpath ="//a[@href='/logout']")
    public WebElement logout;
	


}
