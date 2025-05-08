package week6.Marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
       //convert main to method 
	public static String[][] readData(String filename) throws IOException {
		
		//To open Workbook 
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");
		
		//Locate the worksheet
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To count the no of rows without header 
		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is :"+rowCount);
		
		//To count with Header 
		
		int TotalrowCount = ws.getPhysicalNumberOfRows();
		System.out.println("The row count with header is" +TotalrowCount);
		
		//To count column count
	    int ColumnCount = ws.getRow(0).getLastCellNum();
	    System.out.println("The column count is :" +ColumnCount);
	    
	    //To retrieve the data from a cell
	    String row1CellData = ws.getRow(1).getCell(1).getStringCellValue();
	    System.out.println("The cell 1 value is :" +row1CellData);
	    
	    //declare a 2 dimension array to get all data 
	    
	    
	    String[][] data=new String[rowCount][ColumnCount];
		
	    //To retrieve entire data 
	    for (int i=1; i <= rowCount;i++)
	    {
	    	XSSFRow row = ws.getRow(i);
	    	for(int j=0;j<ColumnCount;j++)
	    	{
	    		String allData = row.getCell(j).getStringCellValue();
	    		data[i-1][j]=allData;
	    		System.out.println("The full data is :"+allData);
	    	}
	    }
		
	    wb.close();
	    return data;
	 

	}


	

}
