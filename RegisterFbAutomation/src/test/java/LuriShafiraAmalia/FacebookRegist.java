package LuriShafiraAmalia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookRegist {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\src\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://en-gb.facebook.com/reg/");
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

        driver.findElement(By.name("firstname")).sendKeys("Luri");
        driver.findElement(By.name("lastname")).sendKeys("Shafira");
        driver.findElement(By.name("reg_email__")).sendKeys("lurishafira@mail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("lurishafira");

        WebElement dateElement = driver.findElement(By.id("day"));
        WebElement monthElement = driver.findElement(By.id("month"));
        WebElement yearElement = driver.findElement(By.id("year"));

        Select dateDropdown = new Select(dateElement);
        Select monthDropdown = new Select(monthElement);
        Select yearDropdown = new Select(yearElement);

        dateDropdown.selectByVisibleText("13");
        monthDropdown.selectByVisibleText("May");
        yearDropdown.selectByVisibleText("2000");

        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
        driver.findElement(By.name("websubmit")).click();

        driver.quit();

    }
}
