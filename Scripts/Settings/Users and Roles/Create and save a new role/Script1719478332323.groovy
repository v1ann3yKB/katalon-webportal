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

WebUI.delay(5)

WebUI.setText(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Users  Roles'))

WebUI.delay(5)

'Click on Create New Role'
WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/a_Create New Role'))

WebUI.delay(5)

WebUI.setText(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Role name_r0'), 
    'Developers')

WebUI.delay(5)

WebUI.setText(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/textarea_This is a dev role'), 
    'This is a dev role')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'), 0)

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_TillManage permissions for the till'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Role description_Till'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Void a Sale_Transaction History'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Reprint Batch_Orders'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'), 0)

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'))

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_View and process orders submitted fro_c65f92'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_View and Manage Employees_Online Store'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/input_Financial Statement_Users and Roles'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/button_Setup and Manage Online Store_MuiBut_22f5c1'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/button_Create Role'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Create and Save Role/Page_littlefish - Web-portal/button_Setup and Manage Online Store_MuiBut_22f5c1'))

WebUI.delay(5)

WebUI.closeBrowser()

