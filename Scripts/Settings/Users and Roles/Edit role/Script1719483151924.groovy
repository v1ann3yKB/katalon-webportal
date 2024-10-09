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

WebUI.setText(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Email_r0'), 'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Users  Roles'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/h6_Developers'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'), 0)

WebUI.delay(3)

'Scroll'
//WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Sales and RefundsTillManage permissions_5ddaea'))

'OPen Till'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_TillManage permissions for the till'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/p_Cashback'), 0)

WebUI.delay(3)

'Scrool to cashback'
//WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/p_Cashback'))

'Close Till'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_TillManage permissions for the till'))

WebUI.delay(3)

'Open Refunds and voids'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Refunds and VoidsIssue refunds and void sales'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Scan Barcode_PrivateSwitchBase-input _7ce803'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Scan Barcode_PrivateSwitchBase-input _7ce803'))

WebUI.delay(3)

'Close Refunds and voids'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Refunds and VoidsIssue refunds and void sales'))

WebUI.delay(3)

'OPen Batching'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_BatchingClose and reprint batches'))

WebUI.delay(3)

'Select all in a category'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_View Transaction History_Batching'))

WebUI.delay(3)

'Clsoe Batching'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_BatchingClose and reprint batches'))

WebUI.delay(3)

'OPen Orders'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_OrdersManage and fulfill orders'))

WebUI.delay(3)

'Close Orders'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_OrdersManage and fulfill orders'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'), 0)

WebUI.delay(3)

'Scroll to Manage Store'
//WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Manage StoreProduct CatalogueAccess and_7909cb'))

'Open Products Catalogue'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Product CatalogueAccess and manage prod_728242'))

WebUI.delay(3)

'Close Product Catalogue'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Product CatalogueAccess and manage prod_728242'))

WebUI.delay(3)

'Open Inventory'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_InventoryView and manage suppliers and _32e722'))

WebUI.delay(3)

//WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Scan Barcode_PrivateSwitchBase-input _7ce803'))
//
//WebUI.delay(3)

'Close Inventory '
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_InventoryView and manage suppliers and _32e722'))

WebUI.delay(3)

'Open Customers'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_CustomersView and manage customers'))

WebUI.delay(3)

'Close Customers'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_CustomersView and manage customers'))

WebUI.delay(3)

'Open Expenses'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_ExpensesView and manage business expenses'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/input_Manage customer store credit_Expenses'))

WebUI.delay(3)

'Close Expenses'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_ExpensesView and manage business expenses'))

WebUI.delay(3)

'OPen Store Details'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Store DetailsView and manage business i_6b49a8'))

WebUI.delay(3)

'Close Store Details '
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Store DetailsView and manage business i_6b49a8'))

WebUI.delay(3)

'Open Payments & Linked Accounts'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Payments  Linked AccountsView and manag_1d789d'))

WebUI.delay(3)

'Close Payment & Linked Accounts'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Payments  Linked AccountsView and manag_1d789d'))

WebUI.delay(3)

'OPen Reports'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_ReportsView business analytics'))

WebUI.delay(3)

'Close Reports'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_ReportsView business analytics'))

WebUI.delay(3)

'OPen User and Roles'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Users and RolesAccess and manage users _32ceb2'))

WebUI.delay(3)

'Close Users and Roles'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Users and RolesAccess and manage users _32ceb2'))

WebUI.delay(3)

'OPen Online Store'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Online StoreView and manage online stor_f42c8f'))

WebUI.delay(3)

'Close Online Store'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/div_Online StoreView and manage online stor_f42c8f'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/svg_Setup and Manage Online Store_iconify i_fe4219'))

WebUI.delay(3)

'Edite Roles'
WebUI.click(findTestObject('Settings/Edit Role/Page_littlefish - Web-portal/button_Edit Role'))

WebUI.delay(3)

WebUI.closeBrowser()

