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
//WebUI.click(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/button_Sign In'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/div_Products'))

WebUI.click(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.scrollToElement(findTestObject('Products/Add/Page_littlefish - Web-portal/h6_Product Options'), 
    0)

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/input_Product Options_new-attribute-input'), 
    'Front-End')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/button_Add'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/input_Product Options_attribute-value-input_97991f'), 
    'react')

WebUI.sendKeys(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/input_Product Options_attribute-value-input_97991f'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/input_Product Options_attribute-value-input_97991f'), 
    'angular')

WebUI.sendKeys(findTestObject('Products/AddProducts/Options/Page_littlefish - Web-portal/input_Product Options_attribute-value-input_97991f'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

