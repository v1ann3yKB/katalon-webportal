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
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')
//
//WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Email_r0'), 
//    'crossi@littlefishapp.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
//    'yPDJi4/cIbnepc0wXCuJUg==')
//
//WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/button_Sign In'))

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

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Selling'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/a_Products'))

WebUI.delay(3)

//WebUI.scrollToPosition(0, 0)
'scroll to pagination'
WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Rows per page10110 of 22123'), 
    0)

'click on add Product BTN'
WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/button_Add Product'))

//'Click on add Image'
//WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Add Image'))
//
//WebUI.delay(2)
//
//'Upload an image'
//WebUI.uploadFile(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Add Image'), 
//    '/Users/vb/Downloads/IMG_1539.png')
//
//WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/span_Add Image'))
//WebUI.delay(10)

'Scroll to Details'
WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/p_Details'),
	0)

WebUI.delay(2)

'add product name'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Name_displayName'), 
    'New Katalon')

WebUI.delay(0)

'Category Option'
WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Remove_MuiBackdrop-root MuiBackdrop-inv_66931d'))

'select testing as category'
WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_Testing Portal'))

'Tags option'
WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/svg_Tags_MuiSvgIcon-root MuiSvgIcon-fontSiz_845f24'))

'select test as Tag'
WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_test'))

'adding product description'
WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/textarea_Testing'), 
    'Testing')

//'Scroll to Details'
//WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/p_Details'), 
//    0)

WebUI.delay(2)

'Scroll to Channels'
WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_ChannelsSelect Sales ChannelsChoose pla_86a53b'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Select Sales Channels_isInStore'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_In Store_isOnline'))

'Scroll to Price'
WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_PriceSelling Price per ItemRSelling Pri_8007d2'), 
    0)

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__sppi'), 
    '200.00')

WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__cppi'), 
    '0.00')

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__cppi'))

WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__cppi'), 
    '100.00')

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Stock DetailsTrack stock for this product'), 
    0)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Cost Price per Item_isStockTrackable'))

WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__stockCount'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input__lowStockValue'), 
    '5')

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Product Options (0 of 3 Added)RemovingA_2af95e'), 
    0)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Low Stock Value_variant-input'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_Size'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-Size'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_Small'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-Size'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_Medium'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Low Stock Value_attribute-value-input-Size'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_Large'))

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Manage VariantThe below information is _0704c4'), 
    0)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariants'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/input_Remove_isManagedVariantsStock'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/svg_S_iconify iconify--mdi'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/button_Add Product'))

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_Rows per page10110 of 23123'), 
    0)

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_50'))

WebUI.click(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/li_100'))

WebUI.scrollToElement(findTestObject('Object Repository/Selling/Products/Online Catalogue/Add Product/Page_littlefish - Web-portal/div_NKNew Katalon'), 
    0)

WebUI.closeBrowser()

