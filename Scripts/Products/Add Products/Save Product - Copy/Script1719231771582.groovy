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

//WebUI.switchToWindowTitle('littlefish - Web-portal')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.littlefish.mobi/')

WebUI.setText(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/input_Email_r0'),
	'crossi@littlefishapp.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'),
	'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/images/IMG V1/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(3)

//WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Email_r0'), 
//    'crossi@littlefishapp.com')
//
//WebUI.setEncryptedText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
//    'yPDJi4/cIbnepc0wXCuJUg==')

//WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Password_iconify iconify--mdi'))
//
//WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Sign In'))

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_littlefish_MuiBox-root css-16nkqqd'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Details'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/main_Add ProductAdd ProductCancelProductsAd_94c4b2'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Name_displayName'), 
    'Testing')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/body_littlefishCesare Rossie AdministratorH_f72a07'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Devices'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Tags_r2'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_pants'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_t'), 
    't')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_te'), 
    'te')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_tes'), 
    'tes')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_test'), 
    'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testi'), 
    'testi')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testin'), 
    'testin')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/textarea_testing'), 
    'testing')

WebUI.delay(1)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Description_ql-editor'), 
    '<p style="">testing 123</p>')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Channels'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Select Sales Channels_isInStore'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_In Store_isOnline'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Price'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__sppi'), 
    '120.00')

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__cppi'), 
    '100.00')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Stock Details'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Cost Price per Item_isStockTrackable'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Cost Price per Item_autoGenerateSKU'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__stockCount'), 
    '12')

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input__lowStockValue'), 
    '1')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/p_Product Options'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_new-attribute-input'), 
    'abc')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Add'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-abc'), 
    'cbd')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-abc'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Manage VariantThe below information is _baa1b7'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariants'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariantsStock'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_c_iconify iconify--mdi'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/path'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_c_iconify iconify--mdi_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Edit'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Stock Count_r17'), 
    '10')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_r18'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Low Stock Value_r18'), 
    '10')

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/input_Stock Count_r17'), 
    '100')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/body_littlefishCesare Rossie AdministratorH_cdfb0e'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/li_Enabled'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/div_Add Image'))

WebUI.delay(8)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/img_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Apply'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Visablity_iconify iconify--mdi'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/button_Add Product'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/a_All Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.delay(5)

//WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))
//
//WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))
//
//WebUI.click(findTestObject('Products/AddProducts/New Folder Add Product/Page_littlefish - Web-portal/svg_Add Product_MuiSvgIcon-root MuiSvgIcon-_edfa3e'))

WebUI.closeBrowser()

