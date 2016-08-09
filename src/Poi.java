import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Poi {

	public void readExcel(String filePath,String filename,String sheetname) throws IOException {
		File file=new File(filePath + "\\"+ filename);
		
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb=null;
		
		String extn = filename.substring(filename.indexOf("."));
		
		if (extn.equals(".xlsx")){
			wb = new XSSFWorkbook(inputStream);
		}else if (extn.equals(".xls")){
			wb=new HSSFWorkbook(inputStream);
		}
		
		Sheet sh = wb.getSheet(sheetname);
		int RowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		
		for(int r=0;r < RowCount;r++){
			Row row=sh.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++){
				System.out.println(row.getCell(c).getStringCellValue()+"||");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		
		/*Poi xl = new Poi();
		xl.readExcel("C:\\Users\\30410\\Desktop", "Book111.xlsx", "Sheet1");
		*/
		Runtime.getRuntime().exec("C:\\Users\\30410\\Desktop\\test.exe");
	}

}
