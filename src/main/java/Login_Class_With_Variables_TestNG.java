import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Class_With_Variables_TestNG {

  @Test
  public void Login_Test(){

        System.setProperty("webdriver.chrome.driver","C:\\MyCode\\Automation_Tutorials\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url ="http://demo.guru99.com/test/newtours/";
        driver.get(url);

        WebElement Sign_On = driver.findElement(By.xpath("//a[contains(.,'SIGN-ON')]"));
        Sign_On.click();

        WebElement Username =driver.findElement(By.xpath("//input[@name='userName']"));
        Username.sendKeys("Test");

        WebElement Password =driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("Test");

        WebElement Submit =  driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

        WebElement Actual_Results=driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]"));

        Assert.assertTrue(Actual_Results.isDisplayed());

        driver.quit();

    }
}
