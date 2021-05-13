package com.toolsqa.WebTable.Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.QaTools.Base.TestUtilities;
import com.QaTools.pages.ElementsPage;
import com.QaTools.pages.HomePageobject;
import com.QaTools.pages.WebTablesPage;

public class VerifyWebTable extends TestUtilities {

	@Parameters({ "fname", "lname", "age", "email", "salary", "department" })
	@Test(priority = 1)
	public void webtable(String fname, String lname, String Age, String Email, String Salary, String Department)
			throws InterruptedException {

		log.info("Starting Web table verify test");

		HomePageobject homePageobject = new HomePageobject(driver, log);

		homePageobject.openBaseApplication();

		ElementsPage elementpage = homePageobject.ClickToOpenElements();

		WebTablesPage webTablesPage = elementpage.ClickToOpenWebTables();

		// verify Page header
		SoftAssert sfassert = new SoftAssert();

		String ActualHeader = webTablesPage.getPageHeader();
		String ExpectedHeader = "Web Tables";

		sfassert.assertEquals(ActualHeader, ExpectedHeader, "you are currently on the wrong page" + ActualHeader);

		sfassert.assertAll();

		// Click on the Add button to add details to form and submit details

		webTablesPage.ClickOnAddButton();

		webTablesPage.addDataRow(fname, lname, Age, Email, Salary, Department);

	}

}
