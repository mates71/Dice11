package com.dice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dice.utilities.Driver;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(){
	PageFactory.initElements(Driver.getInstance(), this);
		
	}
	@FindBy(xpath="//img[@style='vertical-align: middle; margin-left: 10px;']")
	public WebElement bannerClose;
	
	
	@FindBy(xpath="(//a[@href='/dashboard/login'])[2]")
	public WebElement login;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement signBtn;
	//-------------------------------------------
	@FindBy(id="search-field-keyword")
	public WebElement searchJob;
	
	
	@FindBy(id="search-field-location")
	public WebElement searchCity;
	
	@FindBy(id="findTechJobs") //chg
	public WebElement submit;

	@FindBy(id="sort-by-date-link") //sort-by-date-link
	public WebElement sortDate;
	
	
	
	@FindBy(id="icon-calendar-2")
	public WebElement showMinute;
	
	@FindBy(css="btn-lg-valign")
	public WebElement forgetPsw;
	
	
	
	@FindBy(xpath="//img[@class='img-circle']")
	public WebElement img;
	
	
	@FindBy(xpath="//button[@id='searchablebtndashboard']")             
	public WebElement searchYes;
	
	@FindBy(xpath="//div[@class='toggle-switch-label-off ng-binding']")
	public WebElement noSearchable;
	
	
	@FindBy(xpath="//input[@value='2-Too many phone calls from recruiters.']")
	public WebElement radioNOsearch;
	
	
	
	@FindBy(xpath="//span[.=', Not Searchable']")
	public WebElement NotSearhOk;
	
	@FindBy(xpath="//img[@src='https://tpc.googlesyndication.com/pagead/imgad?id=CICAgKDL17qnkAEQARgBMgiVEat85AqiHA']")
	public WebElement amazonReklam;
	
	
	@FindBy(id="close_DFP_btn")
	public WebElement reklam;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
