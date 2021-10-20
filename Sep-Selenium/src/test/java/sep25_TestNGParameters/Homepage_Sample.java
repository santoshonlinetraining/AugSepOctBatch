package sep25_TestNGParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Sample {
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;
	
	WebDriver driver;
	
	WebElement searchText = driver.findElement(By.xpath("//input[@id='search_query_top']"));
	
	
	@FindBy(linkText ="Sign in")
	private WebElement signInLink;
	
	
	@FindBy(linkText = "Contact us")
	private WebElement contactUs;


	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	
}
