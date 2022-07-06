package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class CalculatorOperation extends Base{

	public void add() {
		WebElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
		WebElement six = driver.findElement(By.id("com.oneplus.calculator:id/digit_6"));
		
		WebElement addBtn = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		WebElement equalsBtn = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		WebElement result = driver.findElement(By.id("com.oneplus.calculator:id/result"));

		
		two.click();
		addBtn.click();
		six.click();
		equalsBtn.click();
		System.out.println(result.getText());
	}
	
	
	@SuppressWarnings({ "deprecation", "static-access", "rawtypes" })
	public void touchDemo() {
//		WebElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
		WebElement economistIcon = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Economist, has 1 notification\"]"));
		TouchAction act = new TouchAction((PerformsTouchActions) driver);
		act.tap(new TapOptions().withElement(new ElementOption().element(economistIcon))).perform();
	}
	
	@SuppressWarnings({ "deprecation", "static-access", "rawtypes" })
	public void multiTouchDemo() {
		WebElement googleSearch = driver.findElement(By.id("com.google.android.googlequicksearchbox:id/hint_text_alignment"));
		
		TouchAction act1 = new TouchAction((PerformsTouchActions) driver);
		act1.tap(new TapOptions().withElement(new ElementOption().element(googleSearch)));
			

		TouchAction act2 = new TouchAction((PerformsTouchActions) driver);		;		
		act2.tap(new TapOptions().withElement(new ElementOption().element(driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc='Search videos.']/android.widget.LinearLayout")))));
		
		
		MultiTouchAction mta = new MultiTouchAction(driver);
		mta.add(act1);
		mta.add(act2);
		mta.perform();
	
	}
	
	public static void main(String[] args) {
		CalculatorOperation obj = new CalculatorOperation();
		obj.setupAndroid();
//		obj.setupAndroidEmulator();
//		obj.add();
//		obj.touchDemo();
		obj.multiTouchDemo();
	}

}
