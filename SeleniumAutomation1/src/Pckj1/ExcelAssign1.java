package Pckj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
                                                  //MOXIE20100 Akshay Patil
                                                 // Assignment No-37 Part-1

public class ExcelAssign1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        try {
			File excel=new File("E:\\Automation\\Details.xlsx");
			
			 
			
			    FileInputStream InputStream = new FileInputStream(excel);
				XSSFWorkbook wb=new XSSFWorkbook(InputStream);
				
				XSSFSheet sheet1=wb.getSheet("Sheet1");
				wb.close();
				int rowcount=sheet1.getLastRowNum();
				for(int i=0;i<=rowcount;i++)
				{
					System.out.println(sheet1.getRow(3).getCell(i).getStringCellValue());
					System.out.println("");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		}
	

}
