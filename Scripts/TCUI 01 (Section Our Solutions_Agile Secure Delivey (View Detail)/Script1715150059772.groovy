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

WebUI.click(findTestObject('New Folder/Page_Solutions - Agile Secure Delivery Solu_04ddbd/Page_Solutions - Agile Secure Delivery Solutions  Divistant - More Than Innovation/Page_Home  Divistant - More Than Innovation/a_Agile Secure Delivery Solutions'))

WebUI.getText(findTestObject('New Folder/Page_Solutions - Agile Secure Delivery Solu_04ddbd/Page_Solutions - Agile Secure Delivery Solutions  Divistant - More Than Innovation/Page_Home  Divistant - More Than Innovation/datahome'))

WebUI.verifyElementPresent(findTestObject('New Folder/Page_Solutions - Agile Secure Delivery Solu_04ddbd/Page_Solutions - Agile Secure Delivery Solutions  Divistant - More Than Innovation/Page_Home  Divistant - More Than Innovation/Agile'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Home  Divistant - More Than Innovation/button_View Detail'))

WebUI.click(findTestObject('New Folder/Page_Solutions - Agile Secure Delivery Solu_04ddbd/h1_Agile Secure Delivery Solutions'))

WebUI.verifyElementPresent(findTestObject('New Folder/Page_Solutions - Agile Secure Delivery Solu_04ddbd/h1_Agile Secure Delivery Solutions'), 
    30)

WebUI.takeFullPageScreenshot()

