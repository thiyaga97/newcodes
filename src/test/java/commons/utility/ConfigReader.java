package commons.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	private final String filepath = "C:\\Users\\mypc\\eclipse-workspaces\\FinalFb\\src\\test\\resources\\Properties\\config.properties";
	
	public ConfigReader() {
	FileInputStream reader;
	try {
		reader = new FileInputStream(filepath);
		properties = new Properties();
		try {
			properties.load(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		throw new RuntimeException("config.properties not found at " + filepath);
	}
}
	

	
	public String getApplicationUrl() throws IOException {			
		
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
				
	}
	
	public String getBrowser() {
		String Browser = properties.getProperty("Browser");
		if(Browser != null) return Browser;
		else throw new RuntimeException("Browser not specified in the Configuration.properties file.");

		
	}
}
