package com.QaTools.Base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	private Logger log;

	public BrowserFactory(String browser, Logger log) {

		this.browser = browser.toLowerCase();
		this.log = log;
	}

	public WebDriver createDriver() {
		// Create driver

		log.info("Create driver: " + browser);

		switch (browser) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "G:\\Workspace\\Qatools\\Drivers\\chromedriver.exe");

			driver.set(new ChromeDriver());

			break;

		case "firefox":

			System.setProperty("webdriver.chrome.driver", "G:\\Workspace\\Qatools\\Drivers\\geckodriver.exe");

			driver.set(new FirefoxDriver());

			break;

		default:

			System.out.println("Did not know which browser to start /n starting chrome as default...");

			System.setProperty("webdriver.chrome.driver", "G:\\Workspace\\Qatools\\Drivers\\chromedriver.exe");

			driver.set(new ChromeDriver());

			break;

		}

		return driver.get();

	}

}
