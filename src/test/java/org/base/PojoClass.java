package org.base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends HelperClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn-close']")
	
	private WebElement alert;
	
	

	public WebElement getAlert() {
		return alert;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	@FindAll({
		@FindBy(xpath="(//input[@type='text'])[1]"),
		@FindBy(xpath="//input[@id='small-searchterms']")
	})
	private WebElement searchbox;

	
	@FindAll({
		
		@FindBy(xpath="//input[@type='submit']"),
		@FindBy(xpath="//input[@class='button-1 search-box-button']")
		
	})
	private WebElement searchbtn;

	
		@FindBy(xpath="//div[@class='header-links-wrapper']")
	
		private WebElement account;
		
		@FindAll({
			@FindBy(xpath="//a[@href='/register']"),
			@FindBy(xpath="//a[text()='Register']")
		})
		private WebElement register;
	
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line'])[1]"),
			@FindBy(xpath="//input[@name='FirstName']")
		})
		private WebElement firstName;
		
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line'])[2]"),
			@FindBy(xpath="//input[@name='Email']")
		})
		private WebElement email;
		
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line'])[3]"),
			@FindBy(xpath="//input[@name='Phone']")
		})
		private WebElement phno;
		
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line password'])[1]"),
			@FindBy(xpath="//input[@name='Password']")
		})
		private WebElement password;
		
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line password'])[2]"),
			@FindBy(xpath="//input[@name='ConfirmPassword']")
		})
		private WebElement confirmPassword;
		
		@FindAll({
			@FindBy(xpath="(//input[@class='text-box single-line valid'])"),
			@FindBy(xpath="//input[@name='StreetAddress']")
		})
		private WebElement address;
		
		@FindAll({
			@FindBy(xpath="(//select[@data-val='true'])[1]"),
			@FindBy(xpath="(//select[@name='CountryId'])[1]")
		})
		private WebElement country;
		
		@FindAll({
			@FindBy(xpath="//input[@id='accept-privacy-policy']"),
			@FindBy(xpath="//input[@type='checkbox']")
		})
		private WebElement radiobtn;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
