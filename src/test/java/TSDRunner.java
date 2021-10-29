import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/",
        glue={"src/test/java"},
        tags = {"@Codility_Test"}
)

public class TSDRunner {

}
