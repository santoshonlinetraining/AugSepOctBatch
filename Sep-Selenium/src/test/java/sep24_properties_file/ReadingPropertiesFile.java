package sep24_properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\src\\test\\java\\sep24_properties_file\\config.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("browser"));
		
	}

}
