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

Mobile.startExistingApplication('com.semaai.toko.staging')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Masukkan nomor HP-mu Yuk'), 0)

WebUI.delay(5)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 081234567890'), '08744889896', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - SMS'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.EditText0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), '1', 5)

//WebUI.delay(5)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), '1', 5)

//WebUI.delay(5)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText (2)'), '1', 5)

//WebUI.delay(5)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), '1', 5)

//WebUI.delay(5)
Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.ImageView_select product'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.Button - addToCart'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.ImageView_cartButton'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lakukan Pembayaran'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - Metode Pengiriman'), 'Metode Pengiriman')

Mobile.scrollToText('Metode Pengiriman')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Metode Pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi'), 0)

Mobile.closeApplication()

