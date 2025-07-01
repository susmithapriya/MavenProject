package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssignmentUtility {
	
	public static List<Map<String,String>> getExceldatabyCollections(String fileName,String sheetName){
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		
		try {
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Assignmentdata//" + fileName);
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//TestData//" + fileName);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			
			int totalRows = sh.getPhysicalNumberOfRows() ;
			int totalColumn= sh.getRow(0).getPhysicalNumberOfCells();
			
			
			for(int r=1;r<totalRows;r++) {
				Map<String, String> rowData = new HashMap<String, String>();
				
				for(int c=0;c<totalColumn;c++) {
					
					String ColumnName = sh.getRow(0).getCell(c).getStringCellValue();
					String ColumnValue = sh.getRow(r).getCell(c).getStringCellValue();
					rowData.put(ColumnName, ColumnValue);
				}
				
				
				data.add(rowData);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return data;
		
	}

}
