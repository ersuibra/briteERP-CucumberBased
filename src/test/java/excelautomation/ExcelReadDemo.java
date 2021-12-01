package excelautomation;


import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReadDemo {

    @Test
    public void readXLFile() throws Exception {
    String path = "C:\\Users\\ASUSNB\\Documents\\Countries.xlsx";

        //Open File and convert to stream of data
        FileInputStream inputStream = new FileInputStream(path);

        //Workbook > Worksheet > Row > Cell
        //Open the WorkBook. Any Type
        Workbook workbook = WorkbookFactory.create(inputStream);

        //Go to the First WorkSheet. Index 0
        Sheet worksheet = workbook.getSheetAt(0);

        //Go to the First Row
        Row row = worksheet.getRow(0);

        Cell cell1 = row.getCell(0);
        Cell cell2 = row.getCell(1);

        System.out.println(cell1.toString());
        System.out.println(cell2.toString());


        workbook.close();
        inputStream.close();


    }



}
