package Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
 

public class PropertiesFile {
	static Properties prop;
	
	public static void main(String[] args) {
		readProperties();
	}

	public static void readProperties() {
		prop = new Properties();
		try {
			InputStream input = new FileInputStream("C:\\Users\\udaykir101\\eclipse-workspace\\SeleniumBasic\\src\\test\\java\\Config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}

}

//