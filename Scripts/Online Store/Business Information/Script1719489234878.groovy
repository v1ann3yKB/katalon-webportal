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

//WebUI.navigateToUrl('https://generalclothers.littlefish.mobi/account/my-order')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.delay(3)

WebUI.switchToWindowTitle('littlefish - Web-portal')

WebUI.delay(3)

WebUI.setText(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Online Store'))

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/p_Business Information'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Please introduce yourselfPlease add bas_1d0b74'), 0)

WebUI.delay(3)

'Scroll to Intro'
//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Please introduce yourselfPlease add bas_1d0b74'))

WebUI.scrollToElement(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_How do we get in touch with youPlease a_4080b4'), 0)

WebUI.delay(3)

'Scroll to get in touch'
//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_How do we get in touch with youPlease a_4080b4'))

WebUI.scrollToElement(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Where are you locatedPlease add your ad_3a843e'), 0)

WebUI.delay(3)

'scroll to location'
//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Where are you locatedPlease add your ad_3a843e'))

WebUI.scrollToElement(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Do you have any social media linksIf yo_a0d747'), 0)

WebUI.delay(3)

'scroll to socials'
//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_Do you have any social media linksIf yo_a0d747'))

WebUI.scrollToElement(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_What times do you operateAdd your openi_2c1ae1'), 0)

WebUI.delay(3)

'scroll to time and days'
//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/div_What times do you operateAdd your openi_2c1ae1'))

WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/button_Public Holidays_MuiButtonBase-root M_7e88bd'))

WebUI.delay(3)

//WebUI.click(findTestObject('Online Store/Business Info/Page_littlefish - Web-portal/path'))
//
//WebUI.delay(3)

WebUI.closeBrowser()

