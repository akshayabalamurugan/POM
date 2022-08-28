package utils;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcel {

	public static String[][] readData(String excelName) throws IOException {
		
		XSSFWorkbook workbook= new XSSFWorkbook("Data/"+excelName+".xlsx");
		XSSFSheet workSheet = workbook.getSheetAt(0);
		int rowCount = workSheet.getLastRowNum();
		short colCount = workSheet.getRow(1).getLastCellNum();
		String[][] data= new String [rowCount][colCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = workSheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
			data[i-1][j]= cell.getStringCellValue();
			}
			
		}
		workbook.close();
		return data;
	}
}
