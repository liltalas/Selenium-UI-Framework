package stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {
    @Before
    // we are adding the cucumber Scenario parameter which hold the data for the scenario which is currently running
    public void setUp(Scenario scenario){
        // the properties object inside of the ConfigReader class we created
        ConfigReader.initializeProperties();
        DriverUtilities.createDriver(scenario);
    }

    @After
    public void tearDown(Scenario scenario){
        DriverUtilities.driverQuit(scenario);
        //DriverUtilities.getDriver().quit();
    }
}
