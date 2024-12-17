package tests.TestautSite.ReadFromExcell;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtility {

        private FileInputStream fi;
        private FileOutputStream fo;
        private XSSFWorkbook workbook;
        private XSSFSheet sheet;
        public XSSFRow row;
        public XSSFCell cell;
        public CellStyle style;
        private String path;


        // Constructor to initialize file path
        public ExcelUtility(String path) {
            this.path = path;
        }

        // Method to get the number of rows in a specific sheet
        public int getRowCount(String sheetName) throws IOException, FileNotFoundException {
            fi = new FileInputStream(path);  // Open the Excel file
            workbook = new XSSFWorkbook(fi);  // Create a workbook object

            sheet = workbook.getSheet(sheetName);  // Get the desired sheet by name
            int rowCount = sheet.getLastRowNum();  // Get the row count (last row index)

            workbook.close();  // Close the workbook
            fi.close();  // Close the input stream

            return rowCount;
        }

        public int getCellCount(String sheetName, int rownum) throws IOException {
            fi = new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(rownum);
            int cellcount = row.getLastCellNum();
            workbook.close();
            fi.close();
            return cellcount;
        }

        public String getCellData(String sheetName, int rownum, int column) throws IOException {
            fi = new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(rownum);
            cell = row.getCell(column);

            DataFormatter formatter = new DataFormatter();
            String data;
            try {
                data = formatter.formatCellValue(cell); // Returns the formatted value of a cell as a String regardless of cell type
            } catch (Exception e) {
                data = "";
            }

            workbook.close();
            fi.close();
            return data;
        }

        public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {
            File xlfile = new File(path);
            if (!xlfile.exists()) // If file does not exist, then create new file
            {
                workbook = new XSSFWorkbook();
                fo = new FileOutputStream(path);
                workbook.write(fo);
            }

            fi = new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);

            if (workbook.getSheetIndex(sheetName) == -1) // If sheet does not exist, then create new sheet
                workbook.createSheet(sheetName);
            sheet = workbook.getSheet(sheetName);

            if (sheet.getRow(rownum) == null) // If row does not exist, then create new row
                sheet.createRow(rownum);
            row = sheet.getRow(rownum);

            cell = row.createCell(colnum);
            cell.setCellValue(data);

            fo = new FileOutputStream(path);
            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }

        public void fillGreenColor(String sheetName, int rownum, int column) throws IOException {
            fi = new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);
            sheet = workbook.getSheet(sheetName);

            row = sheet.getRow(rownum);
            cell = row.getCell(column);
            style = workbook.createCellStyle();

            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell.setCellStyle(style);

            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }

        public void fillRedColor(String sheetName, int rownum, int column) throws IOException {
            fi = new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);
            sheet = workbook.getSheet(sheetName);

            row = sheet.getRow(rownum);
            cell = row.getCell(column);
            style = workbook.createCellStyle();

            style.setFillForegroundColor(IndexedColors.RED.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell.setCellStyle(style);

            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }
    }


