package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.M

public class Base {
	
//	WebDriver driver;
//	AndroidDriver driver;
	AndroidDriver driver;
//	AppiumDriver driver;
	String hubUrl = "http://127.0.0.1:4723/wd/hub"; 
	
	
	
	public void setupAndroid() {
		DesiredCapabilities cap = new DesiredCapabilities();

		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("deviceName", "ce7b260f");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		try {
			driver = new AndroidDriver(new URL(hubUrl),cap);
//			driver = new AppiumDriver(new URL(hubUrl),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setupAndroidEmulator() {
		DesiredCapabilities cap = new DesiredCapabilities();

		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("deviceName", "ce7b260f");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.google.android.calculator.Calculator");
		
		try {
			driver = new AndroidDriver(new URL(hubUrl),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

	

}
