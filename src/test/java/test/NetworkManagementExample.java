package test;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.devtools.v101.emulation.model.DisplayFeature.Orientation;

public class NetworkManagementExample extends Base{

	public void netMgtDemo() {

		//		driver.toggleLocationServices();
		
//		driver.toggleData();
//		driver.toggleWifi();
		
//		System.out.println("is airplane mode eanbled - " + driver.getConnection().isAirplaneModeEnabled());
//		System.out.println("is data eanbled - " + driver.getConnection().isDataEnabled());
//		System.out.println("is wifi eanbled - " + driver.getConnection().isWiFiEnabled());

	}
	
	public void notificationDemo() {
		driver.openNotifications();
	}
	
	public void lockUnlockDevice() {
//		driver.lockDevice();
//		driver.unlockDevice();
		System.out.println("is the device locked - " + driver.isDeviceLocked() );
	}
	
	public void orientationExample() {
		ScreenOrientation orientation = driver.getOrientation();
		
//		System.out.println("current orientation = " + orientation);
//		System.out.println("current orientation = " + orientation.name());
//		System.out.println("current orientation = " + orientation.ordinal());
		System.out.println("current orientation = " + orientation.describeConstable());
	}
	
	public void perfData() {
		System.out.println(driver.getSupportedPerformanceDataTypes());
	}
	
	public void getContextExample() {
		System.out.println(driver.getContext());
		System.out.println(driver.getContextHandles());
	}

	public static void main(String[] args) {
		NetworkManagementExample obj = new NetworkManagementExample();
		obj.setupAndroid();
//		obj.netMgtDemo();
//		obj.notificationDemo();
//		obj.lockUnlockDevice();
//		obj.orientationExample();
//		obj.perfData();
		obj.getContextExample();


	}

}
