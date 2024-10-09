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

//import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
//import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
//import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
//import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/p_Add New Products'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/div_Product OptionsTesttestRemovingAdding o_e07461'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/p_Product Options'))

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_SKU_new-attribute-input'), 
    'Test')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/button_Add'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/button_Add'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/button_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_SKU_attribute-value-input-Test'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_SKU_new-attribute-input'))

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_SKU_attribute-value-input-Test'), 
    'test')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/input_SKU_attribute-value-input-Test'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/svg_Remove_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Options/Capture Option/Page_littlefish - Web-portal/div_Product OptionsTesttestRemovingAdding o_e07461'))

WebUI.delay(5)

WebUI.closeBrowser()

