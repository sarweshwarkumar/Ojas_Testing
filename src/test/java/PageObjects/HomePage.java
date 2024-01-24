package PageObjects;

import Utilities.BaseClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "flutter-view")
    @CacheLookup
    private WebElement homebutton;

//    @FindBy(id = "flt-semantic-node-72")
//    @CacheLookup
//    private WebElement productButton;
//
//    @FindBy(id = "flt-semantic-node-73")
//    @CacheLookup
//    private WebElement aboutButton;
//
//    @FindBy(id = "flt-semantic-node-74")
//    @CacheLookup
//    private WebElement getQuoteButton;
//
      @FindBy(css = "flt-semantics[aria-label='LOGIN']")
      @CacheLookup
      private WebElement homeloginButton;
//
//    @FindBy(id = "flt-semantic-node-76")
//    @CacheLookup
//    private WebElement contactButton;
//
    @FindBy(css = "input[aria-label='Enter username']")
    @CacheLookup
    private WebElement userInput;

    
    @FindBy(css = "input[aria-label='Enter password']")
    @CacheLookup
    private WebElement passwordInput;

    
    @FindBy(css = "flt-semantics[aria-label='Login']")
    @CacheLookup
    private WebElement loginButton;

    public boolean homeIsDisplayed() {

        WaitUntilElementVisible(homebutton);
        homebutton.isDisplayed();
        
        return true;
    }
  //  public boolean homePageIsDisplayed() {

//        WaitUntilElementVisible(homebutton);
//        homebutton.isDisplayed();
//        
//       
//        WaitUntilElementVisible(productButton);
//        productButton.isDisplayed();
//        
//        WaitUntilElementVisible(aboutButton);
//        aboutButton.isDisplayed();
//        
//        WaitUntilElementVisible(getQuoteButton);
//        getQuoteButton.isDisplayed();
        
 //       WaitUntilElementVisible(loginButton);
 //       loginButton.isDisplayed();
        
//        WaitUntilElementVisible(contactButton);
//        contactButton.isDisplayed();
        
 //       return true;
//    }

    public void clickLoginButton() {

        WaitUntilElementVisible(homeloginButton);
        homeloginButton.isEnabled();
        homeloginButton.click();
    }

    public boolean homePageAfterLoginIsDisplayed() {

        WaitUntilElementVisible(userInput);
        userInput.isDisplayed();
        
        WaitUntilElementVisible(passwordInput);
        passwordInput.isDisplayed();
        
        WaitUntilElementVisible(loginButton);
        loginButton.isDisplayed();
        
        return true;
    }
}