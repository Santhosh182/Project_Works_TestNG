package com.Data_Driven_Framework;

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

public class DataDriven {
	public static void particular_Cell_Data() throws IOException {
		
		File f = new File("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\Test Cases.xlsx");
		
		FileInputStream fis = new FileInputStream(f);// TODO Auto-generated method stub

	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(1);
	Row rowno = sheetAt.getRow(4);
	Cell cellno = rowno.getCell(1);
	CellType type = cellno.getCellType();
	 if (type.equals(CellType.STRING)) {
		String stringCellValue = cellno.getStringCellValue();
		System.out.println(stringCellValue);
	} 
	 
	 else if (type.equals(CellType.NUMERIC)) {
		 double numericCellValue = cellno.getNumericCellValue();
		 int value = (int) numericCellValue;
		System.out.println(value);
	}
	 wb.close();

	}
	public static void main(String[] args) throws IOException {
		particular_Cell_Data();
	}

}
