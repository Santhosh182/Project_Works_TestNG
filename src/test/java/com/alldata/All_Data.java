package com.alldata;

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


public class All_Data {


public static void get_AllData() throws IOException {
	
File f = new File("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\Test Cases.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb =  new XSSFWorkbook(fis);
Sheet s = wb.getSheet("Dummy");
int pnr = s.getPhysicalNumberOfRows();
for (int i = 0; i <pnr ; i++) {
	Row r = s.getRow(i);
	int pnc = r.getPhysicalNumberOfCells();
for (int j = 0; j < pnc; j++) {
	Cell c = r.getCell(j);

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
}
wb.close();

}
public static void main(String[] args) throws IOException {
	get_AllData();

	}
}
