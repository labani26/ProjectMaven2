package BestSellerExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataForBestSeller {

    private XSSFWorkbook workbook;
    public XSSFSheet sheet;
    private String path;

    public ExcelDataForBestSeller() throws IOException {
    //	ExcelDataForBestSeller - A class is a blueprint.
//    	Class = Design
//    	Object = Real thing
//    	IOException - Occurs when: File not found, File locked, Permission issue
//  	throws IOException - If any file-related error occurs, Java will handle it.

        path = "C:\\Users\\Labani sardar\\Downloads\\Automation_testin_material\\Best Seller Item List for -EastCom QuickSelling.xlsx";

//        Open the Excel file for reading.
        FileInputStream file = new FileInputStream(path);     
//        FileInputStream - Used for reading files.
//      
        workbook = new XSSFWorkbook(file);
//       XSSFSheet - Represents a sheet inside Excel.
//        Loads the Excel workbook into memory.

        sheet = workbook.getSheet("Best Seller Item List for -EastCom QuickSelling");

        file.close();
    }

    // Read Data
    public String readData(int row, int column) {

        return sheet.getRow(row)
                    .getCell(column)
                    .getStringCellValue();
    }

    // Write Data
    public void writeData(int row, int column, String value) throws IOException {
    	
    	//int row, int column, String value -	Parameters are variables that receive values when the method is called.
//    	int = integer data type
//    			row = variable name
//    			Stores the row number
//    	int = integer data type
//    			column = variable name
//    			Stores the column number
//    	String = text data type
//    			value = variable name
//    			Stores the text to be written into the Excel cell
    	
        sheet.getRow(row)
             .createCell(column)
             .setCellValue(value);

        FileOutputStream file = new FileOutputStream(path);
       // FileOutputStream - Used for writing data into files. ex - FileOutputStream file = new FileOutputStream(path);


        workbook.write(file);

        file.close();
    }

    public static void main(String[] args) throws IOException {

        ExcelDataForBestSeller excel = new ExcelDataForBestSeller();

        // Read Data
        String data = excel.readData(1, 0);
        System.out.println(data);

        // Write Data
        excel.writeData(1, 5, "Automation Testing");
    }
}