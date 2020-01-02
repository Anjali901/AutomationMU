package com.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ComicsList;

public class TC_003 extends BaseClass {

	MU_ComicsList cl;

	@Test
	public void View() {
		//Calling The monekyuser website
		logger.info("Launching MonekyUser Website");
		MU_ComicsList cl = new MU_ComicsList(driver);
		//Clicking on Random View
		cl.ViewRandomcc();
		logger.info("Clicking on Random View");
		//Clicking on Next Tab
		cl.ViewNextcc();
		logger.info("Clicking on Next Tab");
	
		

		//Validate 	Title
		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
		
		
  }
}
