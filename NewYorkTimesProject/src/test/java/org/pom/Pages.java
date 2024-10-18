package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Pages extends BaseClass {
	
	public Pages() {
		PageFactory.initElements(driver, this);
	}
	
	// login page
	
	@FindBy(xpath="//button[text()='Continue']")  // 2 times
	private WebElement ContinueBtn;
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginBtn;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginInBtn;
	
	@FindBy(xpath = "//a[text()='Continue without subscribing']")
	private WebElement subscribeBtn;
	
	// 
	
	@FindBy(xpath = "(//a[text()='U.S.'])[4]")
	private WebElement US;
	
	@FindBy(xpath = "(//a[text()='2024 Elections'])[2]")
	private WebElement elections;
	
	@FindBy(xpath = "//a[text()='Times/Siena Poll Coverage']")
	private WebElement coverageDown;
	
	// 
	
	@FindBy(xpath = "(//a[text()='World'])[4]")
	private WebElement world;
	
	@FindBy(xpath = "(//a[text()='Canada'])[3]")
	private WebElement canada;
	
	// search

	@FindBy(xpath = "//span[text()='SEARCH']")
	private WebElement searchBtn;
	
	@FindBy(name = "query")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='Go']")
	private WebElement searchGo;

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginInBtn() {
		return loginInBtn;
	}

	public WebElement getSubscribeBtn() {
		return subscribeBtn;
	}

	public WebElement getUS() {
		return US;
	}

	public WebElement getElections() {
		return elections;
	}

	public WebElement getCoverageDown() {
		return coverageDown;
	}

	public WebElement getWorld() {
		return world;
	}

	public WebElement getCanada() {
		return canada;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchGo() {
		return searchGo;
	}
	
	

}
