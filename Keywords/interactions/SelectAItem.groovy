package interactions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class SelectAItem {

	def static ofMenu() {
		WebUI.focus(findTestObject('Object Repository/PageHome/btnCaterory'))
		WebUI.takeScreenshot()


		WebUI.click(findTestObject("PageHome/btnSubcategory"))
		WebUI.takeScreenshot()
	}
	def static ofProduct() {
		WebUI.waitForElementVisible(findTestObject("Object Repository/PageProduct/BtnProduct"), 3)
		WebUI.scrollToElement(findTestObject("PageProduct/BtnProduct"), 3)

		WebUI.focus(findTestObject("Object Repository/PageProduct/BtnProduct"))
		WebUI.click(findTestObject("Object Repository/PageProduct/BtnMore"))
	}
}
