package Day11;

import Utilities.Base;
import org.junit.Test;

public class C02_Files {
    //String olarak gelir

            @Test
    public void test() {
     //dosya ayracı windows için ters slaş mac için düz slaş içinde
      String fileSeperator = System.getProperty("file.separator");
      System.out.println("fileSeperator = " + fileSeperator);

      //çalışma ortamı (projenin content rootu)

      String root = System.getProperty("user.dir");//hangi bilgisayarda çalıştırılırsa hata alınması durumunu handle etmiş oluyoruz
      //dosya yolu veriyoruz
      System.out.println("root = " + root);

      //Home path
      String home=System.getProperty("user.home");
      System.out.println("home = " + home);



            }







}
