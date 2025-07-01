package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	// Read data from excel and convert into collections
	public static List<Map<String, String>> readExcelDatabycollections(String fileName, String sheetName) {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {
			// Read the Excel file
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//TestData//" + fileName);

			// load the file into Excel Class
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// Read the data from specific sheet
			XSSFSheet sh = wb.getSheet(sheetName);

			// Get the total rows and columns having data
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();

			// use for loop and copy the data

			for (int r = 1; r < totalRows; r++) {

				// initialize map for each row
				Map<String, String> rowData = new HashMap<String, String>();

				for (int c = 0; c < totalColumns; c++) {
					String ColumName = sh.getRow(0).getCell(c).getStringCellValue();
					String ColumnValue = sh.getRow(r).getCell(c).getStringCellValue();

					rowData.put(ColumName, ColumnValue);
				}

				// Store each map into main arraylist
				data.add(rowData);
			}

			// catch(Exception e)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}

	// Read data from excel and convert into Arrays
	public static String[][] readExcelDatabyArrays(String fileName, String sheetName) {
		String[][] data = null;

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//TestData//" + fileName);

			// load the file into Excel Class
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// Read the data from specific sheet
			XSSFSheet sh = wb.getSheet(sheetName);

			// Get the total rows and columns having data
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();

			// create array with specific size
			data = new String[totalRows][totalColumns];

			// use for loop to store the data
			for (int r = 0; r < totalRows; r++) {
				for (int c = 0; c < totalColumns; c++) {
					String CellValue = sh.getRow(r).getCell(c).getStringCellValue();
					data[r][c] = CellValue;
				}
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
