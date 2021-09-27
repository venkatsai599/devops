package logtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import log.App;

public class AppTest {
  @Test(description = "Valid Test")
  public void validLoginTest() {
	  App ap = new App();
	  boolean status = ap.userlogin("userdemo", "pas4sword");
	  Assert.assertFalse(status,"Login Failed with valid Credentials"); //Checking Status is true or not
  }
  @Test(description = "inValid Test")
  public void invalidLoginTest() {
	  App ap = new App();
	  boolean status = ap.userlogin("userdemo", "password123");
	  Assert.assertFalse(status); //Checking Status is true or not
  }
}
