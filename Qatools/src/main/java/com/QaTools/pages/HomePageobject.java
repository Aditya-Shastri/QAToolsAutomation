package com.QaTools.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePageobject extends BasePageObject {

	

	private String BaseUrl = "https://demoqa.com ";

	private By Elements = By.xpath(".//div[@class='card-body']/h5[text()='Elements'] ");

	private By Forms = By.xpath("//div[@class='card-body']/h5[text()='Forms']");
	private By Alertsnframs = By.xpath("//div[@class='card-body']/h5[contains(text(),'Alerts')]");
	private By Widgets = By.xpath("//div[@class='card-body']/h5[text()='Widgets'] ");
	private By Interactions = By.xpath("//div[@class='card-body']/h5[text()='Interactions'] ");
	private By BookStore = By.xpath("//div[@class='card-body']/h5[text()='Book Store Application'] ");

	public HomePageobject(WebDriver driver, Logger log) {

		super(driver,log);

	}
	
	public void openBaseApplication() {
		
		log.info(" loading base url QAtools.com");
		
		openUrl(BaseUrl);
		
		javaScriptExecutor(Elements);
	}

	
	/* Open Elements page method */
	
	public ElementsPage ClickToOpenElements() {

		log.info("Clicking on the Elements Page model to pratice ");

		//waitFor(ExpectedConditions.elementToBeClickable(Elements),10);
		
		click(Elements);

		return new ElementsPage(driver, log);
	}
	
	//open Forms method
	
	public FormsPage ClickToOpenForms() {

		log.info("Clicking on the Forms Page model to pratice ");

		click(Forms);

		return new FormsPage(driver, log);
	}
	
	// Alerts , frames and Windows Page model
	
	public AlertsnframsPage ClickToOpenAlertsnframs() {

		log.info("Clicking on the Alerts , frames and Windows Page model to pratice ");

		click(Alertsnframs);

		return new AlertsnframsPage(driver, log);
	}
	
	//Widget Page Model
	
	public WidgetPage ClickToOpenWidget() {

		log.info("Clicking on the Widget Page model to pratice ");

		click(Widgets);

		return new WidgetPage(driver, log);
	}
	
	//Interactions Page Model
	
		public InteractionPage ClickToOpenInteractions() {

			log.info("Clicking on the Widget Page model to pratice ");

			click(Interactions);

			return new InteractionPage(driver, log);
		}
		
		
		//BookStore Page Model
		
			public BookStorePage ClickToOpenBookStore() {

				log.info("Clicking on the Widget Page model to pratice ");

				click(BookStore);

				return new BookStorePage (driver, log);
			}
	

}
