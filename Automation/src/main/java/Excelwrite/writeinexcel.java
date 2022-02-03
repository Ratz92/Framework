package Excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeinexcel {
	
 public static void main(String[] args) throws IOException {
	
	 File src = new File("C:\\Users\\Ratnesh\\git\\Framework\\Automation\\src\\main\\java\\com\\excel_TestData\\Reg_Test_data.xlsx");
	 
	 FileInputStream fis = new FileInputStream(src);
	 
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	 
	 XSSFSheet sheet1 = wb.getSheetAt(0);
	 
	 sheet1.getRow(0).createCell(5).setCellValue("Pass");
	 
	 sheet1.getRow(1).createCell(5).setCellValue("Fail");
	 
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	wb.close();
	 
}

}
