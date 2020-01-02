package com.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MU_ComicsList {
WebDriver ldriver;
	//Constructor
	
			public MU_ComicsList(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
			}
	
	
	/////WebElement of Comic List////////////
	@FindBy(xpath="//a[@id='list']")
	public WebElement comiclist;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/div/div[4]/a/img")
	public WebElement random;
	
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[1]/div/div/a[1]")
	public WebElement latestcomic;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div[5]/a/img")
	public WebElement nextcomic;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[47]/div/div/a[1]")
	public WebElement date1;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[68]/div/div/a[1]")
	public WebElement date2;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[117]/div/div/a[1]")
	public WebElement date3;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[191]/div/div/a[1]")
	public WebElement historylist;
	
	///////Function of Comic List///////////
	
	
	public void ClickComicList() {
	
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(comiclist));
		comiclist.click();
		
	}
	
	public void ViewRandomcc() {
		
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(random));
		random.click();
		
	}
	
	
public void ViewLatestcc() {
		
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(latestcomic));
		latestcomic.click();
		
	}
	
	
public void ViewNextcc() {
	
	WebDriverWait wait = new WebDriverWait(ldriver, 25);
	wait.until(ExpectedConditions.visibilityOf(nextcomic));
	nextcomic.click();
	
}

public void ViewDate1() {
	
	WebDriverWait wait = new WebDriverWait(ldriver, 25);
	wait.until(ExpectedConditions.visibilityOf(date1));
	date1.click();
	
}
public void ViewDate2() {
	
	WebDriverWait wait = new WebDriverWait(ldriver, 25);
	wait.until(ExpectedConditions.visibilityOf(date2));
	date2.click();
	
}

public void ViewDate3() {
	
	WebDriverWait wait = new WebDriverWait(ldriver, 25);
	wait.until(ExpectedConditions.visibilityOf(date3));
	date3.click();
	
}
public void ScrollView() {
	WebElement element= historylist;
	//((JavascriptExecutor)ldriver).executeScript(“arguments[0].scrollIntoView();”,element);
}

	
}
