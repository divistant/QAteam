import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://divistant.net/')

WebUI.click(findTestObject('Object Repository/Quality Asuranced/Page_Home  Divistant - More Than Innovation/a_Quality Assured Delivery'))

WebUI.verifyElementPresent(findTestObject('Quality Asuranced/Page_Home  Divistant - More Than Innovation/Page_Home  Divistant - More Than Innovation/Page_Home  Divistant - More Than Innovation/card_Quality Assured Delivery'), 
    30)

WebUI.verifyMatch('Quality Assured Delivery', 'Quality Assured Delivery', false)

WebUI.click(findTestObject('Object Repository/Quality Asuranced/Page_Home  Divistant - More Than Innovation/button_View Detail'))

WebUI.verifyElementPresent(findTestObject('Quality Asuranced/Page_Solutions - Quality Assured Delivery  Divistant - More Than Innovation/heading_Quality Assured Delivery solution'), 
    30)

WebUI.closeBrowser()

