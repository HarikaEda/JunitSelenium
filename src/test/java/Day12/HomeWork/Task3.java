package Day12.HomeWork;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
   /*Create an object of File class to open xlsx file.
Create an object of FileInputStream class to read excel file.
Create an object of FileInputStream class to read excel file.
Creating workbook instance that refers to .xlsx file.
Creating a Sheet object.
Get all rows in the sheet.
Create a row object to retrieve row at index 3.
Create a cell object to enter value in it using cell Index.
Write the data in excel using output stream.*/
/*xlsx dosyasını açmak için File sınıfından bir nesne oluşturun.
 Excel dosyasını okumak için FileInputStream sınıfından bir nesne oluşturun.
  Excel dosyasını okumak için FileInputStream sınıfından bir nesne oluşturun.
   .xlsx dosyasına başvuran çalışma kitabı örneği oluşturma.
   Sayfa nesnesi oluşturma. Sayfadaki tüm satırları alın.
    Dizin 3'teki satırı almak için bir satır nesnesi oluşturun.
     Hücre Dizini'ni kullanarak değer girmek için bir hücre nesnesi oluşturun.
      Çıkış akışını kullanarak verileri Excel'de yazın
 */
    @Test
    public void task3() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet newSheet = wb.createSheet("");
        Row row1 = newSheet.createRow(0);








    }



}
