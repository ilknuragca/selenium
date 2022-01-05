package com.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FireFoxTest {
    public static void main(String[] args) {
  //firefox test için "https://github.com/mozilla/geckodriver/releases" adresinden firefoxdriver indirdik ve klasöre ekledik
  //ve firefox indirdik
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");


    }
}
