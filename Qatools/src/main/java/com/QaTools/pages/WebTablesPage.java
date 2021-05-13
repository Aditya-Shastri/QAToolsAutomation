package com.QaTools.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends BasePageObject {

	protected int editoption;

	protected int deleteoption;

	// WebElement on the Pages ....

	// 1. Initial page webElement

	By header = By.xpath("//div[@class='main-header']");

	By add_button = By.xpath("//button[@id='addNewRecordButton']");

	By input_search = By.xpath("//input[@id='searchBox'] ");

	By search_icon = By.xpath(".//span[@id='basic-addon2'] ");

	By delete_row = By.xpath("//div[@class='action-buttons']/span[@id='delete-record-" + deleteoption + "'] ");

	By edit_row = By.xpath("//div[@class='action-buttons']/span[@id='edit-record-" + editoption + "']");

	// 2. WebElemeent when clicked on Add new data column

	By f_name = By.xpath("//div[@role='document']/div/div[2]/form/div[1]/div[2]/input[@id='firstName']");

	By l_name = By.xpath("//div[@role='document']/div/div[2]/form/div[2]/div[2]/input[@id='lastName']");

	By email = By.xpath("//div[@role='document']/div/div[2]/form/div[3]/div[2]/input[@id='userEmail']");

	By age = By.xpath("//div[@role='document']/div/div[2]/form/div[4]/div[2]/input[@id='age']");

	By department = By.xpath("//div[@role='document']/div/div[2]/form/div[6]/div[2]/input[@id='department']");

	By salary = By.xpath("//div[@role='document']/div/div[2]/form/div[5]/div[2]/input[@id='salary']");

	By submit_button = By.xpath("//div[@role='document']/div/div[2]/form/div[7]/div/button[@id='submit']");

	// method returns string as a pageheader

	public WebTablesPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public String getPageHeader() {

		return driver.findElement(header).getText();
	}

	public void ClickOnEditButton(int editoption) {

		this.editoption = editoption;
		click(edit_row);
		log.info("Clicked on the Edit row button");

	}

	public void ClickOnAddButton() {

		log.info("CLicking on add button ");
		// driver.findElement(add_button).click();
		click(add_button);
	}

	public void addDataRow(String Firstname, String Lastname, String Age, String Email, String Salary,
			String Department) {

		log.info("Adding firstname");

		type(Firstname, f_name);

		log.info("Additing last name");

		type(Lastname, l_name);

		log.info("Adding age");

		type(Age, age);

		log.info("Adding Email");

		type(Email, email);

		log.info("Adding Salary");

		type(Salary, salary);

		log.info("Adding Department");

		type(Department, department);

		log.info("Clicking on submit button ");

		click(submit_button);

	}

	public void deleteDataRow(int deleteoption) {
		log.info("Into the deleteDatarow method");

		this.deleteoption = deleteoption;

		log.info("Removing the selected option " + deleteoption);

		click(delete_row);

		log.info("Row Deleted");

	}

	public void editDataRow(String Email, String Salary) {
		log.info("Into the EditDatarow method");

		log.info("Editing Email");

		type(Email, email);

		log.info("Editing Salary");

		type(Salary, salary);

		log.info("details edited clicking on submit button to save");

		click(submit_button);

	}

	public void searchFromDataRow(String SearchWord) {

		log.info("Into the searchFromDatarow method");

		log.info("Entering keyword to search from database....");

		type(SearchWord, input_search);

		log.info("check for the search result ");

		click(search_icon);

	}

	/*
	 * public WebElement getfirstname()
	 * 
	 * { return driver.findElement(f_name); }
	 * 
	 * public WebElement getlastname()
	 * 
	 * { return driver.findElement(l_name); }
	 * 
	 * public WebElement getage()
	 * 
	 * { return driver.findElement(age); }
	 * 
	 * public WebElement getdepartment()
	 * 
	 * { return driver.findElement(department); }
	 * 
	 * public WebElement getsalary()
	 * 
	 * { return driver.findElement(salary); }
	 * 
	 * public WebElement getsubmit_button()
	 * 
	 * { return driver.findElement(submit_button); }
	 */
}
