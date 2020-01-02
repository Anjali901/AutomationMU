package com.testCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ComicsList;

public class TC_002 extends BaseClass {
	MU_ComicsList cl;

	@Test
	public void View() {
		//Calling The monekyuser website
		logger.info("Launching MonekyUser Website");
		MU_ComicsList cl = new MU_ComicsList(driver);
		cl.ClickComicList();//Clinking The ComicList link
		logger.info("Clicking the ComicsList link ");
		//Clicking on Latest Comics 
		cl.ViewLatestcc();
		logger.info("Clicking on Latest Comics");
	
	
		//Validate whether Test is unsuccessful
		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
		if(url.equals("https://www.monkeyuser.com/2019/i-am-inevitable/"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed!");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed!");
		}
		softassert.assertAll();
		logger.info("Successfully Opened Latest Comic");
		
	      }
	
}
