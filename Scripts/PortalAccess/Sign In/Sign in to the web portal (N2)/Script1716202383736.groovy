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

WebUI.refresh()

WebUI.delay(3)

WebUI.setText(findTestObject('SignIn/Page_littlefish - Web-portal/input_Email_r0'), 'mdecarvalho@littlefishapp.com')

//WebUI.setText(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/input_Email_r0'), 'mdecarvalho@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbm2qgZwwoG2XA==')

WebUI.delay(3)

WebUI.click(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

WebUI.delay(3)

WebUI.click(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

//WebUI.clearText(findTestObject('SignIn/N1/Page_littlefish - Web-portal/input_Email_r0'))
//
//WebUI.delay(3)
//
//WebUI.clearText(findTestObject('SignIn/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'))
//
//WebUI.delay(3)

//WebUI.refresh()

//WebUI.delay(10)
//
//WebUI.setEncryptedText(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
//    'yPDJi4/cIbm2qgZwwoG2XA==')
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('SignIn/N-Test/N2/Page_littlefish - Web-portal/button_Sign In'))
//
//WebUI.delay(5)
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')


//WebUI.closeBrowser()

