import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver Driver;
    public PageObject(){
    }
    public PageObject (WebDriver driver){
        this.Driver=driver;
        PageFactory.initElements(Driver,this);
    }

}
