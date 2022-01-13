package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleFetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1: specify the path of excel
		FileInputStream fis=new FileInputStream("./excel/demo.xlsx");
		// Step 2: open excel
		Workbook wb = WorkbookFactory.create(fis);
		// Step 3: specify sheet name
		Sheet s = wb.getSheet("Sheet1");
		//step 4: specify the row count
		Row r = s.getRow(0);
		// step5: specify the cell count
		Cell c = r.getCell(0);
		// step 6: fetch the data
		String value = c.getStringCellValue();
		System.out.println(value);
	}
}
