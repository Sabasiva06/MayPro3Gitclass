package org.test;

import org.base.FunctionalLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleCLass extends FunctionalLib {

	public static void main(String[] args) {
		FunctionalLib lib = new FunctionalLib();
		lib.getDriver();
		lib.launchUrl("https://www.facebook.com/");
		WebElement txtUserName = lib.locaatingElement("id", "email");
		lib.enterText(txtUserName, "welcomejavca");
		driver.navigate().refresh();
		lib.enterText(txtUserName, "welcome");
		WebElement txtPassword = lib.locaatingElement("id", "pass");
		lib.enterText(txtPassword, "javaWelocmes");
		
		
	}

}
