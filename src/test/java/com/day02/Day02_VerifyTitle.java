package com.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//2
public class Day02_VerifyTitle {
    public static void main(String[] args) {
    //2.Navigate to google homepage
    //3.Verify if the title is “Google” (ba decide to the acceptiance criteria)

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

       //Verification - Validation - Assertion
        String expectedresult="Google";
        String actualresult=driver.getTitle();

        //Verification!!!
        if(actualresult.equals(expectedresult)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.close();


        //Verification - Validation - Assertion
        /*
        After Verification your test failed
        Expected and Actual aren't same
        Creating a bug ticket
        Bug tracking tools -- Jira
        Developer will fix the bug by debugging
         */

    }
}
