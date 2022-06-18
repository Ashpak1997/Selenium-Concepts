package Add_ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OneData_AddExcelFile 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
	 {
		
		  String path = "C:\\Users\\Ashpak\\Desktop\\test file.xlsx"; // path of file 
		  
		  FileInputStream fileE = new FileInputStream(path); // open file with object of FileInputStream class
		  
		  //  for bring the fetch "string" type of data
		  
		  String a = WorkbookFactory.create(fileE).getSheet("pune").getRow(1).getCell(0).getStringCellValue();
		
		  System.out.println(a);
		  
		  //  for bring the fetch "int data" type of data
		  
		  // double b = WorkbookFactory.create(fileE).getSheet("pune").getRow(2).getCell(2).getNumericCellValue();
		  
		  // System.out.println(b); 
	  }
}

// create() -  used to create file in java
// get-sheet() -  used to open sheet in excel
// getRow  -  row number
// getCell -  cell number
// getStringCellValue -  bring the value