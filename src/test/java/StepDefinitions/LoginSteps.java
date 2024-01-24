package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public LoginSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }


    @Given("Login form in login page")
    public void loginPage() throws Exception {
    	
        HomePage home = new HomePage(driver, wait);
        home.homeIsDisplayed();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript(PropertiesReader.getValue("enable-flutter-dom"));
		
		
        //home.homePageIsDisplayed();
        home.clickLoginButton();
        home.homePageAfterLoginIsDisplayed();
    }

    @When("Submit email using \"(.*)\" and password using \"(.*)\"")
    public void submitEmailPassword(String email, String password) {

        LoginPage login = new LoginPage(driver, wait);
        login.loginPageIsDisplayed();
        login.fillEmailData(email);
        login.fillPasswordData(password);
        login.clickSignInButton();
    }

    @Then("Success login to home page with displaying account button")
    public void successLogin() {

    	LoginPage login = new LoginPage(driver, wait);
        Assert.assertTrue(login.landingPageIsDisplayed());
    }

    @Then("Login failed with displaying error message")
    public void loginFailed() {

        LoginPage login = new LoginPage(driver, wait);
       
    }
}