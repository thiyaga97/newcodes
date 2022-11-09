package pageobject.fbfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//input[@id='email']")
	private WebElement textUser;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement textPass;
	@FindBy(xpath="//*[@name='login']")
	private WebElement clickLogin;
	public WebElement getTextUser() {
		return textUser;
	}
	public WebElement getTextPass() {
		return textPass;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}
	
	
	
}
