package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestNG {

    public static WebDriver driver;

        @BeforeClass
        public static void launch_Chrome (){

            System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("http://demo.guru99.com/V4/index.php");
        }

        @AfterClass
        public static void close_Chrome (){
            driver.close();
        }



        @Test(description ="valid Test Case",priority=0)
        public static void TC_Login_001() {

            //step 1
            WebElement UserId = driver.findElement(By.name("uid"));
            UserId.clear();
            UserId.sendKeys("mngr354483");

            //step 2
            WebElement Password = driver.findElement(By.name("password"));
            Password.clear();
            Password.sendKeys("gaqAnEg");

            //Step 3
            WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
            LoginBtn.click();

            //Verify by Title
            String Expected_Title = "Guru99 Bank Manager HomePage";
            String Actual_title = driver.getTitle();


            if (Expected_Title.equals(Actual_title)) {

                System.out.println("Test Case Passed.");
            } else {
                System.out.println("Test Case failed.");
            }

            //Logout
            WebElement Logout = driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(15) > a"));
            Logout.click();

            driver.switchTo().alert().accept(); //Clicking 'ok' button


            System.out.println("TC_Login_001 Executed");
        }



        //invalid user_id and password
        @Test (description ="Invalid Test Case",priority=1)
        public static void TC_Login_002(){

            //Step 3
            WebElement UserId =driver.findElement(By.name("uid"));
            UserId.clear();
            UserId.sendKeys("protocol");

            //Step 4
            WebElement Password = driver.findElement(By.name("password"));
            Password.clear();
            Password.sendKeys("p123");

            //Step 5
            WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
            LoginBtn.click();

            driver.switchTo().alert().accept(); //Clicking 'ok' button

            String Expected_Title = "Guru99 Bank Home Page";
            String Actual_title = driver.getTitle();


            if (Expected_Title.equals(Actual_title)) {
                System.out.println("Account Login Successfully. Test Case Passed.");
            } else {
                System.out.println("Test Case failed.");
            }

            System.out.println("TC_Login_002 Executed");
        }

        //valid user_id and invalid password
        @Test(description =  "Invalid Test Case " , priority = 2)
        public static void TC_Login_003() {

            //Step 3
            WebElement UserId = driver.findElement(By.name("uid"));
            UserId.clear();
            UserId.sendKeys("mngr354483");

            //Step 4
            WebElement Password = driver.findElement(By.name("password"));
            Password.clear();
            Password.sendKeys("123mngr");

            //Step 5
            WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
            LoginBtn.click();

            driver.switchTo().alert().accept(); //Clicking 'ok' button

            //Verify by Title
            String Expected_Title = "Guru99 Bank Home Page";
            String Actual_title = driver.getTitle();


            if (Expected_Title.equals(Actual_title)) {
                System.out.println("Test Case Passed.");
            } else {
                System.out.println("Test Case failed.");
            }

            System.out.println("TC_Login_003 Executed");


        }


        //invalid user_id and valid password
        @Test (description =  "Invalid Test Case " , priority = 3)
        public static void TC_Login_004() {

            //Step 3
            WebElement UserId = driver.findElement(By.name("uid"));
            UserId.clear();
            UserId.sendKeys("gulugulu");

            //Step 4
            WebElement Password = driver.findElement(By.name("password"));
            Password.clear();
            Password.sendKeys("gaqAnEg");

            //Step 5
            WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
            LoginBtn.click();

            driver.switchTo().alert().accept();

            //Verify by Title
            String Expected_Title = "Guru99 Bank Home Page";
            String Actual_title = driver.getTitle();


            if (Expected_Title.equals(Actual_title)) {
                System.out.println("Test Case Passed.");
            } else {
                System.out.println("Test Case failed.");
            }

            System.out.println("TC_Login_004 Executed");


        }


    }


