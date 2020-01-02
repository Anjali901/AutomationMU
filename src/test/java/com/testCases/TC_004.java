package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MU_ComicsList;

public class TC_004 extends BaseClass{
@Test
public void ViewHistory() throws InterruptedException {
	//Calling The monekyuser website
	logger.info("Launching MonekyUser Website");
	MU_ComicsList cl = new MU_ComicsList(driver);	
   cl.ClickComicList();//Clinking The ComicList link
   logger.info("Clicking the ComicsList link ");
  // Thread.sleep(200);
 //Scroll Down on Salary Deposit
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.location = 'https://www.monkeyuser.com/toc/'");//using javascript for navigating
	Object height = js.executeScript("return window.innerHeight;");
	System.out.println("The height of Window " +height);
	Object width = js.executeScript("return window.innerHeight;");
	System.out.println("The Width of Window " +width);
	logger.info("Navigating the page by using Javascript");
	/*WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[191]/div/div/a[1]"));
	(js).executeScript("arguments[0].scrollIntoView();”,element);");*/
	Thread.sleep(200);
	logger.info("Views Comic History");
	
	
}
	
	
	
	
}
	
	
	
	
