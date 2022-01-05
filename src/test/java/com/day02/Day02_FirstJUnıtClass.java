package com.day02;

import org.junit.Test;

public class Day02_FirstJUnıtClass {
//main olmadan çalışır maven özelliği
    @Test
    public void test01(){
       // WebDriver driver= new ChromeDriver();
       // WebDriver driver1= new SafariDriver(); // .exe ye ihtiyaç duymadan maven içinde var, kullanablrsn

        //driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        System.out.println("Test1");
    }

    @Test
    public void test02(){
        System.out.println("Test2");
    }
}
