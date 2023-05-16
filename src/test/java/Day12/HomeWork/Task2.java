package Day12.HomeWork;

import org.apache.poi.hssf.record.aggregates.RowRecordsAggregate;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
  /*Store the path of the file as string and open the file.
Open the workbook.
Open the first worksheet.
Go to the first row.
Create a cell on the 3rd column (2nd index) on the first row.
Write “POPULATION” on that cell.
Create a cell on the 2nd row 3rd cell(index2), and write data.
Create a cell on the 3rd row 3rd cell(index2), and write data.
Create a cell on the 4th row 3rd cell(index2), and write data.
Write and save the workbook.
Close the file.
Close the workbook.*/
/*Dosyanın yolunu dize olarak saklayın ve dosyayı açın.
 Çalışma kitabını açın. İlk çalışma sayfasını açın.
 İlk satıra git. İlk satırda 3. sütunda (2. dizin) bir hücre oluşturun.
 Bu hücreye “Nüfus” yazın. 2. sıra 3. hücreye(index2) bir hücre oluşturun ve veriyi yazın.
  3. sıra 3. hücrede (index2) bir hücre oluşturun ve verileri yazın.
   4. sıra 3. hücreye(index2) bir hücre oluşturun ve veriyi yazın.
    Çalışma kitabını yazın ve kaydedin. Dosyayı kapatın. Çalışma kitabını kapatın.
 */
    @Test
    public void task2() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet1 = wb.getSheetAt(0);

        Row row1 =sheet1.getRow(0);
        Cell row1cell3 = row1.createCell(2);
        row1cell3.setCellValue("POPULATION");

        Row row2 =sheet1.getRow(1);
        Cell row2cell3 = row2.createCell(2);
        row2cell3.setCellValue("data");
        System.out.println("row2cell1 = " + row2cell3);

        Row row3 =sheet1.getRow(2);
        Cell row3cell3 = row3.createCell(2);
        row3cell3.setCellValue(12345);
        System.out.println("row3cell1 = " + row3cell3);

       Row row4 =sheet1.getRow(3);
       Cell row4cell3 = row4.createCell(2);
       row4cell3.setCellValue(true);
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        fos.close();
        fis.close();
        wb.close();



    }
/*
//dosya bu clasttan once 3. sutun temiz olmalı.. ilk calıstırıldıgında yazar..
// 2. kez calıstırılınca uzerine yazar, hata vermez
    @Test
    public void writeExcel() throws IOException {
        String filePath = ".\\src\\test\\java\\tests\\resources\\excelfile.xlsx";
        //  Open the workbook.
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = WorkbookFactory.create(fis);
        //  Open the first worksheet.
        Sheet sheet1 = wb.getSheetAt(0);
        //  Go to the first row.
        Row row1 = sheet1.getRow(0);
        //  Create a cell on the 3rd column (2nd index) on the first row.
        Cell row1cell3 = row1.createCell(2);
        //  Write “POPULATION” on that cell.
        row1cell3.setCellValue("POPULATION");
        //  Create a cell on the 2nd row 3rd cell(index2), and write data.
        sheet1.getRow(1).createCell(2).setCellValue("200000");
        //  Create a cell on the 3rd row 3rd cell(index2), and write data.
        sheet1.getRow(2).createCell(2).setCellValue("600000");
        //  Create a cell on the 4th row 3rd cell(index2), and write data.
        sheet1.getRow(3).createCell(2).setCellValue("800000");
        //  Write and save the workbook.
        FileOutputStream fos = new FileOutputStream(filePath);
        wb.write(fos);
        //  Close the file.
        fis.close();
        fos.close();
        //  Close the workbook.
        wb.close();
* */




}
