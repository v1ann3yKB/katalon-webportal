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

WebUI.setText(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/input_Email_r0'),
	'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'),
	'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/p_Add New Products'))

WebUI.delay(5)

//WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_DetailsNameNameCategory CategoryTagsTag_647759'))
//
//WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_ChannelsSelect Sales ChannelsChoose pla_86a53b'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/input_Select Sales Channels_isInStore'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/input_In Store_isOnline'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Select Sales ChannelsChoose platforms w_cef18e'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_ChannelsSelect Sales ChannelsChoose pla_86a53b'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_PriceSelling Price per ItemRSelling Pri_8007d2'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/form_Selling Price per ItemRSelling Price p_8be390'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Stock DetailsTrack stock for this produ_f166b7'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Track stock for this productAutogenerate SKU'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Product OptionsRemovingAdding of a new _40560e'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Product OptionsRemovingAdding of a new _40560e'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/div_Manage VariantThe below information is _baa1b7'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Channels/Capture Channels/Page_littlefish - Web-portal/svg_Remove_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.closeBrowser()
