import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TestScriptDemoElements extends PageObject {

    public TestScriptDemoElements(WebDriver driver) {
        super(driver);
    }
    public TestScriptDemoElements() {
    }
    @FindBy(how = How.XPATH, using = "//a[href=\"?add-to-cart=14\"]")
    public WebElement Product1;
    @FindBy(how = How.XPATH, using = "//a[href=\"?add-to-cart=20\"]")
    public WebElement Product2;
    @FindBy(how = How.XPATH, using = "//a[href=\"?add-to-cart=22\"]")
    public WebElement Product3;
    @FindBy(how = How.XPATH, using = "//a[href=\"?add-to-cart=18\"]")
    public WebElement Product4;
    @FindBy(how = How.XPATH, using = "//li/a/span/ins/span/bdi/span")
    public List<WebElement> productCosts;
    @FindBy(how = How.XPATH, using = "//li/a/span/ins/span/bdi/span/../../../../../../a[2]")
    public List<WebElement> addToCartElements;
    @FindBy(how = How.XPATH, using = "//li/a/span/ins/span/bdi/span/../../../../../h2")
    public List<WebElement> productName;
    @FindBy(how = How.XPATH, using = "(//i[@class='la la-shopping-bag'])[2]")
    public WebElement shoppingBag;
    @FindBy(how = How.XPATH, using = "(//h1")
    public WebElement shoppingBagHdr;
    @FindBy(how = How.XPATH, using = "//input[@title='Qty']")
    public List<WebElement> numberItemsInBag;
    @FindBy(how = How.XPATH, using = "//td[@class='product-name']/a")
    public List<WebElement> productsInBag;
}
