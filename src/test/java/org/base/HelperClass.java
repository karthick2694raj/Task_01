package org.base;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor j;
	public static Alert al;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void impliwait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void locator(String path) {
		WebElement loc = driver.findElement(By.xpath(path));
	}

	public static void txtpass(WebElement loc, String name) {
		loc.sendKeys(name);
	}

	public static void btnclck(WebElement loc) {
		loc.click();
	}

	public static void screenshot(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\rajka\\eclipse-workspace\\CucumberSample\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void threadSleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public static void moveto(WebElement loc) {
		a=new Actions(driver);
		a.moveToElement(loc).perform();
	}
	public static void rightclck(WebElement loc) {
		a.contextClick(loc).perform();
	}
	public static void douleclck() {
		a.doubleClick().perform();
	}public static void dragAndDrop(WebElement source,WebElement target) {
		a.dragAndDrop(source, target).perform();
	}
	public static void windowhandle(int no) {
		String parent = driver.getWindowHandle();
		
		Set<String> eachId = driver.getWindowHandles();
		
		List<String> l=new ArrayList<String>();
	    l.addAll(eachId);
	    driver.switchTo().window(l.get(no));

	}
	public static void javaScriptSendkeys(String name,WebElement loc) {
		j=(JavascriptExecutor)driver;
		j.executeScript(name, loc);
	}
	public static void javaScriptclick(String key,WebElement loc ) {
		j=(JavascriptExecutor)driver;
		j.executeScript(key,loc);
	}
	public static void alert() {
		al=driver.switchTo().alert();
	}
	public static void accept() {
		al.accept();
	}
	public static void dismiss() {
		al.dismiss();
	}
	public static void sendkeys(String name) {
		al.sendKeys(name);
	}
	public static void gettxt() {
		al.getText();
	}
	public static void dtAndTime() {
		
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		
		String name = s.format(d);
		
		System.out.println(name);

	}

}

