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
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')
//
//WebUI.delay(5)
//WebUI.click(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/button_Sign In'))
//
//WebUI.delay(5)
//WebUI.click(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/svg_littlefish_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/div_Profile'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/svg_littlefish_MuiBox-root css-w4pijj'))
//
//WebUI.delay(5)
//
//WebUI.scrollToElement(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/h5_Contact'), 
//    0)
//
//WebUI.delay(5)
//
//WebUI.scrollToElement(findTestObject('UserProfile/UserPage/Page_littlefish - Web-portal/img_littlefish_MuiCardMedia-root MuiCardMed_ad1681'), 
//    0)
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/svg_littlefish_iconify iconify--mdi'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/div_Profile'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/svg_littlefish_MuiBox-root css-w4pijj'))
//
//WebUI.delay(5)
//
//WebUI.scrollToElement(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/h5_Contact'), 0)
//
//WebUI.delay(5)
//
//WebUI.scrollToElement(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/img_littlefish_MuiCardMedia-root MuiCardMed_ad1681'), 
//    0)
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://portal.littlefish.mobi/')
//
//WebUI.delay(5)
//
//WebUI.setText(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/input_Email_r0'), 'crossi@littlefishapp.com')
//
//WebUI.delay(5)
//
//WebUI.setEncryptedText(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
//    'yPDJi4/cIbnepc0wXCuJUg==')
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/p_Cesare Rossie Administrator'))

WebUI.delay(5)

WebUI.click(findTestObject('manual/Page_littlefish - Web-portal/svg_Profile_iconify iconify--mdiT'))

WebUI.delay(5)

////
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/path'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/div_Profile'))
//
//WebUI.delay(5)
//
WebUI.click(findTestObject('Object Repository/UserProfile/Profile/Page_littlefish - Web-portal/svg_Administrator_iconify iconify--mdi'))

WebUI.delay(5)

WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/h5_About'))

WebUI.delay(3)

WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/h5_Contact'))

WebUI.delay(3)

WebUI.click(findTestObject('UserProfile/Profile/Page_littlefish - Web-portal/p_International Number'))

WebUI.delay(3)

//WebUI.closeBrowser()

