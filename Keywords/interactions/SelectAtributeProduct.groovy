package interactions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.logging.Logger

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.util.logging.Log4j
import internal.GlobalVariable
import model.Product

public class SelectAtributeProduct {
	
	def static selectQuantity()
	{
		WebUI.waitForElementVisible(findTestObject("Object Repository/PageProductDetail/txtQuantity"), 3)
		WebUI.setText(findTestObject("Object Repository/PageProductDetail/txtQuantity"),Product.get_Quantity())	
	}
	
	def static selectSize()
	{
		WebUI.selectOptionByLabel(findTestObject("Object Repository/PageProductDetail/selectSize"),Product.get_Size() ,false )
	}
	def static selectColor()
	{
		WebUI.click(findTestObject("Object Repository/PageProductDetail/CheckColor"))
	}
	def static addCToCar()
	{
		WebUI.click(findTestObject("PageProductDetail/btnAddToCart"))
	}
}
