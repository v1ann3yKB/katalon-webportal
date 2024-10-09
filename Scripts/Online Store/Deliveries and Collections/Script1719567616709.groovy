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

//WebUI.navigateToUrl('https://www.udemy.com/course/mobile-automation-using-appiumselenium-3/learn/lecture/2012878?start=0#overview')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.delay(3)

WebUI.switchToWindowTitle('littlefish - Web-portal')

WebUI.delay(3)

WebUI.setText(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/p_Online Store'))

WebUI.delay(3)

WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/p_Deliveries  Collections'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Please set your delivery preferencesSet_f6c859'), 0)

WebUI.delay(3)

'scroll to delivery'
//WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Please set your delivery preferencesSet_f6c859'))

WebUI.scrollToElement(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Please set your collections preferences_795788'), 0)

WebUI.delay(3)

'scroll to collections'
//WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Please set your collections preferences_795788'))

WebUI.scrollToElement(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Collection AddressUse your business add_4c244d'), 0)

WebUI.delay(3)

'scroll to Collection address'
//WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/div_Collection AddressUse your business add_4c244d'))

WebUI.scrollToElement(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/p_Collection instructions'), 0)

WebUI.delay(3)

'Scroll Collection'
//WebUI.click(findTestObject('Online Store/delivery and collection/Page_littlefish - Web-portal/p_Collection instructions'))

WebUI.closeBrowser()

