package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		readPropertiesFile();
		
	
	}
	
	public static void readPropertiesFile() {
		Properties prop = new Properties();
			FileInputStream fi;
			try {
				fi = new FileInputStream("/Users/qusaimousa/eclipse-workspace/Inroduction/src/config/config.properties");
				prop.load(fi);
				System.setProperty("Webdriver.chrome.driver",prop.getProperty("chromepath"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
