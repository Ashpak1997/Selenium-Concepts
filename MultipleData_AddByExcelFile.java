package Add_ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData_AddByExcelFile 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{  
	
		String path ="C:\\Users\\Ashpak\\Desktop\\test file.xlsx"; // path of file 
		  
		FileInputStream fileE = new FileInputStream(path); // open file with object of FileInputStream class
		  
		Sheet data = WorkbookFactory.create(fileE).getSheet("pune");
		  
		  //String a = data.getRow(1).getCell(0).getStringCellValue();
		
		for (int i=0; i<=6; i++)     // row
		 {
		   for(int j=0; j<=1; j++)   // cell
			 {	  
				String a = data.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data+" ");
			  }
			System.out.println();  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  // System.out.println(a);
		  
		  //  for bring the fetch "int data" type of data
		  
		  // double b = WorkbookFactory.create(fileE).getSheet("pune").getRow(2).getCell(2).getNumericCellValue();
		  
		  // System.out.println(b);
	}
}
