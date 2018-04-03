package stepsdef;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MySetpsdefs1 {
    @When("^I enter (\\w*)")
    public void iEnterWord(String word) throws Throwable {
        Driver.myDriver.findElement(By.id("lst-ib")).sendKeys(word + Keys.ENTER);

    }

    @Then("^I see result (\\w*)$")
    public void iSeeResultTable(String word) throws Throwable {
        WebDriverWait wait=new WebDriverWait(Driver.myDriver, 10);
        wait.until(ExpectedConditions.textToBe(By.id("lst-ib"),word));
//        Assert.assertEquals(word, Driver.myDriver.findElement(By.id("lst-ib")).getText());
    }
}
