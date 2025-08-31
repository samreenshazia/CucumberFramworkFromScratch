/*package stepdefinitions;


import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.chaintest.plugins.ChainTestCucumberListener;

public class ScreenshotHook {

    private WebDriver driver;

    public ScreenshotHook(WebDriver driver) {
        this.driver = driver;
    }

    @After
    public void embedScreenshot(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            ChainTestCucumberListener.embed(screenshotBytes, "image/png");
        }
    }
}
*/