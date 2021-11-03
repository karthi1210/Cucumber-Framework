package org.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.pages.FBLogin;

import cucumber.api.java.en.*;

public class FacebookLoginStepDefinition extends BaseClass{
	
	@Given("launch the chromer browser")
	public void launch_the_chromer_browser() {
	    launchBrowser();
	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
	    loadUrl("https://en-gb.facebook.com/");
	}

	@When("The User should maximize")
	public void the_User_should_maximize() {
	    winMax();
	}

	@When("The user should type Invalid username and Invalid password")
	public void the_user_should_type_Invalid_username_and_Invalid_password() {
	    FBLogin fb = new FBLogin();
	    fill(fb.getTxtUser(), "Karthik");
	    fill(fb.getTxtPass(), "kar@123");
	}

	@When("The user should click login button")
	public void the_user_should_click_login_button() {
	    FBLogin fb = new FBLogin();
	    btnClick(fb.getBtn());
	}

	@Then("The user should navigate to Invalid credential page")
	public void the_user_should_navigate_to_Invalid_credential_page() throws InterruptedException {
		Thread.sleep(3000);
		String title = returnTitle();
	    Assert.assertTrue("Verify the page", title.startsWith("Log"));
	}
	
	@When("The user should type Invalid username {string}and Invalid password {string}")
	public void the_user_should_type_Invalid_username_and_Invalid_password(String string, String string2) {
	    FBLogin fb = new FBLogin();
	    fill(fb.getTxtUser(), string);
	    fill(fb.getTxtPass(), string2);
	}
	    
	    


}
