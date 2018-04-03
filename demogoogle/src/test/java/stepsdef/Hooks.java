package stepsdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.Driver;


public class Hooks {


    @Before
    public void setUpScenario() {
        Driver.create();

        System.out.println("set Up");
    }

    @After
    public void tearDownScenario() {
        Driver.quit();
    }
}

