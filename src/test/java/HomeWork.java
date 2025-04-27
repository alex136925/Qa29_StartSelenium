import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();

        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors(){
        // by tag name
        WebElement tag1 = wd.findElement(By.cssSelector("meta"));
        WebElement tag2 = wd.findElement(By.cssSelector("link"));
        WebElement tag3 = wd.findElement(By.cssSelector("h1"));
        WebElement tag4 = wd.findElement(By.cssSelector("form"));
        WebElement tag5 = wd.findElement(By.cssSelector("a"));
        WebElement tag6 = wd.findElement(By.cssSelector("input"));
        WebElement tag7 = wd.findElement(By.cssSelector("head"));
        WebElement tag8 = wd.findElement(By.cssSelector("meta"));
        WebElement tag9 = wd.findElement(By.cssSelector("div"));
        WebElement tag10 = wd.findElement(By.cssSelector("input"));
        WebElement tag11 = wd.findElement(By.cssSelector("button"));

        // by class
        WebElement div1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement div2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement div3 = wd.findElement(By.cssSelector(".active"));
        WebElement div4 = wd.findElement(By.cssSelector(".container"));

        //by id

        WebElement id = wd.findElement(By.cssSelector("#root"));

        //by attribute

        WebElement a1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement a4 = wd.findElement(By.cssSelector("[aria-current = 'page']"));
        WebElement a5 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));

        WebElement a22 = wd.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement a23 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Pas')]"));
        WebElement a24 = wd.findElement(By.xpath("//input[contains(@placeholder, 'rd')]"));

        WebElement a6 = wd.findElement(By.cssSelector("[Placeholder = 'Password']"));
        WebElement a7 = wd.findElement(By.cssSelector("[name = 'login']"));
        WebElement a8 = wd.findElement(By.cssSelector("[name = 'registration']"));
        WebElement a9 = wd.findElement(By.cssSelector("[name = 'email']"));
        WebElement a10 = wd.findElement(By.cssSelector("[name = 'viewport']"));
        WebElement a11 = wd.findElement(By.cssSelector("[name = 'theme-color']"));
        WebElement a12 = wd.findElement(By.cssSelector("[name = 'description']"));
        WebElement a13 = wd.findElement(By.cssSelector("[content = 'width=device-width,initial-scale=1']"));
        WebElement a14 = wd.findElement(By.cssSelector("[content = '#000000']"));
        WebElement a15 = wd.findElement(By.cssSelector("[content = 'Web site created using create-react-app']"));
        WebElement a16 = wd.findElement(By.cssSelector("[rel = 'stylesheet']"));
        WebElement a17 = wd.findElement(By.cssSelector("[href = '”/favicon.ico”']"));
        WebElement a18 = wd.findElement(By.cssSelector("[style = 'border: 1px solid black; background-color: black; color: white;']"));
        WebElement a19 = wd.findElement(By.cssSelector("[charset = 'utf-8']"));
        WebElement a20 = wd.findElement(By.cssSelector("[lang = 'en']"));
        WebElement a21 = wd.findElement(By.cssSelector("[rel = '”shortcut']"));

        //parent
        //WebElement el14 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el15 = wd.findElement(By.xpath("//h1/parent::div"));

        //ancestor
        WebElement el16 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el17 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el18 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor-or-self
        List<WebElement> list3 = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list4 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        List<WebElement> list5 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
    }
}
