package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {
    	
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[aria-label='Enter username']")
    @CacheLookup
    private WebElement emailField;

    
    @FindBy(css = "input[aria-label='Enter password']")
    @CacheLookup
    private WebElement passwordField;

    
    @FindBy(css = "flt-semantics[aria-label='Login']")
    @CacheLookup
    private WebElement signInButton;
    
    @FindBy(css = "flt-semantics[aria-label='RFQ']")
    @CacheLookup
    private WebElement landingPage;
    
    public void fillEmailData(String email) {

        WaitUntilElementVisible(emailField);
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPasswordData(String password) {
    	WaitUntilElementVisible(passwordField);
    	new Actions(driver).moveToElement(passwordField).click().sendKeys(password).build().perform();
    	

		/*
		 * WaitUntilElementVisible(passwordField); passwordField.isEnabled();
		 * passwordField.clear(); passwordField.sendKeys(password);
		 */
    }

    public void clickSignInButton() {

        WaitUntilElementVisible(signInButton);
        signInButton.isEnabled();
        signInButton.click();
    }

    

    public boolean loginPageIsDisplayed() {

        
        WaitUntilElementVisible(emailField);
        emailField.isDisplayed();
        WaitUntilElementVisible(passwordField);
        passwordField.isDisplayed();
        WaitUntilElementVisible(signInButton);
        signInButton.isDisplayed();
       
        return true;
    }
 public boolean landingPageIsDisplayed() {

        
        WaitUntilElementVisible(landingPage);
        landingPage.isDisplayed();
        
       
        return true;
    }
    
}