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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager

KeywordLogger log = new KeywordLogger()

Mobile.startExistingApplication('com.semaai.toko.staging')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

Mobile.tap(findTestObject('android.widget.ImageView_select product'), 0)

Mobile.takeScreenshot()

WebUI.delay(1)

Mobile.tap(findTestObject('android.widget.Button - addToCart'), 0)

Mobile.takeScreenshot()

WebUI.delay(1)

Mobile.tap(findTestObject('android.widget.ImageView_cartButton'), 0)

Mobile.takeScreenshot()

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox'), 0)

Mobile.takeScreenshot()

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lakukan Pembayaran'), 0)

Mobile.takeScreenshot()

//adding checkout flow here

Mobile.tap(findTestObject('android.widget.Button - Asyik, OK'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

Mobile.tap(findTestObject('android.widget.ImageView - Cross button_checkout'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (1)'), 0)

Mobile.scrollToText('Total Pembayaran')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Buat Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Detail Pesanan'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()


