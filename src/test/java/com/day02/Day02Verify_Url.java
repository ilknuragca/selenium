package com.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//3
public class Day02Verify_Url {
    public static void main(String[] args) {
        //2.Navigate to google homepage
        //3.Verify if google homepage url is “www.google.com”

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //getting the url of the page
       String actualUrl= driver.getCurrentUrl();

       //expected url
       String expectedUrl="www.google.com";

       //verification
        System.out.println("actualurl: " +actualUrl);
        System.out.println("expectedurl: "+expectedUrl);
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.close();


    }
}
