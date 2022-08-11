package com.mycompany.app.my_selenium_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("welcome to selenium maven");
  }
  @Test
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\visha\\\\eclipse-workspace\\\\Selenium_April_22\\\\Binary\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
  }
}
