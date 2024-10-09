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

WebUI.setText(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/input_Email_r0'), 'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/p_Users  Roles'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Cashier'))

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.scrollToElement(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'), 2)

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.delay(5)
//
WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))

WebUI.delay(5)
//
WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Refunds and VoidsIssue refunds and void sales'))

WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Refunds and VoidsIssue refunds and void sales'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Transaction HistoryView and manage tran_579a09'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))
//
//WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'), 2)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Role description_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/path'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/ul_SalesAdd Quick Item to SaleMake Quick Am_50e8a3'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/p_Tips'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/p_Split Payments'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/p_Barcode Scanning'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Cashier/Page_littlefish - Web-portal/svg_Administrator_iconify iconify--mi'))

WebUI.delay(5)

WebUI.closeBrowser()

