package com.fuzuokui.spider.otcbtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 19:44 2017/12/19
 * @Modified By:
 */
public class SecondTest {

    public static void main(String[] args) throws Exception {
        //加载Chrome的驱动并打开浏览器
        //System.setProperty("webdriver.chrome.driver","D:/Google/chromedriver.exe");
        System.setProperty("phantomjs.binary.path", "F:/ideaWorkSpace/spring-test/src/main/extertion/phantomjs.exe");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.phantomjs();
        //此处可以设置一些desiredCapabilities的属性（浏览器的头信息）
        WebDriver driver = new PhantomJSDriver(desiredCapabilities);
        //打开sosobtc.com页面
        driver.get("https://www.binance.com/trade.html?symbol=ETH_BTC");
        //给浏览器初始化页面响应时间
        Thread.sleep(5000);
        WebElement element = (new WebDriverWait(driver, 10)
                .until(new ExpectedCondition<WebElement>() {
                    @Nullable
                    @Override
                    public WebElement apply(@Nullable WebDriver input) {
                        return input.findElement(By.cssSelector(".transMoney.ng-binding.ng-scope"));
                    }
                }));
        System.out.println(String.format("============================%s", element.getText().replace("￥", "")));
    }

}
