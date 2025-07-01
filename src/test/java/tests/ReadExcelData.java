package tests;

import java.util.List;
import java.util.Map;

	
import utilities.ExcelUtility;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(System.getProperty("user.dir"));
		List<Map<String, String>> data =ExcelUtility.readExcelDatabycollections("TestData.xlsx","Sheet1");
				
		
		System.out.println(data);

		//String[][] testData=ExcelUtility.readExcelDatabyArrays("TestData.xlsx","Sheet1");
		
		//System.out.println(testData);
			
	}

}
