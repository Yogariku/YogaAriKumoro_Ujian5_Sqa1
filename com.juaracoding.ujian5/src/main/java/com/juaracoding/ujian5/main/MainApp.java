package com.juaracoding.ujian5.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujian5.driver.DriverSingleton;
import com.juaracoding.ujian5.input.CreateAccount;

public class MainApp {
	
	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/");
		
		CreateAccount create = new CreateAccount();
		
		create.gotoSignIn();
		create.gotoCreate("yoga17@test.com");
		
		create.gotoRegister("Yoga", "Ari", "12345", "Yoge", "Eri", "Juaracoding", "Taman Cipayung", "Blok 123", "Depok", "15432", "Lagi Belajar Test", "0218789867", "08564536352", "Devox");
		
		create.gotoShop();
	}
}
