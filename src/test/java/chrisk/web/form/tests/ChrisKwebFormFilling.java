package chrisk.web.form.tests;

import org.testng.annotations.Test;

import chrisk.web.form.base.BaseTest;
import chrisk.web.form.pages.EJI;
import chrisk.web.form.pages.GDA;
import chrisk.web.form.pages.PPL;
import chrisk.web.form.pages.PlayrightBe;
import chrisk.web.form.pages.SAMI;
import chrisk.web.form.pages.SENA;



public class ChrisKwebFormFilling extends BaseTest{

	
	PlayrightBe palyrightBe;
	EJI eji;
	SENA sena;
	GDA gda;
	SAMI sami;
	PPL ppl;
	

	
	@Test(priority=1)
	public void palyrightFormFilling() {
		palyrightBe=new PlayrightBe(driver);
		driver.switchTo().window(playRightBe);
		palyrightBe.launchURL(prop.getProperty("Email").trim(), prop.getProperty("firstName").trim(), prop.getProperty("lastName").trim(),
				prop.getProperty("aliases").trim(), prop.getProperty("bands").trim(), prop.getProperty("dateOfBirth").trim(), 
				prop.getProperty("placeOfBirth").trim(), prop.getProperty("countryOfBirth").trim(), prop.getProperty("nationality"), 
				prop.getProperty("address1").trim(), prop.getProperty("CityStateZipCountry").trim(), prop.getProperty("instruments").trim(), 
				prop.getProperty("fullName").trim(), prop.getProperty("zipCode").trim(), prop.getProperty("city").trim(), prop.getProperty("countryOfResidance").trim(), 
				prop.getProperty("taxID").trim(), prop.getProperty("todaysDate").trim(), prop.getProperty("passportNumber").trim(), prop.getProperty("gender").trim());
	}
}
