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

WebUI.mouseOver(findTestObject('HIGO_Website/Layanan HIGO/WIFI/span_Layanan HIGO'))

WebUI.click(findTestObject('HIGO_Website/Layanan HIGO/WIFI/span_WiFi Advertising'))

WebUI.mouseOverOffset(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h1_WiFi Advertising'), 0, 0)

WebUI.verifyElementVisible(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h1_WiFi Advertising'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h2_Footprint HIGO'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h2_Kenali pengguna melalui 4 langkah pendekatan yang lebih personal'), 
    0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h6_Pembuatan profil'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h6_Penayangan'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h6_Interaksi'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h6_Respons langsung'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h2_Maksimalkan campaign dengan CTR  completed view'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h2_Keuntungan menggunakan WiFi ads'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h2_Mitra kami'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h6_Capai hasil campaign lebih efektif dengan targeted audience dari HIGO'), 
    0)

WebUI.click(findTestObject('HIGO_Website/Layanan HIGO/WIFI/a_Beriklan sekarang'))

WebUI.verifyElementVisible(findTestObject('HIGO_Website/Layanan HIGO/WIFI/h1_Hubungi tim HIGO'))

WebUI.delay(3)

WebUI.closeBrowser()

