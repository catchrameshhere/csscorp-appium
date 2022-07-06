package test;

import java.net.MalformedURLException;
import java.net.URL;
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
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TouchExamples{
//	WebDriver driver;
//	AndroidDriver driver;
	AndroidDriver driver;
//	AppiumDriver driver;
	String hubUrl = "http://127.0.0.1:4723/wd/hub"; 
	
	public void scrollUpdDemo() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("deviceName", "ce7b260f");


		try {
			driver = new AndroidDriver(new URL(hubUrl),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}


		/*
		 * move to the desired location
		 * press
		 * move to next location
		 */
		PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
		Origin WholeScreenArea = Origin.viewport();
		Sequence seq = new Sequence(finger, 0);

		//Move up ==> remove maps/calculator from the base  
		seq.addAction(finger.createPointerMove(Duration.ofMillis(1), WholeScreenArea, 538, 1900));
		seq.addAction(finger.createPointerDown(1));	
		seq.addAction(finger.createPointerMove(Duration.ofMillis(1), WholeScreenArea, 500, 1000));
		seq.addAction(finger.createPointerUp(0));		

		driver.perform(Arrays.asList(seq));

		System.out.println("done");

	}
	
	public void googleMapsDemo() {

		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("deviceName", "ce7b260f");
		
		//google maps
		cap.setCapability("appPackage", "com.google.android.apps.maps");
//		cap.setCapability("appActivity", "com.google.android.apps.maps.Maps");
				

		try {
			driver = new AndroidDriver(new URL(hubUrl),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}


//		/*
//		 * move to the desired location
//		 * press
//		 * move to next location
//		 */
//		PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
//		Origin WholeScreenArea = Origin.viewport();
//		Sequence seq = new Sequence(finger, 0);
//
//		//Move up ==> remove maps/calculator from the base  
//		seq.addAction(finger.createPointerMove(Duration.ofMillis(1), WholeScreenArea, 538, 1900));
//		seq.addAction(finger.createPointerDown(1));	
//		seq.addAction(finger.createPointerMove(Duration.ofMillis(1), WholeScreenArea, 500, 1000));
//		seq.addAction(finger.createPointerUp(0));		
//
//		driver.perform(Arrays.asList(seq));

		System.out.println("done");

	}


	public static void main(String[] args) {
		TouchExamples obj = new TouchExamples();
//		obj.scrollUpdDemo();
		
		obj.googleMapsDemo();
		
		

	}

}
