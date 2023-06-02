package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
	public static void main(String[] args) throws IOException   {
		FileInputStream fis = new FileInputStream("./src/testdata/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		System.out.println(pobj.getProperty("browser"));

		System.out.println(pobj.getProperty("url"));

		System.out.println(pobj.getProperty("username"));
		System.out.println(pobj.getProperty("password"));
		
	}
}
