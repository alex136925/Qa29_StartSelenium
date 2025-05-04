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
    public void classwork(){
        WebElement element = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        System.out.println("***********************************");
        String textForm = form.getText();
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("************************************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("************************************");
        System.out.println("text br ---->" + br.getText());
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

        //xpath
        WebElement tag12 = wd.findElement(By.xpath("//meta"));
        WebElement tag13 = wd.findElement(By.xpath("//link"));
        WebElement tag14 = wd.findElement(By.xpath("//h1"));
        WebElement tag15 = wd.findElement(By.xpath("//form"));
        WebElement tag16 = wd.findElement(By.xpath("//a"));
        WebElement tag17 = wd.findElement(By.xpath("//input"));
        WebElement tag18 = wd.findElement(By.xpath("//head"));
        WebElement tag19 = wd.findElement(By.xpath("//meta"));
        WebElement tag20 = wd.findElement(By.xpath("//div"));
        WebElement tag21 = wd.findElement(By.xpath("//input"));
        WebElement tag22 = wd.findElement(By.xpath("//button"));

        // by class
        WebElement div1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement div2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement div3 = wd.findElement(By.cssSelector(".active"));
        WebElement div4 = wd.findElement(By.cssSelector(".container"));

        //xpath
        WebElement div5 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));
        WebElement div6 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));
        WebElement div7 = wd.findElement(By.xpath("//*[@class = 'active']"));
        WebElement div8 = wd.findElement(By.xpath("//*[@class = 'container']"));

        //by id

        WebElement id = wd.findElement(By.cssSelector("#root"));
        WebElement id1 = wd.findElement(By.xpath("//*[@id = 'root']"));

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

        //xpath
        WebElement a32 = wd.findElement(By.xpath("//*[@placeholder = 'Password']"));
        WebElement a33 = wd.findElement(By.xpath("//*[@href = '/home']"));
        WebElement a34 = wd.findElement(By.xpath("//*[@href = '/about']"));
        WebElement a35 = wd.findElement(By.xpath("//*[@href = '/login']"));
        WebElement a36 = wd.findElement(By.xpath("//*[@placeholder = 'Email']"));
        WebElement a37 = wd.findElement(By.xpath("//*[@aria-current = 'page']"));
        WebElement a38 = wd.findElement(By.xpath("//*[@name = 'login']"));
        WebElement a39 = wd.findElement(By.xpath("//*[@name = 'registration']"));
        WebElement a40 = wd.findElement(By.xpath("//*[@name = 'email']"));
        WebElement a41 = wd.findElement(By.xpath("//*[@name = 'viewport']"));
        WebElement a42 = wd.findElement(By.xpath("//*[@name = 'theme-color']"));
        WebElement a43 = wd.findElement(By.xpath("//*[@name = 'description']"));
        WebElement a44 = wd.findElement(By.xpath("//*[@content= 'width=device-width,initial-scale=1']"));
        WebElement a45 = wd.findElement(By.xpath("//*[@content = '#000000']"));
        WebElement a46 = wd.findElement(By.xpath("//*[@content = 'Web site created using create-react-app']"));
        WebElement a47 = wd.findElement(By.xpath("//*[@rel = 'stylesheet']"));
        WebElement a48 = wd.findElement(By.xpath("//*[@rel = '”shortcut']"));
        WebElement a50 = wd.findElement(By.xpath("//*[@lang = 'en']"));
        WebElement a51 = wd.findElement(By.xpath("//*[@charset = 'utf-8']"));
        WebElement a52 = wd.findElement(By.xpath("//*[contains(@style, 'border: 1px solid black')]"));
        WebElement a53 = wd.findElement(By.xpath("//*[@href = '”/favicon.ico”']"));


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
