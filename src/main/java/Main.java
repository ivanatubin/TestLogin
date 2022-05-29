import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivana\\Desktop\\Bootcamp\\novChrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.stealmylogin.com/demo.html");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("user1");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("pass1");

        driver.findElement(By.xpath("/html/body/form/input[3]")).click();

        String actualResult = "https://example.com/";

        if (actualResult.equals(driver.getCurrentUrl())){
            System.out.println("Nice!");
        } else {
            System.out.println("Not nice!");
        }

        driver.close();
    }

}
