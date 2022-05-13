package util

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
import io.cucumber.datatable.DataTable
import model.Product

public class Read {
	
	def static the(DataTable data)
	{
		
		List<Map<String,String>> values=data.asMaps(String.class,String.class)
		
		if(values[0].containsKey("product"))
		{
			Product.set_ProductName(values[0].get("product"))
			Product.set_CategoryName(values[0].get("category"))
			Product.set_SubCategoryName(values[0].get("subcategory"))			 
		}
		else if (values[0].containsKey("quantity")) {
			Product.set_Quantity(values[0].get("quantity"))
			Product.set_Size(values[0].get("size"))
			Product.set_Color(values[0].get("color"))			
		}
				
	}
}
