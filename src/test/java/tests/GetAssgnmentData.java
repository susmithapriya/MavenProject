package tests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utilities.ExcelAssignmentUtility;

public class GetAssgnmentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(System.getProperty("user.dir")+ "\\data\\");
		List<Map<String, String>> sheetName1 = ExcelAssignmentUtility.getExceldatabyCollections("data.xlsx",
				"StudentDetails");
		List<Map<String, String>> sheetName2 = ExcelAssignmentUtility.getExceldatabyCollections("data.xlsx",
				"EmployeeDetails");
		List<Map<String, String>> sheetName3 = ExcelAssignmentUtility.getExceldatabyCollections("data.xlsx",
				"ProductDetails");

		System.out.println(sheetName1);
		System.out.println(sheetName2);
		System.out.println(sheetName3);

		Map<String, List<Map<String, String>>> data = new HashMap<>();
		data.put("Students", sheetName1);
		data.put("Employees", sheetName2);
		data.put("Products", sheetName3);
		
		System.out.println(data.get("Products").get(1).get("Supplier"));

	}

}
