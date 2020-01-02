package com.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.MU_CheckoutCartList;
import com.pageObjects.MU_ShopList;

public class TC_007 extends BaseClass {
	MU_ShopList sl;
	MU_CheckoutCartList cc;
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
	    sl.ClckAddCart();//Selecting Add to cart
	    logger.info("Selecting Add to cart");
	    sl.ContinueBtn();//Selecting Continue Shoping btn
	    logger.info("Selecting Continue Shoping btn");
	    sl.ShopProductB();//Adding Product B to cart
	    logger.info("Adding Product B to cart");
	    sl.ClckAddCart();//Selecting Add Cart
	    logger.info("Adding product B to Cart");
	    //Calling ChechkoutCartList
	    MU_CheckoutCartList cc = new MU_CheckoutCartList(driver);
	  //  cc.Select_No_Product();
	    //logger.info("Selecting the number of product");
	    cc.ClickCartIcon();//Clicking CartICON
	    logger.info("Capturing Cart Icon Btn");
	    cc.SignInBtn();//Clicking SignIn Icon
	    logger.info("Capturing SignIn Icon");
	    cc.ClickCartIcon();//Back to Cart
	    logger.info("Back to Cart");
	   cc.UpdateBtn();//Clicking UpdateBtn
	   logger.info("Capturing Update Btn");
	   cc.ClickRemove();//Clicking RemoveBtn
	   logger.info("Capturing Remove Btn");
	 //  cc.ContinueBtn();//Clicking CntBtn
	  // logger.info("Capturing Continue Shopping Btn");
	  // cc.PayPalBtn();//Clicking paypal btn
       //logger.info("Capturing PayPal btn");
	
	 //Validate Title
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
	 		}
	 		softassert.assertAll();
	 		logger.info("Successfully Checked Cart Functions");
	   
	   
	   
	   
	   
	
	}
}
