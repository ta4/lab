package test.yuri.repository.signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.yuri.repository.login.LoginGithub;


/**
 * Created by Yuri on 06.03.2015.
 */
public class SingGithub {
    private WebDriver driver;
    /**
     * Вход
     */
     @FindBy(linkText = "Sign in")
     private WebElement sign;


    public SingGithub(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoginGithub clickToSign(){

        System.out.println(driver.getTitle());
        sign.click();
        return new LoginGithub(driver);


    }


}
