package com.browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class operaConfig {


    public static WebDriver driver;


    public static void main(String[] args) {

        launch_Opera();

    }
    public static void launch_Opera (){

        System.setProperty("webdriver.opera.driver","./src/main/resources/operadriver.exe");

        driver = new OperaDriver();
    }

}

