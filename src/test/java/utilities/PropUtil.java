package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

		//Properties is the return type which can return key &values from property file
	public static Properties readData(String fileName) {
		Properties prop = new Properties(); 
		
		
		
		try {
			
			//Read the file using Java class fileinputstream it can read and recognize any kind of file like excel,pdf,word,and text file
			//FileINputStream read the raw data and convert into bytes any data
			//FileInputStream fis= new FileInputStream("E:\\SW Testing\\Bharath\\AutomationTraining\\maven\\config"+fileName);
			//system is class whith we can use to get the path till project directory
			
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\config\\"+fileName);
			
			
			//load the properties from the file to prop variable 
			prop.load(fis);
			
			//we can add parent class exception so that we can avoid multiple declaration of each exceptions
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return prop;
		
	}
}
