package Day12.HomeWork;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.*/

/*Excel dosyasını kaynaklar klasörüne ekleyin.
 Dosyayı aç. Dosya giriş akışını kullanarak çalışma kitabını açın.
  İlk çalışma sayfasını açın. İlk sıraya git.
  İlk satırdaki ilk hücreye gidin ve yazdırın.
  İlk satırdaki ikinci hücreye gidin ve yazdırın.
  2. sıradaki ilk hücreye gidin ve verilerin Rusya'ya eşit olup olmadığını onaylayın.
  3. sıra 2. hücre zincirine gidin, sıra ve hücre. Kullanılan satır sayısını bulun.
  Ülke, alan anahtar değeri çiftlerini harita nesnesi olarak yazdırın.
 */
   @Test
   public void test1() throws IOException {
       String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
       FileInputStream fis = new FileInputStream(path);
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sheet = wb.getSheetAt(0);
       System.out.println("sheet = " + sheet);
       Row row1 = sheet.getRow(0);
       System.out.println("row1 = " + row1);
       Cell cell = row1.getCell(0);
       String cellValue = cell.toString();
       System.out.println("cellValue = " + cellValue);
       Row row2 = sheet.getRow(1);
       System.out.println("row2 = " + row2);
       Cell cell2 = row2.getCell(0);
       String cellValue2 = cell2.toString();
       System.out.println("cellValue2 = " + cellValue2);
       Row row3 = sheet.getRow(2);
       System.out.println("row3 = " + row3);
       Cell cell3 = row3.getCell(1);
       String cellValue3 = cell3.toString();
       System.out.println("cellValue3 = " + cellValue3);
       int satırsayisi=sheet.getLastRowNum();
       System.out.println("satırsayisi = " + satırsayisi);
       int sutunsayisi=sheet.getRow(0).getLastCellNum();
       System.out.println("sutunsayisi = " + sutunsayisi);
       Map<String, String> map = new HashMap<>();
       String arr[][]=new String[satırsayisi+1][sutunsayisi+1];
       for (int i = 0; i < satırsayisi; i++) {
           for (int j = 0; j < sutunsayisi; j++) {
               arr[i][j]=sheet.getRow(i).getCell(j).toString();
               System.out.println("arr[i][j] = " + arr[i][j]);
           }
       }
/*  //workbook(excel) > worksheet(sheet) > row > cell
@Test
    public void readExcel() throws IOException {
    String filePath = ".\\src\\test\\java\\tests\\resources\\excelfile.xlsx";
    //Open the file.
    FileInputStream fis = new FileInputStream(filePath);
    //Open the workbook using file input stream.
    Workbook wb = WorkbookFactory.create(fis);
    //Open the first worksheet.
    Sheet sheet = wb.getSheetAt(0);
    //Go to first row.
    Row row1 = sheet.getRow(0);
    //Go to first cell on that first row and print.
    Cell cell1 = row1.getCell(0);
    System.out.println("cell1 = " + cell1);
    System.out.println("cell1-toString = " + cell1.toString());
    //Go to second cell on that first row and print.
    Cell cell2 = row1.getCell(1);
    System.out.println("cell2 = " + cell2);
    //Go to 2nd row first cell and assert if the data equal to Russia.
    String row2cell1 = sheet.getRow(1).getCell(0).toString();
    System.out.println("row2cell1 = " + row2cell1);
    Assert.assertEquals("Rusya", row2cell1);
    //Go to 3rd row 2nd cell-chain the row and cell.
    String row3cell2 = sheet.getRow(2).getCell(1).toString();
    System.out.println("row3cell2 = " + row3cell2);
    //Find the number of used row.
    int numberOfRow = sheet.getLastRowNum() + 1;
    System.out.println("numberOfRow = " + numberOfRow);
    //Print country, area key value pairs as map object.
    HashMap <String,String > countryAreas = new HashMap<>();
    for (int i = 1; i < numberOfRow; i++) {  //i :satir
        String countries = sheet.getRow(i).getCell(0).toString();
        //key i. satirdaki 1 indexindeki datalari alacak
        //System.out.println(i + ".satir " + countries);

        String areas = sheet.getRow(i).getCell(1).toString();
        //value i.satirdaki 2.indexdeki datalari alacak
        //System.out.println(i+ " .satir " + areas);

        countryAreas.put(countries,areas);
    }
    System.out.println("countryAreas = " + countryAreas);
    System.out.println("getData(3,2) = " + getData(3, 1));
    //olmayan sutunu yazmaz ona dikkat etmek gerek :)
}
public static String getData(int satirIndex, int sutunIndex) throws IOException {
    String istenenData= "";
    String filePath  = ".\\src\\test\\java\\tests\\resources\\excelfile.xlsx";
    FileInputStream fis = new FileInputStream(filePath);
    Workbook wb = WorkbookFactory.create(fis);
    istenenData = wb.getSheet("Sayfa1").
            getRow(satirIndex).
            getCell(sutunIndex).toString();
    return istenenData;
    }



 */
               }
           }


