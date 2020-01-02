package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MU_ShopList {

	WebDriver ldriver;
	//Constructor
	
			public MU_ShopList(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
			}
	/////WebElement of ShopList///////////
			@FindBy(xpath="/html/body/header/div/div[1]/a[2]")
			public WebElement clkbtnshop;
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/ul/li[1]/div/a")
			public WebElement producta;	
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/div/ul/li[1]/div/a")
			public WebElement productb;	
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/div/div[2]/div[1]/form/div[2]/button")
			public WebElement addcart;
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/div/a")
			public WebElement continueshopping;
	///////////Function of Shoplist///////
			
			public void ClckBtnShopList() {
					WebDriverWait wait = new WebDriverWait(ldriver, 25);
					wait.until(ExpectedConditions.visibilityOf(clkbtnshop));
					clkbtnshop.click();
					
				}

			public void ShopProductA() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(producta));
				producta.click();
				
			}
			
			public void ClckAddCart() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(addcart));
				addcart.click();
				
			}
			
			
			public void ShopProductB() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(productb));
				productb.click();
				
			}
			
			
			public void ContinueBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(continueshopping));
				continueshopping.click();
			}
			
			}
	
	
	

