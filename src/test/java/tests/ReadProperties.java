package tests;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = PropUtil.readData("Config.properties");
		
		System.out.println(prop.get("APP_URL"));
		
		
	}

}
