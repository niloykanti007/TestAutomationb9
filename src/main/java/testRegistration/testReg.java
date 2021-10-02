package testRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testReg {

    public static WebDriver driver;

    public static void main(String[] args) {


        launch_Chrome();
        open_registerPage();
        TC_Register_001();
        TC_Register_002();
        TC_Register_003();
        TC_Register_004();
        TC_Register_005();
        TC_Register_006();
        TC_Register_007();
        TC_Register_008();


        close_Chrome();

    }
    //Step 1
    public static void launch_Chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Step 2
    public static void open_registerPage(){

        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }


    public static void TC_Register_001() {

        WebElement FirstName = driver.findElement(By.id("input-firstname"));
        FirstName.clear();
        FirstName.sendKeys("Niloy");

    }


    public static void TC_Register_002() {

        WebElement LastName = driver.findElement(By.id("input-lastname"));
        LastName.clear();
        LastName.sendKeys("KD");

    }

    public static void TC_Register_003() {

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("user101@gmail.com");

    }

    public static void TC_Register_004() {

        WebElement Telephone=driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("+88016000000");

    }


    public static void TC_Register_005() {

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

    }


    public static void TC_Register_006() {

        WebElement ConfirmPassword=driver.findElement(By.id("input-confirm"));
        ConfirmPassword.clear();
        ConfirmPassword.sendKeys("123456");

    }


    public static void TC_Register_007() {

        WebElement AgreeBtn = driver.findElement(By.name("agree"));


        AgreeBtn.click();
    }

    public static void TC_Register_008() {
        WebElement ContinueBtn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));

        ContinueBtn.click();
    }



    public static void close_Chrome() {

        driver.close();

    }

}
