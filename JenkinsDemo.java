package com.PD.Jenkins;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 

public class JenkinsDemo

{

 

	@Test

	public void testgooglrsearch()
	{

 
		System.setProperty("webdriver.chrome.driver", "e:\\Pranoday\\Testing\\SeleniumDependencies\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//it will open the goggle page

		driver.get("http://google.in");

//we expect the title �Google � should be present

		String Expectedtitle = "Google";

//it will fetch the actual title

		String Actualtitle = driver.getTitle();

		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

//it will compare actual title and expected title

		Assert.assertEquals(Actualtitle, Expectedtitle);

//print out the result

		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");

 }

}
