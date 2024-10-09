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

WebUI.delay(3)

WebUI.setText(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/input_Email_r0'), 'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_Users  Roles'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/button_Invite New User'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_User AuthenticationCreate PasswordCreat_29ea38'), 0)

WebUI.delay(3)

'Scroll to user Auth'
//WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_User AuthenticationCreate PasswordCreat_29ea38'))

WebUI.scrollToElement(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_Assign RoleStore ManagerWhile possessin_8f9f2e'), 0)

WebUI.delay(3)

//WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/p_Assign Role'))

'Scroll to Assign role'
//WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/div_Assign RoleStore ManagerWhile possessin_8f9f2e'))

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/button_Create New Role_MuiButtonBase-root M_353dca'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Invite User/Page_littlefish - Web-portal/button_Agree'))

WebUI.delay(3)

WebUI.closeBrowser()

