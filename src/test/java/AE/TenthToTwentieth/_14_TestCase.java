package AE.TenthToTwentieth;

import Pages.HomePage.HomePage;
import Pages.HomePage.TopBars;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;
import static utilities.Locators.*;
public class _14_TestCase extends TestBase {
    @Test
    public void RegisterWhileCheckout(){
      HomePage homePage = new HomePage();
      // 1. Launch browser
      // 2. Navigate to url 'http://automationexercise.com'
      homePage.navigateToSite();
      // 3. Verify that home page is visible successfully
      homePage.verifyMainPage();
//        4. Add products to cartPage
        addProductsToCart(3);
//        5. Click 'CartPage' button
        homePage.TopBarClicks(TopBars.CART);
//        6. Verify that cartPage page is displayed
        verifyVisibility(lShoppingCartTxt);
//        7. Click Proceed To Checkout
        click(lProceedToChckout);
//        8. Click 'Register / Login' button
        click(lRegisterLoginChckout);
//        9. Fill all details in Signup and create account
        newUserSignUp();
//        10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        verifyVisibility(lAccountCreatedText);
//        11. Verify ' Logged in as username' at top
        verifyVisibility(lLoggedAsUsernameTxt);
//        12.Click 'CartPage' button
        click(lCart);
//        13. Click 'Proceed To Checkout' button
        click(lProceedToChckout);
//        14. Verify Address Details and Review Your Order
        verifyAdressDetails();
//        15. Enter description in comment text area and click 'Place Order'
        WebElement eCommentTxtArea = driver.findElement(lDescription);
        eCommentTxtArea.sendKeys("Bana tokanma");
        click(lPlaceOrder);
//        16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        fillCreditCardCredentials();
//        17. Click 'Pay and Confirm Order' button
//        18. Verify success message 'Your order has been placed successfully!'
        verifyYourOrderHasBeenPlaced();
//        19. Click 'Delete Account' button
        click(lDeleteAccount);
//        20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
verifyVisibility(lAccountDeletedTxt);    }
}
