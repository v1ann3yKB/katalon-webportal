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

WebUI.setText(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/input_Email_r0'), 'crossi@littlefishapp.com')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/a_Add New Products'))

WebUI.delay(3)

//WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/div_Add Image'))
//
//WebUI.delay(3)
//
//'Passing the path of the file'
//WebUI.uploadFile(findTestObject('Upload File'), '/Users/vb/Downloads/ecosystem (1).png')
//
//WebUI.delay(5)
// 
//'Capturing the file name after upload and storing it in a variable'
//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')
//
//WebUI.delay(5)

//WebUI.uploadFile(findTestObject(null), '/Users/vb/Downloads/ecosystem (1).png')

WebUI.setText(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/input_Name_name'), 
    'youKnowWho')

WebUI.delay(3)

WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/div_Manage Variant_MuiBackdrop-root MuiBack_451c25'))

WebUI.delay(3)

//WebUI.click(findTestObject('Products/AddProducts/Channels/Page_littlefish - Web-portal/div_Manage Variant_MuiBackdrop-root MuiBack_451c25'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Products/AddProducts/Channels/Page_littlefish - Web-portal/div_Manage Variant_MuiBackdrop-root MuiBack_451c25'))
//
//WebUI.delay(2)
WebUI.click(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/li_Extras'))

WebUI.delay(3)

WebUI.setText(findTestObject('Products/AddProducts/Details/Page_littlefish - Web-portal/textarea_keep it up'), 
    'keep it up')

WebUI.delay(5)

WebUI.closeBrowser()

