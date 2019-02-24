package com.dice.step_definations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.log4testng.Logger;

import com.dice.pages.LoginPage;
import com.dice.utilities.ConfigurationReader;
import com.dice.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dice_LoginTest {
	// WebDriver driver;
	static LoginPage loginPage = new LoginPage();
	String title = "Find Jobs in Tech | Dice.com";
	
	//performans test
	long startTime;
	long endTime;
	long duration;
	double seconds;
	static Logger log=Logger.getLogger(Dice_LoginTest.class);
	
	

	@Given("^I am on the Dice home page$")
	public void i_am_on_the_Dice_home_page() throws Throwable {
		//performans test
		startTime=System.currentTimeMillis();
		
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		Driver.getInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

		Assert.assertEquals(title, Driver.getInstance().getTitle());

	}

	@When("^I fill my credantial$")
	public void i_fill_my_credantial() throws Throwable {

		loginPage.searchJob.sendKeys(ConfigurationReader.getProperty("job"));
		Thread.sleep(2000);
		loginPage.searchCity.clear();

		loginPage.searchCity.sendKeys(ConfigurationReader.getProperty("city"));
		loginPage.submit.click();

	}

	@When("^I click sing button$")
	public void i_click_sing_button() throws Throwable {

		Thread.sleep(2000);
		loginPage.sortDate.click();
	}

	@Then("^I able to see my account$")
	public void i_able_to_see_my_account() throws Throwable {

		loginPage.login.click();
		loginPage.email.sendKeys(ConfigurationReader.getProperty("email"));
		loginPage.psw.sendKeys(ConfigurationReader.getProperty("password"));
		Thread.sleep(2000);
		loginPage.signBtn.click();

		/*
		Thread.sleep(2000);
		loginPage.searchYes.click();

		Thread.sleep(3000);
		loginPage.noSearchable.click();
		// WebElement
		// noSearch=driver.findElement(By.xpath("//input[@value='2-Too many
		// phone calls from recruiters.']"));
		// noSearch.isSelected();

		Thread.sleep(2000);
		loginPage.radioNOsearch.click();

		loginPage.NotSearhOk.click();

		System.out.println("I am on the my account? " + loginPage.img.isDisplayed());
		
		//performans test
		endTime=System.currentTimeMillis();
		duration=endTime-startTime;
		System.out.println("duration is : "+duration +" milliseconds");
		 */
	}

}
