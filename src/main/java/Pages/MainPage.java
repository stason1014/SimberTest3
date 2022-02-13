package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * todo
 * BtnVhod- локатор входа первый
 * loginFail-локатор для логина
 * loginBatton-локатор кнопки входа для логина
 * PaswdFail-локатор для пароля
 * PaswdBatton-локатор кнопки входа для пароля
 * BtnVhod-кнопка входа
 * inputLogin-ввод логина
 * inputLogin-ввод логина
 * clicktLogin-нажатие логина
 * loginPaswd-ввод пароля
 * clickPaswd- кнопка для пароля
 * */
public class MainPage extends PageFactory {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"index-page-container\"]/div/div[2]/div/div/div[4]/a[2]")
    private WebElement BtnVhod;

    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginFail;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement loginBatton;

    @FindBy(xpath = "//*[contains(@id,'passp-field-passwd')]")
    private WebElement PaswdFail;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement PaswdBatton;

    public void clicBtnVhod() {
        BtnVhod.click();
    }
    public void inputLogin() {
        loginFail.sendKeys("Proverca1014@yandex.ru");
    }
    public void clicktLogin() {
        loginBatton.click();
    }
    public void loginPaswd() {
        PaswdFail.sendKeys("Proverca789963");
    }
    public void clickPaswd() {
        PaswdBatton.click();
    }
}



