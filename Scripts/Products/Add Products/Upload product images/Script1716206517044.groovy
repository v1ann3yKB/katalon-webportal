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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/button_Sign In'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.setText(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/input_Email_r0'),
	'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'),
	'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

//WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.delay(5)

//WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/div_Add Image'))

WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/span_Add Image'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/images/Page_littlefish - Web-portal/img'))

WebUI.delay(5)

//WebUI.closeBrowser()

