package com.QaTools.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePageObject {

	private By Webtables = By.xpath("//li[@id='item-3']/* ");

	public ElementsPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public WebTablesPage ClickToOpenWebTables() {

		log.info("Clicking on the Elements Page model to pratice ");
		
	     click(Webtables);

		return new WebTablesPage(driver, log);
	}

}
