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

WebUI.setText(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Users  Roles'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_1 userStore Manager1 userSupervisor0 us_0874f6'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/a_Create New Role'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Role DetailsRole nameRole nameRole desc_a4580e'), 2)

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Role DetailsRole nameRole nameRole desc_a4580e'))

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'), 2)

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'))

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/main_Create New RoleCreate RoleCancelUsers _84e061'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/svg_Setup and Manage Online Store_iconify i_fe4219'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Open Create Roles/Page_littlefish - Web-portal/svg_Administrator_iconify iconify--mi'))

WebUI.delay(5)

WebUI.closeBrowser()

