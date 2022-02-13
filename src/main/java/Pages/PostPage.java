package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
/**
 * todo
 * PoiskPisem-локатор для поиска SimbirSoft
 * cuntMail-вывод колличества
 * TexInput-локатор для текста письма
 * writeLetter-локатор входа первый
 * ClicWriteLetter-нажатие на кнопку НАПИСАТЬ
 * fieldWhom-локатор для почты
 * InputMail-ввод почты
 * topic-локатор ТЕМЫ
 * Vvodtopic-ввод ТЕМЫ
 * VvodinputMail-ввод кнопки отправить
 * */
public class PostPage extends PageFactory {
    private WebDriver driver;

    public PostPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[contains(@title,'Simb')]")
    private static List<WebElement> PoiskPisem;

    public static Integer mailSearch() {
    Integer cuntMail= PoiskPisem.size();
    return cuntMail;
    }
    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/div")
    private WebElement TexInput;

    public void VVod(Integer mails) {
        TexInput.sendKeys(mails.toString());
    }
    @FindBy(xpath = "//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div[2]/div[1]/div/div/div/a/span")
    private WebElement writeLetter;

    public void ClicWriteLetter() {
    writeLetter.click();
    }

    @FindBy(xpath = "//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/div")
    private WebElement fieldWhom;

    public void InputMail() {
    fieldWhom.sendKeys("Proverca1014@yandex.ru");
    }

    @FindBy(xpath = "//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/input")
    private WebElement topic;

    public void Vvodtopic() {
    topic.sendKeys("Simbirsoft Тестовое задание.Каширин");
    }

    @FindBy(xpath = "//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/button")
    private WebElement send; /* локатор кнопки отправить*/

    public void VvodinputMail() {
    send.click();
    }
}

