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

WebUI.setText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Cesare Rossie Administrator'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/div_Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Cesare Rossie Administrator'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/div_Contact_MuiBackdrop-root MuiBackdrop-in_9739e7'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Add New Products'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/span_Add Image'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/img'))

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Name_displayName'), 
    'You Know mean ')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/div_Remove_MuiBackdrop-root MuiBackdrop-inv_66931d'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/li_Extras'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/input_Tags_r2'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/li_hat'))

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/textarea_You know me hat'), 
    'You know me hat')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p'))

WebUI.delay(5)

WebUI.setText(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/div_Description_ql-editor'), 
    '<p style="outline: rgb(255, 0, 0) solid 2px;">cool</p>')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Product Options'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Manage Variant'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/path'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Add/Page_littlefish - Web-portal/p_Channels'))

WebUI.delay(5)

WebUI.closeBrowser()

