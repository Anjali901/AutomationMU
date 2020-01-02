package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_ShopList;

public class TC_006 extends BaseClass {

	MU_ShopList sl;
	@Test
	public void Shop() throws IOException {
		//Calling The monekyuser website
	    logger.info("Launching MonekyUser Website");
	    //Catpturing Shop Button
	    MU_ShopList sl = new MU_ShopList(driver);
	    sl.ClckBtnShopList();//Shop List WebPage is visible
	    logger.info("Shop List WebPage is visible");
	    sl.ShopProductA();//Selecting Product A
	    logger.info("Selecting Product A");
	    sl.ClckAddCart();//Clicking Add to Cart
	    logger.info("Clicking Add to Cart");
	    
		//Validate whether Test is unsuccessful
		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println("Title :"+url);
		if(url.equals("https://store.monkeyuser.com/cart"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed!");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed!");
			captureScreen(driver,"TC_006");
		}
		softassert.assertAll();
		logger.info("Successfully Product Added To Cart");
		
	      }
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

