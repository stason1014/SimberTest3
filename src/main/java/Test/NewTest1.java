package Test;

import Driver.DriverTest;
import Pages.MainPage;
import Pages.PostPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class  NewTest1 {
    WebDriver driver = null;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverTest.getChromeDriver();
        this.driver = driver;
        driver.get("https://mail.yandex.ru");
    }

    @Test
    public void Test1(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clicBtnVhod();
        mainPage.inputLogin();
        mainPage.clicktLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage.loginPaswd();
        mainPage.clickPaswd();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        PostPage postPage = new PostPage(driver);
        Integer mails = PostPage.mailSearch();
        System.out.println(mails);
        postPage.ClicWriteLetter();
        postPage.InputMail();
        postPage.Vvodtopic();
        postPage.VVod(mails);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        postPage.VvodinputMail();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

