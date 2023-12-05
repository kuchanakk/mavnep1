package excelinfom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatainfo {
	
	String expath= "C:\\Users\\kiran\\eclipse-workspace\\mavenp1\\resources\\excelinfo\\testdata.xlsx";
	
	public String readdata(int row , int clm) throws IOException {
		
		FileInputStream fis = new FileInputStream(expath);
		
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	return wb.getSheet("Sheet2").getRow(row).getCell(clm).getStringCellValue();
		
		
		
		
	}
	
	
	public void writedata(int row , int clm , String value) throws IOException {
		
		FileInputStream fis = new FileInputStream(expath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet2").getRow(row).createCell(clm).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(expath);
		wb.write(fos);
		fos.close();
		
	}
	
	
	

}
