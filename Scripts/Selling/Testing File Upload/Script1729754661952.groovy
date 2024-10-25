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
//'Navigate to to the the Url'
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')
//
//'Enter email as user name'
//WebUI.setText(findTestObject('Page_littlefish - Web-portal/input_Email_r0 (1)'), 'crossi@littlefishapp.com')
//
//'Icon to view the password'
//WebUI.click(findTestObject('Object Repository/Selling/Products/Add Product/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))
//
//'Enter password'
//WebUI.setText(findTestObject('Page_littlefish - Web-portal/input_Password_auth-login-v2-password (1)'), '!QAZxsw21')
//
//WebUI.delay(3)

WebUI.openBrowser('')

'Navigate to a specific Url'
WebUI.navigateToUrl(GlobalVariable.URL)

'Login with a specific User'
WebUI.setText(findTestObject('Object Repository/Home/Login/Page_littlefish - Web-portal/input_Email_r0'), GlobalVariable.UserName)

'Enter a specific Password'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Add Product/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), GlobalVariable.Password)

'Click On login button'
WebUI.click(findTestObject('Object Repository/Home/Login/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

'click on Selling Tab'
WebUI.click(findTestObject('Object Repository/Selling/Test for file Upload/Page_littlefish - Web-portal/div_Selling'))

'click on Categories Tab'
WebUI.click(findTestObject('Object Repository/Selling/Test for file Upload/Page_littlefish - Web-portal/div_Categories'))

'click on Add Category Button'
WebUI.click(findTestObject('Object Repository/Selling/Test for file Upload/Page_littlefish - Web-portal/button_Add Category'))

WebUI.click(findTestObject('Object Repository/Selling/Test for file Upload/Page_littlefish - Web-portal/div_Upload Category Banner'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('Selling/Test for file Upload/Page_littlefish - Web-portal/File_Upload'), 'Users/vb/Downloads/IMG_1522.png')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Selling/Test for file Upload/Page_littlefish - Web-portal/div_Upload Category Banner'), 
//    0)

WebUI.delay(10)

WebUI.closeBrowser()
