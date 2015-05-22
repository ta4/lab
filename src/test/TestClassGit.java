package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.yuri.repository.create.InputsFieldsGitToCreate;
import test.yuri.repository.signin.SingGithub;

/**
 * Created by Yuri on 13.03.2015.
 */
public class TestClassGit {


    @Test
    public void getRefactor() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        final WebDriver DRIVER = (WebDriver) new ChromeDriver();
        DRIVER.get("http://github.com");
        SingGithub FirstInit = new SingGithub(DRIVER);
        FirstInit.clickToSign().confirmLogin("whoyouare047", "047Whoyouare").goToCreateRep().inputRepName().createRepForName();
        Assert.assertTrue(new InputsFieldsGitToCreate(DRIVER).isConfirmCreateRepo());
    }


}
