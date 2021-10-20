package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authetication_page1_craeteaccount {

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
	private WebElement Callusnow;

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	// header
	@FindBy(xpath = "//div[6]/ul[1]/li[1]/a[1]")
	private WebElement Women;

	@FindBy(xpath = "//div[6]/ul[1]/li[2]/a[1]")
	private WebElement Dresses;

	@FindBy(xpath = "//div[6]/ul[1]/li[3]/a[1]")
	private WebElement Tshirts;

	// create an account

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement Emailaddress;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
	private WebElement Craeteanaccountbutton;

	// personal information
	@FindBy(id = "uniform-id_gender2")
	private WebElement Genderselectbutton;

	@FindBy(name = "customer_firstname")
	private WebElement FirstName;

	@FindBy(name = "customer_lastname")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	// Date of birth
	@FindBy(id = "days")
	private WebElement days;

	@FindBy(id = "months")
	private WebElement months;

	@FindBy(id = "years")
	private WebElement years;

	@FindBy(id = "newsletter")
	private WebElement newslettercheckbox;

	@FindBy(name = "optin")
	private WebElement recievespecialofferscheckbox;

	// your address
	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(name = "company")
	private WebElement companyname;

	@FindBy(name = "address1")
	private WebElement Address1;

	@FindBy(name = "address2")
	private WebElement Address2;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement ziporpostalcode;

	@FindBy(id = "id_country")
	private WebElement Countryname;

	@FindBy(name = "other")
	private WebElement Additionalinformation;

	@FindBy(name = "phone")
	private WebElement Homephone;

	@FindBy(name = "phone_mobile")
	private WebElement mobilephone;

	@FindBy(name = "alias")
	private WebElement assignaddressalis;

	@FindBy(name = "submitAccount")
	private WebElement Register;

	// Newsletter
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement Enteremailbox;

	@FindBy(xpath = "//footer[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	private WebElement EnteremailboxButton;

	// categories
	@FindBy(xpath = "//footer[1]/div[1]/section[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Womenlink;

	// footer links
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
