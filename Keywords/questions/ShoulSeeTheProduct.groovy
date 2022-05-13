package questions

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ShoulSeeTheProduct {

	static final String MSG_PRODUCT_INCAR = MSG_PRODUCT_INCAR
	def static isAdd() {
		WebUI.verifyMatch(GlobalVariable.MSG_PRODUCT_INCAR,WebUI.getText(findTestObject("PageProductDetail/lblSuccessfullyShoping")).trim() , false)
		WebUI.verifyMatch(GlobalVariable.PRODUCT, WebUI.getText(findTestObject("PageProductDetail/lblProductCart")).trim(), false)
		WebUI.verifyMatch(GlobalVariable.COLOR+", "+GlobalVariable.SIZE, WebUI.getText(findTestObject("PageProductDetail/lblColorSizeCart")).trim(), false)
		WebUI.verifyMatch(GlobalVariable.QUANTITY, WebUI.getText(findTestObject("Object Repository/PageProductDetail/lblQuantityProductCart")).trim(), false)

		WebUI.verifyMatch(GlobalVariable.TOTAL, WebUI.getText(findTestObject("Object Repository/PageProductDetail/lblTotalCart")).replace('$', "").trim(), false)
	}
}
