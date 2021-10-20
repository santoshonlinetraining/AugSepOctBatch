package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page {

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
	private WebElement Callusnow;

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement Signout;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement contactUs;

	// header
	@FindBy(xpath = "//div[6]/ul[1]/li[1]/a[1]")
	private WebElement Women;

	@FindBy(xpath = "//div[6]/ul[1]/li[2]/a[1]")
	private WebElement Dresses;

	@FindBy(xpath = "//div[6]/ul[1]/li[3]/a[1]")
	private WebElement Tshirts;

	// footer links
	// Newsletter
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement Enteremailbox;

	@FindBy(xpath = "//footer[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	private WebElement EnteremailboxButton;

	// categories
	@FindBy(xpath = "//footer[1]/div[1]/section[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Womenlink;

	// information
	@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[1]/a[1]")
	private WebElement Specials;

	@FindBy(xpath = "//a[contains(text(),'New products')]")
	private WebElement NewProducts;

	@FindBy(xpath = "//a[contains(text(),'Best sellers')]")
	private WebElement Bestsellers;

	@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[4]/a[1]")
	private WebElement Ourstores;

	@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[5]/a[1]")
	private WebElement Contactus;

	@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[6]")
	private WebElement TermsandConditions;

	@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[7]/a[1]")
	private WebElement Aboutus;

	@FindBy(xpath = "//a[contains(text(),'Sitemap')]")
	private WebElement SiteMap;

	// MyAccount
	@FindBy(xpath = "//a[contains(text(),'My account')]")
	private WebElement MyAccount;

	@FindBy(xpath = "//a[contains(text(),'My orders')]")
	private WebElement MyOrders;

	@FindBy(xpath = "//a[contains(text(),'My credit slips')]")
	private WebElement MyCreditSlips;

	@FindBy(xpath = "//a[contains(text(),'My addresses')]")
	private WebElement Myaddresses;

	@FindBy(xpath = "//a[contains(text(),'My personal info')]")
	private WebElement MyPersonalInfo;

	// Store information
	@FindBy(xpath = "//a[contains(text(),'support@seleniumframework.com')]")
	private WebElement EmailAddress;

}
