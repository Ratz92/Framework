package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class testutil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDatafromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			
			reader=new Xls_Reader("C:\\Users\\Ratnesh\\eclipse-workspace\\Automation\\src\\main\\java\\com\\excelfile\\Reg_Test_data.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum=2; rowNum <=reader.getRowCount("Registration"); rowNum++) {
			
			String firstname = reader.getCellData("Registration", "firstname", rowNum);
			String lastname = reader.getCellData("Registration", "lastname", rowNum);
			String email = reader.getCellData("Registration", "email", rowNum);
			String password = reader.getCellData("Registration", "password", rowNum);
			
			Object ob[] = {firstname, lastname, email, password};
			myData.add(ob);
		}
		return myData;	
	}
}
