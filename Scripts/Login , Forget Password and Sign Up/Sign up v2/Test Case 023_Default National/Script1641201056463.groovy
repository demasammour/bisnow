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

WebUI.navigateToUrl('https://web.beta.bisnow.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Sign Up/Sign Up'))

String dynamicemail = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Sign Up/Email'), dynamicemail + '@cnn.com')

WebUI.click(findTestObject('Sign Up/CONTINUE button'))

WebUI.setText(findTestObject('Sign Up/First Name'), 'Test')

WebUI.setText(findTestObject('Sign Up/Last Name'), 'Test')

WebUI.setEncryptedText(findTestObject('Sign Up/Password'), 'C/Qzn8ORT1OwpiImlpOEPQ==')

WebUI.setText(findTestObject('Sign Up/Phone Number'), '22222222222')

WebUI.setText(findTestObject('Sign Up/Postal Code'), '12345')

WebUI.click(findTestObject('Sign Up/Type to search for your company'))

WebUI.setText(findTestObject('Sign Up/Company field'), 'Test')

WebUI.click(findTestObject('Sign Up/Type to search for your company'))

WebUI.selectOptionByValue(findTestObject('Sign Up/Select Title'), 'General Manager', true)

WebUI.selectOptionByValue(findTestObject('Sign Up/Select Industry'), 'Technology / IT', true)

WebUI.sendKeys(findTestObject('Sign Up/Asset Classes'), 'Office')

WebUI.sendKeys(findTestObject('Sign Up/Asset Classes'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Sign Up v2/Checkbox Subscribe'), 'Subscribe to National Newsletters')

WebUI.click(findTestObject('Sign Up v2/Bisnow terms'))

WebUI.click(findTestObject('Sign Up/REGISTER'))

WebUI.mouseOver(findTestObject('Invoices/My Account-main menu'))

WebUI.click(findTestObject('Subscribtion/Subscribition submenu'))

def okay=false;

def list1 = WebUI.findWebElements(findTestObject('Object Repository/Subscribtion/NATIONAL Group/NATIONAL Group'),30)
def l = list1.size()
for (int i = 0; i < l; i++)
{
	list1[i].hasProperty('checked')
	System.out.print(list1[i].hasProperty('checked'))
		okay=true;
		break;
	}

