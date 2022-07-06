package test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.InputSource;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.PointerInput.PointerEventProperties;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MobileInfo extends Base{
	
	public void Demo() {
		
		AndroidBatteryInfo batteryInfo = driver.getBatteryInfo();
		
		System.out.println(batteryInfo.getLevel());
		System.out.println(batteryInfo.getState());
		
		System.out.println(driver.getStatus());
		System.out.println("altitude - " + driver.getLocationContext().location().getAltitude());
		System.out.println("latitude - " + driver.getLocationContext().location().getLatitude());
		System.out.println("logitude - " + driver.getLocationContext().location().getLongitude());
		
		
		System.out.println(driver.getSettings());
		
		System.out.println(driver.getDeviceTime());
		
		driver.longPressKey(new KeyEvent(AndroidKey.HOME));
		
	}
	

	public static void main(String[] args) {
		MobileInfo obj = new MobileInfo();
		obj.setupAndroid();
		obj.Demo();

	}

}
