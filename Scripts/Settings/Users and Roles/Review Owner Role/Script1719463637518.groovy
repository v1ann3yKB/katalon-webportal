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

WebUI.setText(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/p_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/p_Users  Roles'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_1 userAdministrator'))

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

WebUI.scrollToElement(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'), 2)

WebUI.delay(5)

'till'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_TillManage permissions for the till'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

'refunds and voids'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Refunds and VoidsIssue refunds and void sales'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'transaction history'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Transaction HistoryView and manage tran_579a09'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

'batching'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_BatchingClose and reprint batches'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

'Orders'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_OrdersManage and fulfill orders'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

//WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'))

WebUI.scrollToElement(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'), 2)

WebUI.delay(5)

'Product catalog'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Product CatalogueAccess and manage prod_728242'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

'inventory'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_InventoryView and manage suppliers and _32e722'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

'customers'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_CustomersView and manage customers'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'expenses'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_ExpensesView and manage business expenses'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'store details'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Store DetailsView and manage business i_6b49a8'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'payments & Linked Accounts'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Payments  Linked AccountsView and manag_1d789d'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'Reports'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_ReportsView business analytics'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_ReportsView business analytics'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Set up and manage payment types and lin_bfb23c'))

WebUI.delay(5)

WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/svg_Scan Barcode_iconify iconify--mdi'))

WebUI.delay(5)

'user and roles'
WebUI.click(findTestObject('Settings/Owner Roles (admin)/Page_littlefish - Web-portal/div_Users and RolesAccess and manage users _32ceb2'))

WebUI.delay(5)

WebUI.closeBrowser()
