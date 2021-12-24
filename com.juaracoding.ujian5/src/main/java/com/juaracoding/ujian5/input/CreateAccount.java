package com.juaracoding.ujian5.input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujian5.driver.DriverSingleton;

public class CreateAccount {
	
	private WebDriver driver;
	
	public CreateAccount() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement goSignInButton;
	
	@FindBy(id = "email_create")
	WebElement txtEmail;
	
	@FindBy(name = "SubmitCreate")
	WebElement btnCreate;
	
	//**********************************************************************************************
	//register form
	
	@FindBy(css = "#account-creation_form > div:nth-child(1) > div.clearfix > div:nth-child(3)")
	WebElement btnGender;
	
	@FindBy(id = "customer_firstname")
	WebElement txtFirstName1;
	
	@FindBy(id = "customer_lastname")
	WebElement txtLastName1;
	
	@FindBy(id = "passwd")
	WebElement txtPassword;
	
	@FindBy(css = "#days > option:nth-child(14)")
	WebElement listDays;
	
	@FindBy(css = "#months > option:nth-child(6)")
	WebElement listMonths;
	
	@FindBy(css = "#years > option:nth-child(29)")
	WebElement listYears;
	
	@FindBy(id = "newsletter")
	WebElement ckboxNewsletter;
	
	@FindBy(id = "optin")
	WebElement ckboxOptin;
	
	@FindBy(id = "firstname")
	WebElement txtFirstName2;
	
	@FindBy(id = "lastname")
	WebElement txtLastName2;
	
	@FindBy(id = "company")
	WebElement txtCompany;
	
	@FindBy(id = "address1")
	WebElement txtAddress1;
	
	@FindBy(id = "address2")
	WebElement txtAddress2;
	
	@FindBy(id = "city")
	WebElement txtCity;
	
	@FindBy(css = "#id_state > option:nth-child(19)")
	WebElement listState;
	
	@FindBy(id = "postcode")
	WebElement txtPostcode;
	
	@FindBy(id = "other")
	WebElement txtOther;
	
	@FindBy(css = "#id_country > option:nth-child(2)")
	WebElement listCountry;
	
	@FindBy(id = "phone")
	WebElement txtPhone1;
	
	@FindBy(id = "phone_mobile")
	WebElement txtPhone2;
	
	@FindBy(id = "alias")
	WebElement txtAlias;
	
	@FindBy(id = "submitAccount")
	WebElement btnSubmit;
	
	//**********************************************************************************************
	//add to cart
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	WebElement btnDress;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
	WebElement hvrDress;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	WebElement btnCart1;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	WebElement btnContinue;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	WebElement btnTshirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	WebElement hvrTshirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	WebElement btnCart2;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	WebElement btnCheckOut1;
	
	@FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	WebElement btnCheckOut2;
	
	@FindBy(css = "#center_column > form > p > button")
	WebElement btnCheckOut3;
	
	@FindBy(id = "cgv")
	WebElement ckboxAgree;
	
	@FindBy(css = "#form > p > button")
	WebElement btnCheckout4;
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	WebElement btnPay;
	
	@FindBy(css = "#cart_navigation > button")
	WebElement btnConfirm;
	
	
	public void gotoSignIn() {
		goSignInButton.click();
	}
	
	public void gotoCreate(String email) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(btnCreate));
		txtEmail.sendKeys(email);
		btnCreate.click();
		
	}
	
	public void gotoRegister(String firstname1, String lastname1, String password, String firstname2, String lastname2, String company, String address1, 
			String address2, String city, String postcode, String other, String phone1, String phone2, String alias) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnGender.click();
		txtFirstName1.sendKeys(firstname1);
		txtLastName1.sendKeys(lastname1);
		txtPassword.sendKeys(password);
		listDays.click();
		listMonths.click();
		listYears.click();
		ckboxNewsletter.click();
		ckboxOptin.click();
		txtFirstName2.sendKeys(firstname2);
		txtLastName2.sendKeys(lastname2);
		txtCompany.sendKeys(company);
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		listState.click();
		txtPostcode.sendKeys(postcode);
		listCountry.click();
		txtOther.sendKeys(other);
		txtPhone1.sendKeys(phone1);
		txtPhone2.sendKeys(phone2);
		txtAlias.sendKeys(alias);	
		btnSubmit.click();
	}
	
	public void gotoShop() {
		Actions action = new Actions(driver);
		btnDress.click();
		action.moveToElement(hvrDress).perform();
		btnCart1.click();
		btnContinue.click();
		btnTshirt.click();
		action.moveToElement(hvrTshirt).perform();
		btnCart2.click();
		btnCheckOut1.click();
		btnCheckOut2.click();
		btnCheckOut3.click();
		ckboxAgree.click();
		btnCheckout4.click();
		btnPay.click();
		btnConfirm.click();;
	}
	
}
