package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalLib {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void btnClick(WebElement element) {
		element.click();

	}

	public WebElement locaatingElement(String locator, String value) {
		WebElement element = null;
		switch (locator) {
		case "id":
			element = driver.findElement(By.id(value));
			break;
		case "name":
			element = driver.findElement(By.name(value));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		default:
			System.out.println("invalid locator");
			break;
		}

		return element;

	}

}
