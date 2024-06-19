package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class CucumberHooks extends Testcase{


    @Before
    public void init() throws InterruptedException, IOException {


        openBrowser();

    }

    @After
    public void close() {
        tearDown();
    }
}
