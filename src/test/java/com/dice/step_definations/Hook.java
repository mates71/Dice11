package com.dice.step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.dice.pages.LoginPage;
import com.dice.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	LoginPage loginPage;

	@Before
	public void setUp() throws InterruptedException {
		Driver.getInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown(Scenario scenario) throws InterruptedException {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
/*
		} else if (loginPage.reklam.isDisplayed()) {
			Thread.sleep(2000);
			loginPage.reklam.click();
		} else {
			System.out.println("pop up Reklam is not visiable !");*/
		}

		Driver.closeDriver();
	}

}
