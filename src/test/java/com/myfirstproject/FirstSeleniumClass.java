package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {

        //ıt is used to set the driver
                            //the name of the driver     //the path of the driver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


        //this is polymorphism.. creating obj by using sub child
        WebDriver driver= new ChromeDriver();
        //this is polymorphism.. webdriver is interface chromeDriver is subclass

        //İnterview question:
        //how you use polymorphism in your project framework?
          //creating the instance-object of driver
               //WebDriver driver= new ChromeDriver();



        driver.get("https://www.amazon.com/");

    }
}
