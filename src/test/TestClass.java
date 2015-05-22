package test;
import members.OperatorClass;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;

/**
 * Created by Yuri on 19.02.2015.
 */
public class TestClass {
    @BeforeMethod
    public void setUp(){
        System.out.println("Setup Test");
    }
    @AfterMethod
    public void dectruct(){
        System.out.println("Clean Test");
        }
    @DataProvider(name="forICanSumTwoNumbers")
    public Object[][] createProvider(){
        return new Object[][]{

                {new Float(2),new Float(3),new Float(5)},
                {new Float(2),new Float(3),new Float(5)},
                {new Float(2),new Float(3),new Float(5)},

        };
    }

    @Test(dataProvider = "forICanSumTwoNumbers")
    public void testICanSumTwoNumbers(float param1,float param2,float param3){
        OperatorClass operation = new OperatorClass();
        Assert.assertEquals(param3,operation.sum(param1,param2));

        System.out.println("ICanSumTwoNumbers test");
    }
    @DataProvider(name="setMaxValue")
    public Object[][] createProviderTwo(){
        return new Object[][]{

                {Float.MAX_VALUE},
                {new Float(32)},
                {Float.MAX_VALUE},

        };
    }
    @Test(dataProvider = "setMaxValue",enabled = false)
    public void testICanSetMaxValue(float par1){

        OperatorClass operation = new OperatorClass();
        Assert.assertTrue(Float.isInfinite(operation.sum(par1, par1)));
        System.out.println("ICanSumTwoNumbers test");

    }
    @Test(expectedExceptions = Error.class)
    public void testICantDivideByZiro(){

        OperatorClass operation = new OperatorClass();
        Assert.assertEquals(2, operation.del(2, 0));
        System.out.println("ICantDivideByZiro test");

    }
    @Test
    public void testICantSetSymbol(){
        Assert.assertEquals("+","+");
        System.out.println("testICantSetSymbol test");

    }
    /*@Test
    private void testWebDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("login_field")).sendKeys("jakekutsel");
        driver.findElement(By.id("password")).sendKeys("121retrooo");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("New repository")).click();
        driver.findElement(By.id("repository_name")).sendKeys("jake_testing_new3");
        driver.findElement(By.xpath("//button[@class='button primary first-in-line']")).submit();
    }*/

}
