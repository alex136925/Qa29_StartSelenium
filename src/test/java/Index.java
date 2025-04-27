import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();

        wd.get("file:///C:/Users/kalin/Downloads/21.index.html");
    }

    @Test
    public  void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        WebElement canada2 = wd.findElement(By.xpath("//td[text() = 'Canada']"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators(){
        //by tag name

      WebElement el = wd.findElement(By.tagName("button"));
      WebElement el1 = wd.findElement(By.cssSelector("button"));
      WebElement el3 = wd.findElement(By.xpath("//button"));

      WebElement a = wd.findElement(By.tagName("a"));
      WebElement a1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a"));


        //by class

        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer2 = wd.findElement(By.cssSelector(".container"));
        WebElement divContainer3 = wd.findElement(By.xpath("//*[@class = 'container']"));

        List<WebElement> nav = wd.findElements(By.className("nav-item"));
        List<WebElement> nav2 = wd.findElements(By.cssSelector(".nav-item"));
        List<WebElement> nav3 = wd.findElements(By.xpath("//*[@class = 'nav-item']"));

        //by id

        WebElement div = wd.findElement(By.id("nav"));
        WebElement div1 = wd.findElement(By.cssSelector("#nav"));
        WebElement div2 = wd.findElement(By.xpath("//*[@id = 'nav']"));

        WebElement alert = wd.findElement(By.id("alert"));
        WebElement alert2 = wd.findElement(By.cssSelector("#alert"));

        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href = '#item3']"));
        WebElement a6 = wd.findElement(By.xpath("//*[@href = '#item3']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name = 'surename']"));
        WebElement inputS2 = wd.findElement((By.name("surename")));

        //By linkText & By partialLinkText

        WebElement a3 = wd.findElement(By.linkText("Item 1"));
        WebElement a4 = wd.findElement(By.partialLinkText("m 1"));

        WebElement inp = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        //start
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder ^= 'Type']"));
        //end
        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder $= 'name']"));
        //contains
        WebElement inp3 = wd.findElement(By.cssSelector("[placeholder *= 'your']"));


    }
}
