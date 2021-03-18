import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    public static WebDriver driver;
    @Test
    public void Method1(){
        System.out.println("This is 1st Test case");
    }
    @Test
    public void Initialization(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
    }
    @Test
    public void TearDown(){

        driver.quit();
    }
}
