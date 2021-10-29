import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class TSDStepDefs {
    protected WebElement lowCostProduct;
    protected String lowCostProductName;
    TestScriptDemoElements TSDE=new TestScriptDemoElements();
    @Given("I add four different products to my wish list")
    public void iAddFourDifferentProductsToMyWishList() {
        TSDE.Product1.click();
        TSDE.Product2.click();
        TSDE.Product3.click();
        TSDE.Product4.click();
    }

    @When("I view my wishlist table")
    public void iViewMyWishlistTable() {
        TSDE.shoppingBag.click();
        Assert.assertEquals(TSDE.shoppingBagHdr.getText(),"Cart");
    }

    @Then("I find total four selected items in my wishlist")
    public void iFindTotalFourSelectedItemsInMyWishlist() {
        int x=0;
        for(int i=1;i<TSDE.numberItemsInBag.size();i++) {
            x = x + Integer.parseInt(TSDE.numberItemsInBag.get(i).getAttribute("value"));
        }
        Assert.assertEquals(4,x);
    }

    @When("I search for lowest price product")
    public void iSearchForLowestPriceProduct() {
        int x=Integer.parseInt(TSDE.productCosts.get(0).getText());
        lowCostProduct=TSDE.addToCartElements.get(0);
    for(int i=1;i<TSDE.productCosts.size();i++){
    if(x>Integer.parseInt(TSDE.productCosts.get(i).getText())){
        x=Integer.parseInt(TSDE.productCosts.get(i).getText());
         lowCostProduct=TSDE.addToCartElements.get(i);
         lowCostProductName=TSDE.productName.get(i).getText();
    }
    }
    }


    @And("I am able to add lowest price item to my cart")
    public void iAmAbleToAddLowestPriceItemToMyCart() {
        lowCostProduct.click();

    }

    @Then("I am able to verify the item in my cart")
    public void iAmAbleToVerifyTheItemInMyCart() {
        TSDE.shoppingBag.click();
        boolean condition=false;
        for(int i=1;i<TSDE.productsInBag.size();i++){
            if(TSDE.productsInBag.get(i).getText().equals(lowCostProductName)){
               condition=true;
            }
            Assert.assertTrue(condition);
    }
}
}
