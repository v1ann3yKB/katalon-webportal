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

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/div_Sign InPlease sign-in to your account a_2f100a'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/p_Cesare Rossie'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/div_Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/a_Home'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/div_Products'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/p_All Products'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/a_Products Combos'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/p_Import Product catalogue'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/div_Reports'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/div_Settings'))

WebUI.click(findTestObject('TestingObjects/Page_littlefish - Web-portal/a_Users  Roles'))

WebUI.closeBrowser()

