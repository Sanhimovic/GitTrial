package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step 1 : Specify the path of excel.
		FileInputStream fis=new FileInputStream("./excel/Trial.xlsx");
		
		//Step 2: open excel
		Workbook book = WorkbookFactory.create(fis);
		
		//Step 3:specify the sheet name
		Sheet s = book.getSheet("Sheet1");
		
		//Step 4: specify the row number
		Row r = s.getRow(1);
		
		//Step 5: specify the cell number
		Cell c = r.getCell(0);
		
		//Step 6: fetch data
		String val = c.getStringCellValue();
		System.out.println(val);
	}
}
