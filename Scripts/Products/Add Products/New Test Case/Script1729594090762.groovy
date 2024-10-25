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

WebUI.navigateToUrl('https://portal.littlefish.mobi/auth/login/?returnUrl=%2F')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Email_r0'))

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Home'))

'Click on selling'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Selling'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Orders'))

'Click on online Catalogue '
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Online Catalogue'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/button_ProductsAdd, edit  organize your pro_f56f04'))

'Click on add Product BTN'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/button_Add Product'))

'Enter Product Name'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Name_displayName'), 
    'Katalon Product 1')

'Tap on category field drop down list'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Remove_MuiBackdrop-root MuiBackdrop-inv_66931d'))

'select Testing portal as category'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/li_Testing Portal'))

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/div_Description'), 
    0)

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/textarea_testing'), 
    'testing')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/p'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/p_just a test'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Select Sales Channels_isInStore'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_In Store_isOnline'))

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/p_Price'), 
    0)

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input__sppi'), 
    '200.00')

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input__cppi'), 
    '100.00')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input_Cost Price per Item_isStockTrackable'))

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/p_Stock Details'), 
    0)

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input__stockCount'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/input__lowStockValue'), 
    '5')

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/p_Product Options (0 of 3 Added)'), 
    0)

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/svg_Remove_iconify iconify--mdi'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/Page_littlefish - Web-portal/button_Add Product'))

