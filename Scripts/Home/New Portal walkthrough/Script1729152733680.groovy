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

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/input_Email_r0'), 
    'crossi@littlefishapp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/input_Password_auth-login-v2-password'), 
    'yPDJi4/cIbnepc0wXCuJUg==')

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/path'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_Selling'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_Orders'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Received'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Processing'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_All'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Complete'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Cancelled'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_Products'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_Jujutsu Kaisen'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/p_Channels'))

WebUI.scrollToElement(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/p_Product Options (2 of 3 Added)'), 0)

//WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/p_Product Options (2 of 3 Added)'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/div_Categories'))

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Add Category'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/input_Category Name_categoryName'), 
    'Testing Portal')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_J'), 
    'J')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Ju'), 
    'Ju')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Jus'), 
    'Jus')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just'), 
    'Just')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just_1'), 
    'Just ')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a'), 
    'Just a')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a_1'), 
    'Just a ')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a t'), 
    'Just a t')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a te'), 
    'Just a te')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a tes'), 
    'Just a tes')

WebUI.setText(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/textarea_Just a test'), 
    'Just a test')

WebUI.click(findTestObject('Object Repository/Home/Page_littlefish - Web-portal/New Folder/Page_littlefish - Web-portal/button_Save'))

WebUI.closeBrowser()

