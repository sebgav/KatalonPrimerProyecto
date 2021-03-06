package stepDefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.cucumber.datatable.DataTable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper


import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.After
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import task.*
import questions.*
import util.*



class CartStepDefinitions {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("that user has opened the commerce")
	public void that_user_has_opened_the_commerce() {
		Navigate.toUrl()
	}
	@When("he select the product from the following section")
	public void he_select_a_product_in_the_category_section(DataTable data) {
		Read.the(data);
		Select.a_Product()
	}
	@When("he adds a products to the cart with")
	public void he_adds_a_products_to_the_cart(DataTable data) {
		Read.the(data);
		Add.aProduct()
	}
	@Then("he should see the added product in the cart")
	public void he_should_see_the_added_product_in_the_cart() {
		ShoulSeeTheProduct.isAdd()
	}
	
	@After
	def finish()
	{
		WebUI.closeBrowser()
	}
}