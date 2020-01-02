package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MU_CheckoutCartList {

	WebDriver ldriver;
	//Constructor
	
			public MU_CheckoutCartList(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
			}
			
			/////WebElement of Chechout cart//////////////
			
			@FindBy(xpath="/html/body/div[2]/div/header/div/nav/ul/li[1]/a/span")
			public WebElement comic;
			
			@FindBy(xpath="/html/body/div[2]/div/header/div/nav/ul/li[2]/a/span")
			public WebElement products;
			
			@FindBy(xpath="/html/body/div[2]/div/header/div/nav/ul/li[3]/a/span")
			public WebElement contactus;
			
			@FindBy(xpath="/html/body/div[2]/div/header/div/div[2]/div/a[1]")
			public WebElement SignIn;
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/div/a")
			public WebElement continueshopping;
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/form/table/tbody/tr[1]/td[2]/p/a")
			public WebElement removebtn;
	
			@FindBy(xpath="//input[@id='updates_large_11337199452196:0ba6dc1b4fa2ca7e0fad97d5a03e700c']")
			public WebElement dropdwncart;

			@FindBy(xpath="/html/body/div[3]/main/div/div/form/div/div/div/div[3]/input[1]")
			public WebElement updatebtn;
            
			@FindBy(xpath="/html/body/div[2]/div/header/div/div[2]/div/a[1]/svg")
			public WebElement loginlbtn;
			
			@FindBy(xpath="/html/body/div[2]/div/header/div/div[2]/div/button[1]/svg")
			public WebElement iconsearchbtn;
			
			@FindBy(xpath="/html/body/div/div[2]/div[1]/div")
			public WebElement paypalbtn;

			@FindBy(xpath="/html/body/div[2]/div/header/div/div[2]/div/a[2]")
			public WebElement carticon;
			
			@FindBy(xpath="/html/body/div[3]/main/div/div/div/a")
			public WebElement ctnshppng;
			
			
		@FindBy(xpath="//*[@id=\"paypal-animation-container\"]")
		public WebElement paypal;
///////////////////Function pf Checkoutlist//////////////////////
			
			
			public void ViewComic() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(comic));
				comic.click();
				
			}
			
			public void ViewProduct() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(products));
				products.click();
				
			}

	
			public void ViewContact() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(contactus));
				contactus.click();
				
			}
	
			public void ClickCartIcon() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(carticon));
				carticon.click();
			}
	
	
			public void ClickRemove() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(removebtn));
				removebtn.click();
			}
			
			public void Select_No_Product() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(dropdwncart));
				dropdwncart.sendKeys("1");
			}
	
			public void UpdateBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(updatebtn));
				updatebtn.click();
			}
			
			
			public void SignInBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(SignIn));
				SignIn.click();
			}
			
			public void ContShpngBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(ctnshppng));
				ctnshppng.click();
			}
			
			public void PayPalBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(paypal));
				paypal.click();
			}
			
}
