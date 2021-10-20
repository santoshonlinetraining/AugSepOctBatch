package temp;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("(//input[@id='search_query_top']")).sendKeys("T-Shirts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='search_query_top']")).clear();

		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Jeans");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();

		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("Shirts");
		

	}
}

driver.get("http://automationpractice.com/index.php");

driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirts");Thread.sleep(5000);driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();

driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("T-Shirst");Thread.sleep(5000);driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();

driver.findElement(By.xpath("//input[@class='s

}

}
