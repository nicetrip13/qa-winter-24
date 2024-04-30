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
    public void set_user_name(String firstName) {

    }
    @Given("user lastname {string}")
    public void set_user_last_name(String lastName) {

    }
    @Given("user email: {string}")
    public void set_email(String email){

    }
    @Given("new password is {string}")
    public void set_password(String password) {

    }
    @When("we open browser window")
    public void open_browser_window() {
        baseFunc = new BaseFunc();
    }
    @When("open home page")
    public void open_home_page() {
        baseFunc.openURL("1a.lv");
        homePage = new HomePage(baseFunc);
    }
    @When("we accept cookies")
    public void accept_cookies() {
        homePage.acceptCookies();
    }
    @When("we are pressing Registration/login btn")
    public void open_login_page() {
        homePage.openLoginPage();
        loginPage = new LoginPage(baseFunc);
    }
    @When("we are opening registration form")
    public void open_registration_page() {
        loginPage.openRegistrationPage();
    }

}
