package com.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {
    public static void main(String[] args) {
      /*   1.//getPageSource() returns page source code as a string
           2.//We might use this to verify if a certain text exist in the entire page
           3.//Note that pageSource is not used a lot to do assertions
           4.//Because it is too general and can lead false result

     */

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String amazonTitle=driver.getTitle();
        System.out.println("amazonTitle: "+amazonTitle);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource: " + pageSource);

        if(pageSource.contains("Registry")){ //pagesource içinde geçiyor
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.close();
    }
}
