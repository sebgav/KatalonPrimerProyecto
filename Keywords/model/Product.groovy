package model

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

import internal.GlobalVariable

public class Product {


	def static set_ProductName(String product) {
		GlobalVariable.PRODUCT=product
	}
	def static get_ProductName() {
		return GlobalVariable.PRODUCT
	}

	def static set_CategoryName(String category) {
		GlobalVariable.CATEGORY=category
	}
	def static get_CategoryName() {
		return GlobalVariable.CATEGORY
	}

	def static set_SubCategoryName(String subCategory) {
		GlobalVariable.SUBCATEGORY=subCategory
	}
	def static get_SubCategoryName() {
		return GlobalVariable.SUBCATEGORY
	}

	def static set_Quantity(String quantity) {
		GlobalVariable.QUANTITY=quantity
	}
	def static get_Quantity() {
		return GlobalVariable.QUANTITY
	}

	def static set_Size(String size) {
		GlobalVariable.SIZE=size
	}
	def static get_Size() {
		return GlobalVariable.SIZE
	}

	def static set_Color(String color) {
		GlobalVariable.COLOR=color
	}
	def static get_Color() {
		return GlobalVariable.COLOR
	}

	def static set_Total(String total) {
		GlobalVariable.TOTAL=total
	}
	def static get_Total() {
		return GlobalVariable.TOTAL
	}
}
