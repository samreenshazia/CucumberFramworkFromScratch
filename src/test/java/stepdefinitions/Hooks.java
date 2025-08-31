package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseTest;

public class Hooks {

    @Before
    public void setUp() {
        BaseTest.initializeDriver("chrome"); // Make sure this method sets BaseTest.driver
    }

    @After
    public void tearDown() {
        BaseTest.quitDriver(); // Clean up after test
    }
}
