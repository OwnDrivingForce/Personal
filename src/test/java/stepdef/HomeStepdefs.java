package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import pomDOp.Home;

public class HomeStepdefs extends Testcase{

    Home home = new Home(driver);

    @And("^user should be on home page \"([^\"]*)\"$")
    public void userShouldBeOnHomePage(String expectedHeader) {
        String actualHome = home.getHeader();
        Assert.assertEquals(expectedHeader, home.getHeader);
    }

    }
}
