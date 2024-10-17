package org.stepdefinition;

import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.pom.Pages;
import org.utility.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	Pages p;
	//TC_01_Login into the Page
	
	@Given("The user navigates to the Login page")
	public void the_user_navigates_to_the_login_page() {
	    browserLaunch("edge");
	    urlLaunch("https://www.nytimes.com/international/");
	    implicitWait(4000);
	    
	}
	@When("The user enter the email id and password")
	public void the_user_enter_the_email_id_and_password() throws IOException {
		 p=new Pages();
		 click(p.getContinueBtn());
		 implicitWait(4000);
		 click(p.getLoginBtn());
		 sendKeys(p.getUsername(), excelRead("Dataset", "Sheet1", 0, 0));
		 click(p.getContinueBtn());
		 sendKeys(p.getPassword(), excelRead("Dataset", "Sheet1", 1, 0));
		 
	    
	}
	@Then("The user is clicking the Login button")
	public void the_user_is_clicking_the_login_button() {
		click(p.getLoginInBtn());
		click(p.getSubscribeBtn());
	}
	@And("The user is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
		
	}
	
	
	//TC_02 The user is navigating to the 2024 Elections Page
	@When("The user enter the US")
	public void the_user_enter_the_us() {
		 click(p.getContinueBtn());
	   moveToElement(p.getUS()); 
	    
	}
	@Then("The user is clicking the Elections")
	public void the_user_is_clicking_the_elections() {
		   click(p.getElections());
		   jsScrollDown(p.getCoverageDown());
		   
	    
	}
	@Then("The article regarding the Elections should be shown")
	public void the_article_regarding_the_elections_should_be_shown() {
	    
	    
	}

	//TC_03 The user is navigating to the Canada region, inside the World news page
	
	@Given("The user navigates to the world page")
	public void the_user_navigates_to_the_world_page() {
		 click(p.getContinueBtn());
		moveToElement(p.getWorld());
	    
	}
	@Then("The user is clicking the Canada")
	public void the_user_is_clicking_the_canada() {
	    click(p.getCanada());
	    
	}
	@Then("The news article regarding the Canada should be displayed")
	public void the_news_article_regarding_the_canada_should_be_displayed() {
	    
	    
	}
	
	//TC_04 the user is Searching the Climate as context in search box
	
	@When("The user enter the Climate")
	public void the_user_enter_the_climate() {
		 click(p.getContinueBtn());
		click(p.getSearchBtn());
		sendKeys(p.getSearchBar(), "Climate");
	    
	    
	}
	@Then("The user is clicking the Search button")
	public void the_user_is_clicking_the_search_button() {
	    click(p.getSearchGo());
	    
	    
	}
	@Then("The search result should be relevant to th climate")
	public void the_search_result_should_be_relevant_to_th_climate() {
		implicitWait(6000);
	    
	    
	}


}
