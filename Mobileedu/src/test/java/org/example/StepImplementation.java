package org.example;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest {

    @Step("<second> saniye bekle")
    public void wait(int second) throws InterruptedException {
        Thread.sleep(1000 * second);
    }


    @Step("<by> li id elemente tikla1")
    public void clickid1(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by> li xpath elemente tikla1")
    public void clickxp1(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li id elemente tikla2")
    public void clickid2(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<id> id'li elemente <text> text değerini yaz")
    public void sendTextElementByXpath(String id, String text){
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.sendKeys(text);
        System.out.println(text + "Değeri yazıldı");
    }

    @Step("Enter tıklanır")
    public void clickEnter() {
        Actions actions=new Actions(appiumDriver);
        actions.sendKeys(Keys.ENTER).build().perform();

    }

    @Step("<by> li id elemente tikla3")
    public void clickid3(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by> li xpath elemente tikla2")
    public void clickxp2(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li xpath elemente tikla3")
    public void clickxp3(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li id elemente tikla4")
    public void clickid4(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    /*
    @Step("Rastgele bir ürün seç")
    public void rastgeleUrunSec() throws InterruptedException {
        List<MobileElement> elements = appiumDriver.findElements(By.id("com.mobisoft.beymen:id/searchResult_recycler"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }
    */

    @Step("<by> li xpath elemente tikla4")
    public void clickxp4(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }


    @Step("<id> li element <text> değerini içeriyor mu kontrol et")
    public void assertElement1(String id , String text) throws InterruptedException {
        wait(2);
        MobileElement element1 = appiumDriver.findElement(By.id(id));
        System.out.println("Text değeri = " +  element1.getText());
        Assert.assertTrue("Element bulunamadı",element1.getText().equals(text));
    }

    @Step("<by> li id elemente tikla5")
    public void clickid5(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<id> li element2 <text> değerini içeriyor mu kontrol et")
    public void assertElement2(String id , String text) throws InterruptedException {
        wait(2);
        MobileElement element2 = appiumDriver.findElement(By.id(id));
        System.out.println("Text değeri = " +  element2.getText());
        Assert.assertTrue("Element bulunamadı",element2.getText().equals(text));
    }

}
