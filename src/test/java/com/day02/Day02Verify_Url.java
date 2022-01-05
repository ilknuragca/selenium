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

        /*
         * Test Case failed
         * FAIL
         *ACTUAL : https://www.google.com/
         *EXPECTED : www.google.com
         *
         * Then what do you do when your test case fails????
         * 1. Run script again to make sure
         * 2. Manual testing to make sure
         * 3. Now I know that expected and actual result is not the same
         * 4. Then we communicate with the BA(write acceptance criteria) or talk to developers, tech lead, test lead
         *
         * ~~~Testers do not fix a code. We reports the bugs. Developers then fix.
         *
         * 5. After verifying the there is a bug then what do you do?
         * -Follow the company procedures
         * -if they are using JIRA then open a big ticket
         *
         *
         * 6. Ticket opened, dev told you that bug is fixed.
         *-retest to make sure
         *-if all good then close the bug ticket
         *
        */
    }
}
