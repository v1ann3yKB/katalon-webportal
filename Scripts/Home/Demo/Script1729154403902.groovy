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

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Email_r0'), 
    'vkondo+absa1@littlfishapp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    '8+XIE/35i52dYSAw5Nn3uw==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Email_r0'), 
    'demo@littlfishapp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    '8+XIE/35i52dYSAw5Nn3uw==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Sign InEmailEmailPasswordPasswordForgot_5b93a2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'ieKK0TqxD5/T5fBFzBWjIA==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Sign InEmailEmailEmail or Password is i_754714'))

WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'ieKK0TqxD5/T5fBFzBWjIA==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Sign InEmailEmailPasswordPasswordForgot_5b93a2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/a_Home'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Selling'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Home'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Orders'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Online Catalogue'))

'Open product under online catalogue '
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/button_ProductsAdd, edit  organize your pro_f56f04'))

'Clicked on add product button'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/button_Add Product'))

'adding product name'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/input_Name_displayName'), 
    'New Katalon Product')

'Click on category '
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/div_Remove_MuiBackdrop-root MuiBackdrop-inv_66931d'))

'selecting Testing Portal as category'
WebUI.click(findTestObject('Object Repository/Selling/Products/Adding products/Page_littlefish - Web-portal/li_Testing Portal'))

