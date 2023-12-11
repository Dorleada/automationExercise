package AE.FirstToTenth;

import Pages.HomePage.HomePage;
import Pages.HomePage.TopBars;
import Pages.Signup_LoginPage.SUpLogin;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.TestBase;

public class _2_CaseAX extends TestBase {
    HomePage homePage;
    SUpLogin sUpLogin;
    @BeforeTest
    public void beforeTest(){
        homePage = new HomePage();
        sUpLogin = new SUpLogin();
    }
    @Test
    public void initial(){
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        homePage.navigateToSite();
        // 3. Verify that home page is visible successfully
        homePage.verifyMainPage();
    }
    @Test(dependsOnMethods = {"initial"})
    public void loginTest() {
        //4. Click on 'Signup / Login' button
        homePage.TopBarClicks(TopBars.SIGNUP_LOGIN);
        //5. Verify 'Login to your account' is visible
        //6. Enter correct email address and password
        //7. Click 'login' button
        sUpLogin.Login();
        //8. Verify that 'Logged in as username' is visible
        sUpLogin.verifyloggedAsUN();
    }
    @Test(dependsOnMethods = {"loginTest"})
    public void deleteAccount(){
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible
        homePage.deleteAccount();
    }
}
