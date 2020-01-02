package com.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ComicsList;

public class TC_005 extends BaseClass {

	MU_ComicsList cl;

	@Test
	public void View() throws IOException, InterruptedException {
		//Calling The monekyuser website
		logger.info("Launching MonekyUser Website");
		MU_ComicsList cl = new MU_ComicsList(driver);
		cl.ClickComicList();//Clinking The ComicList link
		logger.info("Clicking the ComicsList link ");
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.location = 'https://www.monkeyuser.com/toc/'");//using javascript for navigating
		//logger.info("Navigating the page by using Javascript");
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//js.executeScript("window.scrollBy(0, 1200);");//scrolling down the page 
	//	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//logger.info("Scrolling down the Page");
		//Clicking on Date1
		cl.ViewDate1();
		logger.info("December 4, 2018");
	   //Validate 	Title
		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
		if(url.equals("https://www.monkeyuser.com/2018/trial-and/"))
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
		logger.info("Successfully Opened Comic");
	
	//Clicking on Date2
		cl.ClickComicList();//Clinking The ComicList link
		logger.info("Clicking the ComicsList link ");
            cl.ViewDate2();			
			logger.info("June 19, 2018");	
	
			   //Validate 	Title
			String url1= driver.getCurrentUrl();
			System.out.println("Title :"+url1);
			Thread.sleep(200);
			if(url1.equals("https://www.monkeyuser.com/2018/happy-flow/"))
			{
				softassert.assertTrue(true);
				logger.info("Test Passed!");
			}
			else
			{
				softassert.assertTrue(false);
				logger.error("Test Failed!");
				captureScreen(driver,"TC_005");
			}
			softassert.assertAll();
			logger.info("Successfully Opened Comic");
	         
			//Clicking on Date3
			cl.ClickComicList();//Clinking The ComicList link
			logger.info("Clicking the ComicsList link ");
	            cl.ViewDate3();			
				logger.info("June 19, 2018");	
		      //Validate Title
				String url2= driver.getCurrentUrl();
				System.out.println("Title :"+url2);
				if(url2.equals("https://www.monkeyuser.com/2017/angular-vs-react/"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Test Failed!");
					captureScreen(driver,"TC_005c");
				}
				softassert.assertAll();
				logger.info("Successfully Opened Comic");
}
}