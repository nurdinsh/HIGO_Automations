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

WebUI.navigateToUrl('https://blog.higo.id/')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('HIGO_Blogs/bt_Tech Social Media'), 0)

WebUI.click(findTestObject('HIGO_Blogs/bt_Tech Social Media'))

WebUI.verifyElementVisible(findTestObject('HIGO_Blogs/div_Tech  Social Media'))

// Loop untuk klik "Tampilkan lebih banyak"
for (int i = 0; i < 10; i++) {
    // Sesuaikan jumlah pengulangan sesuai kebutuhan
    try {
        // Scroll ke tombol "Tampilkan lebih banyak"
        WebUI.scrollToElement(findTestObject('HIGO_Blogs/bt_Tampilkan lebih banyak'), 0)

        // Klik tombol
        WebUI.click(findTestObject('HIGO_Blogs/bt_Tampilkan lebih banyak'))

        WebUI.delay(2 // Tunggu agar konten baru termuat
            )

        // Log
        println('Berhasil klik \'Tampilkan lebih banyak\' pada iterasi: ' + (i + 1))
    }
    catch (Exception e) {
        println('Tidak ada tombol \'Tampilkan lebih banyak\' atau sudah tidak bisa diklik.')

        break
    } 
}

// Tutup browser
WebUI.closeBrowser()

