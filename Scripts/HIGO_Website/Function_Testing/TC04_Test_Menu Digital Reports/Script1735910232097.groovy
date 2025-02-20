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

WebUI.navigateToUrl('https://higo.id/')

WebUI.click(findTestObject('Object Repository/HIGO_Website/svg_Popup'))

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/HIGO_Website/svg_Tentang HIGO_text-white'))

WebUI.click(findTestObject('Object Repository/HIGO_Website/span_Digital Reports'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HIGO_Website/h1_HIGO DIGITAL  MANUAL 2024'))

WebUI.click(findTestObject('Object Repository/HIGO_Website/button_Download Full Report'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HIGO_Website/h2_HIGO DIGITAL MANUAL 2024'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_firstName'), 'Dian')

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_lastName'), 'Syah')

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_email'), 'catbalck19@gmail.com')

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_phone'), '082240955579')

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_company'), 'PT SYS')

WebUI.setText(findTestObject('Object Repository/HIGO_Website/input_jobTitle'), 'QA')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIGO_Website/button_Download'))

WebUI.delay(2)

WebUI.closeBrowser()

