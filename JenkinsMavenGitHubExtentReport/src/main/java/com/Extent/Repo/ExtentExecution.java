package com.Extent.Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentExecution {
WebDriver driver;
ExtentReports extent=new ExtentReports();
ExtentSparkReporter spark=new ExtentSparkReporter("MyExtentReport.html");
@BeforeClass
public void open()
{
	extent.attachReporter(spark);
	Reporter.log("Open",true);
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
@BeforeMethod
public void login()
{
	Reporter.log("Login",true);
	driver.get("https://www.facebook.com/");
}
@AfterMethod
public void logout()
{
	Reporter.log("Logout",true);
}
@AfterClass
public void close()
{
	Reporter.log("Close",true);
	extent.flush();
}
}
