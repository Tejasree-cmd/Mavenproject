package Project1_Source;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.asserts.SoftAssert;

public class P1_Source_DDT_file {
	public static List un=new LinkedList();
	public static List pas=new LinkedList();
	
	
	
	public P1_Source_DDT_file ddtfile() throws EncryptedDocumentException, IOException {
	    FileInputStream fs = new FileInputStream("C:\\Users\\sai\\MKT-Java-Training\\practiceJava\\Excel-Sheet\\Teja-excel-Project.xlsx");
	    Workbook wb = WorkbookFactory.create(fs);	
	    Sheet sheet=wb.getSheet("Login");
	    int rowCount = sheet.getLastRowNum() + 1;

        // Column count: use first non-null row (commonly row 0)
        Row firstRow = sheet.getRow(0);
        int colCount = 0;
        if (firstRow != null) {
            colCount = firstRow.getLastCellNum(); // getLastCellNum() returns column count
        }
        
	    for(int i=1;i<rowCount;i++) {

	    	Cell cellUn = sheet.getRow(i).getCell(0);
	        if (cellUn.getCellType() == CellType.STRING) {
	            un.add(cellUn.getStringCellValue());
	        } else {
	            double val = cellUn.getNumericCellValue();
	            un.add(String.valueOf((long) val));
	        }
	     pas.add(wb.getSheet("Login").getRow(i).getCell(1).getStringCellValue());
	     
	    }
	   
	    return this; // ✅ return the object
	}


}
