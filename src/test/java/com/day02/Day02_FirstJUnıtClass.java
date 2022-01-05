package com.day02;

import org.junit.*;

//5
/*önce www.mvnrepository.com a git.
  webdrivermanager 'ı ara. tıkla ve enson versiona tıkla .dependency kısmını kopyala
  pom.xml içine dependecy içine yapıştır. eğer kırmızı görünüyorsa "sol üst maven " dan refresh yap.

  sonra tekrar www.mvnrepository.com a git. Junıt yaz.
  "Junıt testing framework for java"  olani seç.  son sürümü seç.  tekrar dependency kısmını kopyala.
  pom.xl içine , dependency ile yapıştır. yine refresh..
  selenium java için gerekli
  eğer junıt çalışacaksan dependency e eklemen lazım!
 */
public class Day02_FirstJUnıtClass {
  /*    --Test Automation Framework--
    JUNIT is a testing framework
    JUnit is one of the oldest JAVA testing framework
    TESTERS ALSO USE UNIT TESTING FOR CREATING AUTOMATION TEST FRAMEWORK
    Developers also use JUnit for their UNIT TESTING(unıt means: smallest part of the application)
    No more main method

    ********JUNIT has 7 major annotation
    1. @Test annotation is used to create test cases
      public ==> always public
      void==>  always void because Test() will not return anything
      public + void + methodname
    NOTE: All test method will be void
    Because test methods are used for assertions
    2. @Before : Runs before each @Test annotation, used for creating like pre-condition. (setup driver,open browser vs..)
    3. @After  : Runs after each @Test annotation,used for after condition(close browser,generate report vs..)
    4. @BeforeClass : Runs only once before each class
    5. @AfterClass  : Runs only once after each class
    6. @Ignore      : To skip a test case
        We use Junıt alsoto have an orginized code

    ********JUNIT ASSERTION(checking if expected is equal to  actual or not)
    We use JUnit assertion if actual and expected is equal
    Instead of using if else statement, we will use Junit assertions
    It will come from Assert class
    1. Assert.assertEquals("ACTUAL","EXPECTED");
    2. Assert.assertTrue("ACTUAL".contains("EXPECTED"));
    3. Assert.assertFalse("ACTUAL".contains("EXPECTED"));
     */


    @Before //we use "before" annotation.  this is support method. this will run firstly.
    public void setUp(){
        System.out.println("This is Before method");
    }
//before-test1-before-test2-before-test3.... her testten önce çalışır.

    @Test //org.junit' den kullanır
    public void test1(){
        System.out.println("THIS IS TEST 1");
    }

    @Test//==> it is test annotation. create and run TEST CASES
    public void test2(){
        System.out.println("THIS IS TEST 2");
    }

    @Ignore //if you don't want to run this method, you use @Ignore
    @Test   //skip the method with @Ignore
    public void test3(){
        System.out.println("THIS IS TEST 3");  //you see "Test ignored." ...
    }
//before ve after da çalışmaz. çünkü before ve after Test annotation. test3 ignore ise ona bağlı olan herşey ignore olur


    @Test
    public void test4(){
        System.out.println("THIS IS TEST 4");
    }

    @After
    public void tearDown(){
        System.out.println(" This is TEAR DOWN method");
    }
//before-test1-after-before-test2-after... her testten sonra çalışır



    //ASSERTION : we have to use assertion to mark a TEST cases as FAILED or PASSED..
    //if expected == actual
    @Test
    public void assertions(){
        //1. Assert.assertEquals("expected","actual");
//        If assertion fails, then we see error message on the console
//        if assertion passs, then we see a green checkmark only
        Assert.assertEquals("java","java");
//doğruysa yeşil chechmark olur ama eer değilse hata mesajı verir. ve Junıt bize otomatik olarak raporlama yapar..

//      Assert.assertEquals("javascript","java"); //hata verir


//    2. Assert.assertTrue(BOOLEAN);
        Assert.assertTrue("Selenium".contains("e"));

//        3. Assert.assertFalse(BOOLEAN);
        Assert.assertFalse("Selenium".contains("java"));// "Selenium".contains("a") -> FALSE


//      We can add a message as well.
//        This message will ONLY DISPLAY WHEN ASSERTION FAILS!!!!
        Assert.assertEquals("ASSERTION FAILED!","java","java");
       // Assert.assertEquals("ASSERTION FAILED!","java","javascript");
    }

    //main olmadan çalışır maven özelliği
    @Test
    public void test01() {
        // WebDriver driver= new ChromeDriver();
        // WebDriver driver1= new SafariDriver(); // .exe ye ihtiyaç duymadan maven içinde var, kullanablrsn

        //driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        System.out.println("Test1");
    }

    @Test
    public void test02() {
        System.out.println("Test2");
    }


}