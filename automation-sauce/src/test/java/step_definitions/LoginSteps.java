package step_definitions;

import com.example.pageObject.InventoryPage;
import com.example.pageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the web page")
    public void verifyLoginPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as userName and \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then("User will see \"(.*)\" on login page")
    public void displayErrorMessage(String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        assertEquals(errorText, loginPage.getErrorMessage());
    }
}
