package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class SwagLab {
   
	@DataProvider
	public String[][] getData() throws Exception
	{
		File excel=new File("D:\\selenium driver and selenium\\Excel dataprovider\\SwagLabLogin.xlsx");
		System.out.println(excel.exists());
		FileInputStream fis=new FileInputStream(excel);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheet("Data");
	    int noOfRows=sheet.getPhysicalNumberOfRows();
	    System.out.println(noOfRows);
	    System.out.println(sheet.getLastRowNum());
	    int noOfColumns=sheet.getRow(0).getLastCellNum();
	    System.out.println(noOfColumns);
	    
	    String [][] data=new String[noOfRows-1][noOfColumns];
	    for(int i=0;i< noOfRows;i++)
	    {
	    	for(int j=0;j< noOfColumns-1;j++) {
	    		
	    		 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	    	}
	    }
	    wb.close();
	    fis.close();
	    
	    return data;
	}
}
