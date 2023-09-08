package com.Extent.Repo;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentTests extends ExtentExecution{
@Test
public void create()
{
	Reporter.log("Create",true);
	ExtentTest test=extent.createTest("This test case for launching browser ,Login and Logout").
			assignAuthor("Srinibash").assignDevice("HP").assignCategory("SmokeTesting");
	test.log(Status.PASS, "This method for login");
	test.pass("Execute Successfully");
	test.info("Password alerts");
	test.warning("alerts displaying");
}
@Test
public void modify()
{
	Reporter.log("Modify",true);
	ExtentTest test=extent.createTest("This is for logout").assignAuthor("Ricku").assignCategory("RegressionTesting").
	assignDevice("Dell");
	test.log(Status.FAIL,"This is not executed");
	test.fail("This is not taking given credentials");
	test.info("wrong password alerts");
	test.warning("Wrong password displaying");
}
}
