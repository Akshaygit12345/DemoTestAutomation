package Pckj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handleexcelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File excel=new File("E:\\Automation\\Details.xlsx");
		
		FileInputStream InputStream=new FileInputStream(excel);
		
		XSSFWorkbook wb=new XSSFWorkbook(InputStream);
		XSSFSheet sheet1=wb.getSheet("Sheet1");
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell1=row1.getCell(2);
		String str=cell1.getStringCellValue();
		
		System.out.println(str);
		
		
		
		

	}

}
