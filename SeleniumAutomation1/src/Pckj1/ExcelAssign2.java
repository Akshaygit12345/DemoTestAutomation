package Pckj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
                                                   
                                                 //MOXIE20100 Akshay Patil
                                                // Assignment No-37 Part-2

public class ExcelAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        File excel=new File("E:\\Automation\\Details.xlsx");
		
		FileInputStream InputStream;
		try {
			InputStream = new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(InputStream);
			XSSFSheet sheet1=wb.getSheet("Sheet1");
			for(Row row:sheet1)
			{
				System.out.println(row.getCell(2));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
