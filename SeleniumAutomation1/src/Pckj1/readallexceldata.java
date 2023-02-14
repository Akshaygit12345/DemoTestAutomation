package Pckj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readallexceldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        File excel=new File("E:\\Automation\\Details.xlsx");
		
		FileInputStream InputStream;
		try {
			InputStream = new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(InputStream);
			XSSFSheet sheet1=wb.getSheet("Sheet1");
			int rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
			for (int i=0;i<=rowcount;i++)
			{
				int cellcount=sheet1.getRow(i).getLastCellNum();
				System.out.println("row number: "+ i);
				for (int j=0;j<cellcount;j++)
				{
					System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue()+",");
				}
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
