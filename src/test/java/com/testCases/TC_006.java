package com.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ShopList;

public class TC_006 extends BaseClass {

	MU_ShopList sl;
	@Test
	public void Shop() {
		//Calling The monekyuser website
	    logger.info("Launching MonekyUser Website");
	    //Catpturing Shop Button
	    MU_ShopList sl = new MU_ShopList(driver);
	    sl.ClckBtnShopList();//Shop List WebPage is visible
	    logger.info("Shop List WebPage is visible");
	    sl.ShopProductA();//Selecting Product A
	    logger.info("Selecting Product A");
	    
		//Validate whether Test is unsuccessful
		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
		if(url.equals("https://store.monkeyuser.com/collections/frontpage/products/bug"))
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
		logger.info("Successfully Product Added To Cart");
		
	      }
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

