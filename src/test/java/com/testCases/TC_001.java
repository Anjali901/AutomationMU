package com.testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ComicsList;

public class TC_001 extends BaseClass {
	MU_ComicsList cl;

	@Test
	public void View() {
		//Calling The monekyuser website
		logger.info("Launching MonekyUser Website");
		MU_ComicsList cl = new MU_ComicsList(driver);
	//	cl.ClickComicList();//Clinking The ComicList link
		//logger.info("Clicking the ComicsList link ");
		//Clicking on Random View Comics
		cl.ViewRandomcc();
		logger.info("Clicking on Random View");
	


		//Validate title
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
	
	
	}
	

}