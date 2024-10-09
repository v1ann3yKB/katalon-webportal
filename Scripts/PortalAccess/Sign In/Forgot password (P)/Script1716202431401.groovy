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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.delay(5)

WebUI.click(findTestObject('SignIn/N-Test/ErrorMessage/Page_littlefish - Web-portal/input_Email_r0'))

//verify the email

variableEmailValue = WebUI.getAttribute(findTestObject('SignIn/N-Test/ErrorMessage/Page_littlefish - Web-portal/input_Email_r0'), 'value')

if (WebUI.verifyEqual(variableEmailValue, 'crossi@littlefishapp.com')) {
	KeywordUtil.markPassed("Email is Correct")
}else {
	KeywordUtil.markFailed("Email is not Correct")
}

//
WebUI.delay(5)

WebUI.click(findTestObject('SignIn/N-Test/ErrorMessage/Page_littlefish - Web-portal/a_Forgot Password'))

WebUI.delay(5)

WebUI.click(findTestObject('SignIn/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

//verify the Password

//variablePasswordValue = WebUI.getAttribute(findTestObject('SignIn/N-Test/ErrorMessage/Page_littlefish - Web-portal/a_Forgot Password'), 'value')
//
//if (WebUI.verifyEqual(variablePasswordValue, '!QAZxsw2')) {
//	KeywordUtil.markPassed("Password is Correct")
//}else {
//	KeywordUtil.markFailed("Password is not Correct")
//}

//
WebUI.delay(5)

WebUI.click(findTestObject('SignIn/N-Test/ErrorMessage/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(10)


