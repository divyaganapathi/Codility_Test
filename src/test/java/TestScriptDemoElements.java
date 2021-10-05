import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class TestScriptDemoElements extends PageObject {
    @FindBy(xpath = "a[href=\"?add-to-cart=14\"]")
    public WebElement Product1;
    @FindBy(xpath = "a[href=\"?add-to-cart=20\"]")
    public WebElement Product2;
    @FindBy(name = "a[href=\"?add-to-cart=22\"]")
    public WebElement Product3;
    @FindBy(xpath = "a[href=\"?add-to-cart=18\"]")
    public WebElement Product4;
    @FindBy(xpath = "a[href=\"?add-to-cart=18\"]")
    public WebElement LowCostProduct;
}