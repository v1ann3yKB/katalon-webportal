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

WebUI.switchToWindowTitle('littlefish - Web-portal')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Products'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_littlefish_MuiBox-root css-16nkqqd'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/img'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Details'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/main_Add ProductAdd ProductCancelProductsAd_94c4b2'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Name_displayName'), 
    'Testing')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/body_littlefishCesare Rossie AdministratorH_f72a07'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Devices'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Tags_r2'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_pants'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_t'), 
    't')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_te'), 
    'te')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_tes'), 
    'tes')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_test'), 
    'test')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testi'), 
    'testi')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testin'), 
    'testin')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testing'), 
    'testing')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Description_ql-editor'), 
    '<p style="">testing 123</p>')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Channels'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Select Sales Channels_isInStore'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_In Store_isOnline'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Price'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__sppi'), 
    '120.00')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__cppi'), 
    '100.00')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Stock Details'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Cost Price per Item_isStockTrackable'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Cost Price per Item_autoGenerateSKU'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__stockCount'), 
    '12')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__lowStockValue'), 
    '1')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Product Options'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_new-attribute-input'), 
    'abc')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Add'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-abc'), 
    'cbd')

WebUI.sendKeys(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-abc'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Manage VariantThe below information is _baa1b7'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariants'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariantsStock'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_c_iconify iconify--mdi'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/path'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_c_iconify iconify--mdi_1'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Edit'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Stock Count_r17'), 
    '10')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_r18'))

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_r18'), 
    '10')

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Stock Count_r17'), 
    '100')

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/body_littlefishCesare Rossie AdministratorH_cdfb0e'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Enabled'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/img_1'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Apply'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Visablity_iconify iconify--mdi'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Add Product'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/a_All Products'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.closeBrowser()

