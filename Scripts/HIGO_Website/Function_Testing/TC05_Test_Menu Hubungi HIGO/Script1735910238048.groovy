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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HIGO_Website/svg_Popup'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HIGO_Website/svg_Tentang HIGO_text-white'))

WebUI.click(findTestObject('HIGO_Website/Hub/span_Hubungi HIGO'))

WebUI.verifyElementVisible(findTestObject('HIGO_Website/Hub/h6_Sampaikan kebutuhanpertanyaan untuk HIGO'))

WebUI.delay(1)

WebUI.setText(findTestObject('HIGO_Website/Hub/input_Nama Lengkap_fullName'), 'Dian')

WebUI.setText(findTestObject('HIGO_Website/Hub/input_Email_email'), 'helodian1900@gmail.com')

WebUI.setText(findTestObject('HIGO_Website/Hub/input_Nomor Telepon_phoneNumber'), '08224095578')

WebUI.setText(findTestObject('HIGO_Website/Hub/input_Nama perusahaanlokasieventbrand_companyName'), 'QA')

WebUI.selectOptionByValue(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiF_18ac72'), 'Wifi Advertising', 
    true)

//def select_radio = Layanan
//
//switch (select_radio) {
//    case select_radio = 'HIGOspot':
//        println(select_radio)
//
//        WebUI.selectOptionByValue(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiF_18ac72'), 
//            'Higospot', true)
//
//        break
//    case select_radio = 'Integrated Digital Agency':
//        println(select_radio)
//
//        WebUI.selectOptionByValue(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiF_18ac72'), 
//            'Integrated Digital Agency', true)
//
//        break
//    case select_radio = 'WiFi Advertising':
//        println(select_radio)
//
//        WebUI.selectOptionByValue(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiF_18ac72'), 
//            'WiFi Advertising', true)
//
//        WebUI.click(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiFi Advertising'))
//    default:
//        println(select_radio)
//
//        WebUI.selectOptionByValue(findTestObject('HIGO_Website/Hub/select_HIGOspotIntegrated Digital AgencyWiF_18ac72'), 
//            'Higospot', true)}
WebUI.setText(findTestObject('HIGO_Website/Hub/textarea_Pesan_message'), 'Test')

WebUI.closeBrowser()

