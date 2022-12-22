package readPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertyData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String password = prop.getProperty("password");
		System.out.println(password);
	}

}
