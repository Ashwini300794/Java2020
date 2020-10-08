package com.fb.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	public WebDriver driver;
	@When("^user opens \"(.*)\" browser$")
	public void openBrowser(String browsernm)
	{
	
	if(browsernm.equalsIgnoreCase("chrome"))
	{
		System.out.println("chrome browser");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium cjc jar files\\New_CromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("browser opened successfully");
	}
	}
	@And("^user enters application url \"(.*)\"$")
	public void openUrl(String url)
	{
		driver.get(url);
		System.out.println("url opened successfully");
	}
	@And("^user waits \"(.*)\" seconds to load login page$")
	public void pageLoad(int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	@And("^user maximize chrome browser$")
	public void maximise()
	{
		driver.manage().window().maximize();
		System.out.println("browser is maximised");
	}
	@Then("^user is on login screen of Mercury Tours application$")
	public void title()
	{
		String title=driver.getTitle();
		System.out.println("MT get title is:"+title);
	}
	@Given("^user access login screen of Mercury Tours application$")
	public void image()
	{
		boolean flag=driver.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).isDisplayed();
		System.out.println("image is displayed:"+flag);
		boolean expflag=true;
		Assert.assertEquals(flag, expflag);
		System.out.println("image is displayed on website");
	}
	@When("^user enters \"(.*)\" as username$")
	public void uname(String username)
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		System.out.println("username entered successfully");
	}
	@And("^user enters \"(.*)\" password$")
	public void pass(String password)
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println("user entered password successfully");
	}
	@And("^user clicks on Signin button$")
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='login']")).click();
		System.out.println("user login successfully");
	}
	@When("^user clicks on SignOff link$")
	public void logout()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("user logout successfully");
	}
	@Then("^user is on Signon screen$")
	public void back()
	{
		System.out.println("user is back on signin page");
	}
	ghjgj;
	
	

}

