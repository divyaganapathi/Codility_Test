import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Input_Form_Test_Plan {
    public static WebDriver Driver=new ChromeDriver();
    @BeforeSuite
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER);
    }
    @Test
    public void InputFormTest(){
    Driver.get(Utils.INPUT_FORM_URL);
    InputFormElements IFEL=new InputFormElements(Driver);
    IFEL.EnterFN();
    IFEL.EnterLN();
    IFEL.EnterPHNO();
    IFEL.EnterEmail();
    IFEL.EnterAddress();
    IFEL.EnterCity();
    IFEL.SelectState();
    IFEL.EnterZipCD();
    IFEL.EnterWebsite();
    IFEL.SelectYesForHosting();
    IFEL.EnterProjectDesc();
    }
    @AfterSuite
    public void Cleanup(){
        Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.close();
    }
}
