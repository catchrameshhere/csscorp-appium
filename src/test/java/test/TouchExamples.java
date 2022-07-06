package test;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.InputSource;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TouchExamples extends Base{
	
	public void TouchDemo() {
//		PerformsTouchActions action = new TouchActions(driver);
//		action.singleTap(element);
//		action.perform();

//		WebElement economicsIcon = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Economist, has 2 notifications']"));
//		
//		PointerInput pi = new PointerInput(Kind.TOUCH, "finger");
//		pi.createPointerMove(Duration.ofSeconds(0), Origin.fromElement(economicsIcon), 20, 1000);
//		
//		Sequence seq = new Sequence(pi, 0);
//		seq.addAction(pi.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.fromElement(economicsIcon), 600, 1433));
//		seq.addAction(pi.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.fromElement(economicsIcon), 600, 1000));
//		driver.perform(Collections.singletonList(seq));
		
		
		
//		Sequence seq = new Sequence(InputSource, 0);
		
//		Actions act = new Actions(driver);
//		act.scrollFromOrigin(ScrollOrigin.fromViewport(), 1000, 0).perform();
		
		
//		PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
//		Sequence circle = new Sequence(finger, 0);
//        circle.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 1000, 1000));
		
		
//		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		
//		AndroidBatteryInfo batteryInfo = driver.getBatteryInfo();
//		
//		System.out.println(batteryInfo.getLevel());
//		System.out.println(batteryInfo.getState());
		
//		System.out.println(driver.getStatus());
//		System.out.println("altitude - " + driver.getLocationContext().location().getAltitude());
//		System.out.println("latitude - " + driver.getLocationContext().location().getLatitude());
//		System.out.println("logitude - " + driver.getLocationContext().location().getLongitude());
		
		
//		System.out.println(driver.getSettings());
		
//		System.out.println(driver.getDeviceTime());
		
//		driver.longPressKey(new KeyEvent(AndroidKey.HOME));
		


		
	}
	

	public static void main(String[] args) {
		TouchExamples obj = new TouchExamples();
		obj.setupAndroid();
		obj.TouchDemo();

	}

}
