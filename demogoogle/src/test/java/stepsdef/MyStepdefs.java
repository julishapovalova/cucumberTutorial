package stepsdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Driver;
import org.junit.Assert;


public class MyStepdefs {


    @Given("^I open browser (\\w*)")
    public void iOpenBrowserChrome(String browser) throws Throwable {
//        if (browser.equals("Chrome")) {
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe/");
//            driver = new ChromeDriver();
//        } else if (browser.equals("Firefox")) {
//            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
    }

    @When("^I open google site$")
    public void iOpenGoogleSite() throws Throwable {
        Driver.myDriver.get("https://www.google.com/");
    }

    @Then("^I see (\\w*) site$")
    public void iSeeGoogleSite(String title) throws Throwable {
        Assert.assertEquals(title, Driver.myDriver.getTitle());
    }

}
