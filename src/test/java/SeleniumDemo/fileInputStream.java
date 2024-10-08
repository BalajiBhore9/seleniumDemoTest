package SeleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.io.FileHandler;

public class fileInputStream {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// get the data from excel sheet
		
		FileInputStream source = new FileInputStream("");
		String desti = WorkbookFactory.create(source).getSheet("sheet").getRow(0).getCell(0).getStringCellValue();
		
		FileHandler.copy(null, null);
	}

}
