package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Hashexceldata {

	FileInputStream fis ; //= new FileInputStream("");
	XSSFWorkbook w ;
	XSSFSheet sh ;
	XSSFCell cell;
	int lastnum ;
	

	public void read() throws FileNotFoundException
	{
		fis = fis = new FileInputStream("D:\\Book1.xlsx");
		try {
			w = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sh= w.getSheetAt(4);
		lastnum =sh.getLastRowNum();
	  System.out.println( lastnum);
	  
	}
	
	public String getalldata(int a , int b)
	{                  //1           0//1
		cell = sh.getRow(a).getCell(b);
		String celltext = null ;
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			celltext  =cell.getStringCellValue();
			//System.out.println(celltext);
		}
		else
		{
			if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
				celltext = String.valueOf(cell.getNumericCellValue());
				//System.out.println(celltext);
			}
			else
			{
				System.out.println("nothing has found");
			}
		}
		return celltext;
		
		
	}

	
}
