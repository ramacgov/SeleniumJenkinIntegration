package DatadrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DatadrivertestPOI {
	
	static List<String> usernamelist = new ArrayList<String>();
	static List<String> passwordlist = new ArrayList<String>();

public void readExcel() throws IOException {
	
	
	
		FileInputStream FIS = new FileInputStream("C:\\Users\\dell\\eclipse-workspace2\\Selenium_Project\\src\\main\\resources\\TestData\\Testdata.xlsx");
		Workbook WB = new XSSFWorkbook(FIS);
		Sheet sheet = WB.getSheetAt(0);
		Iterator<Row> rowiterator = sheet.iterator();
		while(rowiterator.hasNext())
		{
			Row Rowvalue=rowiterator.next();
			
			Iterator<Cell> columiterator = Rowvalue.iterator();
			int i=2;
			
			while(columiterator.hasNext())
			{
				if (i%2==0)
				{
					usernamelist.add(columiterator.next().getStringCellValue());
				}
				else {
					
					passwordlist.add(columiterator.next().getStringCellValue());
				}
				
				
				i++;
			}
				
			
		}
		
		
		
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatadrivertestPOI objread = new DatadrivertestPOI();
		objread.readExcel();
		System.out.println("Username" + usernamelist);
		System.out.println("Password" + passwordlist);
	}

}
