package Pckj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data_excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
				File excel=new File("E:\\Automation\\Details.xlsx");
				
				 
				
			     FileInputStream InputStream = new FileInputStream(excel);
					XSSFWorkbook wb=new XSSFWorkbook(InputStream);
					
					XSSFSheet sheet1=wb.getSheet("Sheet1");
					XSSFRow row1=sheet1.getRow(1);
					XSSFCell cell1=row1.createCell(7);
					cell1.setCellValue("datatype");
					XSSFRow newrow=sheet1.createRow(9);
					newrow.createCell(0).setCellValue("Akshay");
					newrow.createCell(1).setCellValue("Patil");
					FileOutputStream output=new FileOutputStream("E:\\Automation\\Details.xlsx");
					wb.write(output);
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

	}

}
