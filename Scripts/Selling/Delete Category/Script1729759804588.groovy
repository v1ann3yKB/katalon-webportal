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

'Navigate to a specific Url'
WebUI.navigateToUrl(GlobalVariable.URL)

'Login with a specific User'
WebUI.setText(findTestObject('Object Repository/Home/Login/Page_littlefish - Web-portal/input_Email_r0'), GlobalVariable.UserName)

'Enter a specific Password'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Add Product/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), GlobalVariable.Password)

'Click On login button'
WebUI.click(findTestObject('Object Repository/Home/Login/Page_littlefish - Web-portal/button_Sign In'))

'Click on Selling tab'
WebUI.click(findTestObject('Object Repository/Selling/Products/add category/Page_littlefish - Web-portal/div_Selling'))

'Click on Category Tab'
WebUI.click(findTestObject('Object Repository/Selling/Products/add category/Page_littlefish - Web-portal/div_Categories'))

'Click on 3 dot option Button'
WebUI.click(findTestObject('Object Repository/Selling/Products/add category/Page_littlefish - Web-portal/button_nkc_demo-positioned-button'))

'Delay'
WebUI.delay(10)

'Click on Delete option'
WebUI.click(findTestObject('Object Repository/Selling/Products/add category/Page_littlefish - Web-portal/li_Delete'))

