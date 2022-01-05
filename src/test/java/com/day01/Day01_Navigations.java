package com.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Create a new class under : BasicNavigations Create main method
        Set Path
        Create chrome driver
        Maximize the window
        Open google home page https://www.google.com/.
        On the same class, Navigate to amazon home page https://www.amazon.com/
        Navigate back to google
        Navigate forward to amazon
        Refresh the page
        Close/Quit the browser

 */
public class Day01_Navigations {
    public static void main(String[] args) throws InterruptedException {

        //Set path          drivers name               path of the driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        //Creating driver object
        WebDriver driver=new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //open google home page
        driver.get("https://www.google.com");

        //this is a kind of wait
        //ın automation waits are used widely.
        Thread.sleep(3000); //3scn(throws exception)

        //Navigate to amazon home page https://www.amazon.com/
      //  driver.get("https://www.amazon.com"); //the first way


        //navigate.to() is also go to a webpage
        driver.navigate().to("https://www.amazon.com"); //2.way
        Thread.sleep(3000); //3scn(throws exception)

        //navigate back to google
         driver.navigate().back();
         Thread.sleep(3000);

        //forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);

        //refresh
        driver.navigate().refresh();
        Thread.sleep(3000); //


        //close
        driver.close(); //close only current driver page

        driver.quit();//close all the browsers

       /*
          get and navigate() methods
          What are the differencies between get and navigate()
          1. get is easier and faster
          2. navigate has some other functions like back -forward and refresh but get doesn't
          3. navigate uses both string and URL data type Url but get only uses string Url.
          */

        /*
         * What is the difference  between get() and navigate.to ?
         * 1. get() easier to use, used more than navigate()
         * 2. get() a little faster
         * 3. get() takes only string, but navigate.to takes string or URL as parameter
         * 4. navigate has more options: back, forward, refresh
         * ----------------------------------------------------------------
         *What is the difference between close and quit?
         *close() -> closes only current working browser
         *quit() -> closes all browsers.
         *-------------------------------------------------------
         *What is Thread.sleep()?
         *It is used to put some wait.
         *Thread.sleep(5000); puts 5 second ON THIS STEP
         *Thread.sleep is a JAVA wait. It is not a selenium wait.
         *Because this is HARD wait.
         *It means, this will put extra wait EVEN IF WE DON'T NEED
         *We will use selenium waits. They will be DYNAMIC WAIT.
         * --------------------------
         * */


    }
}
