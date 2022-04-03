package com.RowData_ColumnData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Particular_Row_Coloumn_Data {


public static void get_Particular_RowColoumn_data() throws IOException {
	
File f = new File("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\Test Cases.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb =  new XSSFWorkbook(fis);
Sheet s = wb.getSheet("Dummy");
Row r = s.getRow(2);
for (int i = 0; i <r.getPhysicalNumberOfCells() ; i++){
	Cell c = r.getCell(i);

	CellType type = c.getCellType();
	
	if (type.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
	}
	else if (type.equals(CellType.NUMERIC)) {
		double numericValue = c.getNumericCellValue();
		int inumericValue = (int) numericValue;
		String st = Integer.toString(inumericValue);
System.out.println(st);
	}

}
wb.close();
}



public static void main(String[] args) throws IOException {
	get_Particular_RowColoumn_data();

	}
}
