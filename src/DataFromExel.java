import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExel {

	public static void main(String[] args) throws IOException {
		String exelFilePath= ".\\TestCaseDataSelenium\\TestCaseData.xlsx";
		//Create fileInput stream it will create stream to read data i.e open the file in reading mode
		FileInputStream inputStream = new FileInputStream(exelFilePath);
		XSSFWorkbook workBook = new XSSFWorkbook(exelFilePath);
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		for(int r=0; r<=rows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0; c<cols; c++)
			{
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()){
					case STRING:System.out.print(cell.getStringCellValue()+" ");break;
					case NUMERIC:System.out.print(cell.getNumericCellValue()+" ");break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue()+" ");break;
				}
			}
			System.out.println();
		}
	}

}
