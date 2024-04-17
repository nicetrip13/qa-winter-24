package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.BaseFunc;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;

public class RegistrationStepDefs {
    private BaseFunc baseFunc;
    private HomePage homePage;
    private LoginPage loginPage;
    @Given("user name: {string}")
    public void setUserName(String firstName) {

    }
    @Given("user lastname {string}")
    public void setUserLastName(String lastName) {

    }
    @Given("user email: {string}")
    public void setEmail(String email){

    }
    @Given("new password is {string}")
    public void setPassword(String password) {

    }
    @When("we open browser window")
    public void openBrowserWindow() {
        BaseFunc baseFunc = new BaseFunc();
    }
    @When("open home page")
    public void openHomePage() {
        baseFunc.openURL("1a.lv");
        homePage = new HomePage(baseFunc);
    }
    @When("we accept cookies")
    public void acceptCookies() {
     homePage.acceptCookies();
    }
    @When("we are pressing Registration - login btn")
    public void openLoginPage() {
        homePage.openLoginPage();
        loginPage = new LoginPage(baseFunc);
    }
    @When("we are opening registration form")
    public void openRegistrationPage() {
        loginPage.openRegistrationPage();
    }

}
