import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
    WebDriver driver = new ChromeDriver();
    public void facebook(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("ur email"); //email entered here
        driver.findElement(By.id("pass")).sendKeys("ur password"); //password entered here
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("You have "+driver.findElement(By.id("notificationsCountValue")).getText()+" notifications u should read.");
        driver.close();
    }
    public static void main(String[] args) {
        Facebook autotest1 = new Facebook();
        autotest1.facebook();



    }
}
