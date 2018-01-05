package com.fuzuokui.spider.otcbtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 21:11 2017/12/16
 * @Modified By:
 */
//public class ChromeDriverExample {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/xuefeng/Downloads/soft/chromedriver");
//        final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setJavascriptEnabled(true);
//        // Disable "web-security", enable all possible "ssl-protocols" and "ignore-ssl-errors" for PhantomJSDriver
//        WebDriver driver = new ChromeDriver(capabilities);
//        driver.get("http://www.google.com");
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Cheese!");
//        element.submit();
//
//        System.out.println("Page title is: " + driver.getTitle());
//
//        driver.quit();
//    }
//}



public class ChromeDriverExample {

  /**

    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        // 设置 chrome 的路径（如果你安装chrome的时候用的默认安装路径，则可省略这步）
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        // 创建一个 ChromeDriver 的接口，用于连接 Chrome（chromedriver.exe 的路径可以任意放置，只要在newFile（）的时候写入你放的路径即可）
        @SuppressWarnings("deprecation")
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
                new File("F:/ideaWorkSpace/spring-test/src/main/extertion/chromedriver.exe")) .usingAnyFreePort().build();
        service.start();
        // 创建一个 Chrome 的浏览器实例
        WebDriver driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());
        driver.get("https://www.binance.com/trade.html?symbol=EOS_ETH");
        // 让浏览器访问 Baidu
//        driver.get("http://www.baidu.com");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        while (System.currentTimeMillis() < sdf.parse("2020-12-31").getTime()) {
//        while (true) {

            WebElement element = (new WebDriverWait(driver, 10)
            .until(new ExpectedCondition<WebElement>() {
                @Nullable
                @Override
                public WebElement apply(@Nullable WebDriver input) {
                    return input.findElement(By.cssSelector(".transMoney.ng-binding.ng-scope"));
                }
            }));
            System.out.println(String.format("============================%s", element.getText().replace("￥", "")));
            Thread.sleep(2000L);
        }
        // 关闭浏览器
        driver.quit();
        // 关闭 ChromeDriver 接口
        service.stop();
    }

**/
}
