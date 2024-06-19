package pomDOp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdef.Testcase;

public class Home extends Testcase {

public Home(WebDriver driver){
    PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Home']")
    private WebElement header;
public String getHeader(){
return header.getText();
}
}
