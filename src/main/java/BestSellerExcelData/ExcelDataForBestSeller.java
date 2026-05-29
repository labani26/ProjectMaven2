package BestSellerExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataForBestSeller {

    public static void main(String[] args) throws IOException {

        // File Path
        String path = "C:\\Users\\Labani sardar\\Downloads\\Automation_testin_material\\Best Seller Item List for -EastCom QuickSelling.xlsx";

        // File Input Stream
        FileInputStream file = new FileInputStream(path);

        // Workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // Sheet
        XSSFSheet sheet = workbook.getSheet("Best Seller Item List for -EastCom QuickSelling");

        // Last Row Number
        int rowCount = sheet.getLastRowNum();

        System.out.println("Last Row Number: " + rowCount);

        // Loop through rows
//        for (int i = 1; i <= rowCount; i++) {
//
//            Row row = sheet.getRow(i);
//
//            if (row != null) {
//
//                // Get first cell value from row
//                Cell cell = row.getCell(0);
//
//                String rowName = cell.toString();
//
//                // Get total column count
//                int columnCount = row.getLastCellNum();
//
//                System.out.println(
//                        "Row Index: " + i +
//                        " | Row Name: " + rowName +
//                        " | Column Count: " + columnCount);
        
        public String readData(int row, int column) {
        	
        	return sheet.getSheet("Best Seller Item List for -EastCom QuickSelling").getRow(row).getcell(column).getStringCellValue();
            }
        
        public void writeData(int row, int clm)
        }

        // Close resources
        workbook.close();
        file.close();
    }
}