package org.example;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
    public void clickBtni1(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by> li xpath elemente tikla1")
    public void clickBtnx1(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li xpath elemente tikla2")
    public void clickBtnx2(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<xpath> xpath'li elemente <text> text değerini yaz")
    public void sendTextElementByXpath(String xpath, String text){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath)).sendKeys(text);
        element.sendKeys(text);
        System.out.println(text + "Değeri yazıldı");
        appiumDriver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
    }

    @Step("<by> li id elemente tikla2")
    public void clickBtni2(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by> li xpath elemente tikla3")
    public void clickBtnx3(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li xpath elemente tikla4")
    public void clickBtnx4(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.xpath(by)).click();
    }

    @Step("<by> li id elemente tikla3")
    public void clickBtni3(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("Bir ürün seçilir")
    public void rastgeleUrunSec() throws InterruptedException {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//com.mobisoft.beymen:id/productImage"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }

    @Step("<id> li element <text> değerini içeriyor mu kontrol et")
    public void assertElement(String id , String text){
        MobileElement element = appiumDriver.findElement(By.id(id));
        System.out.println("Text değeri = " +  element.getText());
        Assert.assertTrue("Element bulunamadı",element.getText().equals(text));
    }














}
