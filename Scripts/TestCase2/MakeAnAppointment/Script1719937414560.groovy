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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Home_Page/h1_CURA Healthcare Service'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/h1_CURA Healthcare Service'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Home_Page/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Home_Page/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Home_Page/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Home_Page/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.verifyElementClickable(findTestObject('Object Repository/Home_Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Home_Page/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Home_Page/h2_Make Appointment'), 'Make Appointment')

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/select_Tokyo CURA Healthcare Center        _5b4107'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Home_Page/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Home_Page/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Home_Page/input_Apply for hospital readmission_hospit_63901f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home_Page/div_Healthcare Program                     _4552b2'))

WebUI.click(findTestObject('Object Repository/Home_Page/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Home_Page/td_3'))

WebUI.click(findTestObject('Object Repository/Home_Page/input_Visit Date (Required)_visit_date'))

WebUI.rightClick(findTestObject('Object Repository/Home_Page/input_Visit Date (Required)_visit_date'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/div_Visit Date (Required)'), 0)

WebUI.setText(findTestObject('Object Repository/Home_Page/textarea_Comment_comment'), 'Yearly examination')

WebUI.verifyElementClickable(findTestObject('Object Repository/Home_Page/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Home_Page/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Home_Page/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.verifyElementClickable(findTestObject('Object Repository/Home_Page/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Home_Page/a_Go to Homepage'))

WebUI.closeBrowser()

