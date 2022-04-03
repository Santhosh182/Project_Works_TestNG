package com.WritingData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
 public static void writeDataInExcel() throws IOException {
	// TODO Auto-generated method stub
File f = new File("F:\\JAVA Programing\\Project Class\\Practicedata.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
wb.createSheet("Write_Data").createRow(0).createCell(0).setCellValue("Name");
wb.getSheet("Write_Data").getRow(0).createCell(1).setCellValue("id");
wb.getSheet("Write_Data").createRow(1).createCell(0).setCellValue("Hello");
wb.getSheet("Write_Data").getRow(1).createCell(1).setCellValue("abc@123");
wb.getSheet("Write_Data").createRow(2).createCell(0).setCellValue("hai");
wb.getSheet("Write_Data").getRow(2).createCell(1).setCellValue("cdf@123");
wb.getSheet("Write_Data").createRow(3).createCell(0).setCellValue("bye");
wb.getSheet("Write_Data").getRow(3).createCell(1).setCellValue("ghi@123");

FileOutputStream fos = new FileOutputStream(f);
wb.write(fos);
wb.close();
System.out.println("Written Successfully");
}
	public static void main(String[] args) throws IOException {
	writeDataInExcel();

	}
}
