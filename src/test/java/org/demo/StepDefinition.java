package org.demo;

import org.base.HelperClass;
import org.base.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass {

	@Given("check priyoshop function through chrome Browser")
	public void checkPriyoshopFunctionThroughChromeBrowser() {
		launchBrowser();
		url("https://priyoshop.com/");
		max();
		impliwait(5);
	}

	@When("To close Alert box")
	public void toCloseAlertBox() {
		PojoClass p = new PojoClass();
		btnclck(p.getAlert());
	}

	@Then("To pass text")
	public void toPassText() {
		PojoClass p = new PojoClass();
		txtpass(p.getSearchbox(), "iphone");

	}

	@Then("To click search button")
	public void toClickSearchButton() {
		PojoClass p = new PojoClass();
		btnclck(p.getSearchbtn());
	}

	@Given("To Check priyoshop through chrome browser")
	public void toCheckPriyoshopThroughChromeBrowser() {
		launchBrowser();
		url("https://priyoshop.com/");
		max();
		impliwait(5);

	}

	@When("To pass Firstname and Email and Phoneno")
	public void toPassFirstnameAndEmailAndPhoneno() {
		PojoClass p = new PojoClass();
		btnclck(p.getAlert());
		WebElement btn = driver.findElement(By.xpath("//label[text()='My Account']"));
		//WebElement reg = driver.findElement(By.xpath("//a[@href='/register']"));
		Actions a=new Actions(driver);
		a.moveToElement(btn);
		btnclck(p.getRegister());
		
		txtpass(p.getFirstName(), "Karthick");
		txtpass(p.getEmail(), "raj@gmail.com");
		txtpass(p.getPhno(), "6546498491");
	}

	@When("To pass password and confirmpassword")
	public void toPassPasswordAndConfirmpassword() {
		PojoClass p = new PojoClass();
		txtpass(p.getPassword(), "651dddiu");
		txtpass(p.getConfirmPassword(), "651dddiu");
	}

	@When("To pass country and address")
	public void toPassCountryAndAddress() {
		PojoClass p = new PojoClass();
		txtpass(p.getCountry(), "India");
		txtpass(p.getAddress(), "Chennai");
	}

	@Then("To click accept radio button")
	public void toClickAcceptRadioButton() {
		PojoClass p = new PojoClass();
		btnclck(p.getRadiobtn());
	}

}
