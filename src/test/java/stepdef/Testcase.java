package stepdef;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testcase {

    public static WebDriver driver;

    public static Properties properties=new Properties();

public static FileInputStream fileInputStream;
    protected String getHeader;

    public void openBrowser() throws IOException{

fileInputStream=new FileInputStream("application.properties");

properties.load(fileInputStream);

    WebDriverManager.chromedriver().clearDriverCache().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kalpartz.com");

}
public void tearDown(){

}
}
