package havayoluProje;


import java.io.InterruptedIOException;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner.ListEditor;

import org.w3c.dom.ls.LSOutput;

public class yönetici  {


    //Seferler için oluşturulan tabloda kullanılacak başlık kısmı
    String[] seferBaslik = {"Şehirler","Saat","Pilot","Hostes","UcakFirması","Uçak-Tipi","seferNO"};
    //Seferlerin dizisi
    static String [][] sefer  = {{"Elazığ-Gaziantep","17.00-17.45","Pilot Mete","Hostes Ebru","Qatar","QTR5","156"},
            {"Antalya-Ankara","08.00-09.30","Pilot Taner","Hostes Emma","THY","THY67-5","56"},
            {"Samsun-Antalya","15.00-16.10","Pilot Ebubekir", "Hostes Sıdıka","AirFrance","AirF15","27"},
            {"İstanbul-Elazığ","10.00-11.30","Pilot Abdurrezzak","Hostes Merve","SunExpress","SE145","80"},
    };

    String nereye;
    String saat;
    String pilot;
    String hostes;
    String havaYolu;
    String uçak;
    String seferNo;

    // ileride index'e atama yaparken kullanılacak değişken
    static int k = sefer.length;
    String liste;
    String seferr=null ;
    static String perSeferr;

    public yönetici() {}

    //Sefer eklemede kullanılan constructor
    public yönetici(String nereye,String saat,String pilot,String hostes,String havaYolu,String uçak,String seferNo) {

        this.nereye = nereye;
        this.saat= saat;
        this.pilot = pilot;
        this.hostes = hostes;
        this.havaYolu = havaYolu;
        this.uçak=uçak;
        this.seferNo=seferNo;


    }
    //Her seferinde sefer eklendiğinde kullanılacak olan yeni dizi
    public String[][] diziBoyutArttır(int index) {

        String [][] sefer2 = new String[index][7];

        for(int i = 0 ;i<sefer.length;i++) {

            for(int j = 0 ; j<7 ; j++) {

                sefer2[i][j] = sefer[i][j];

            }

        }

        System.out.println(sefer2);
        System.out.println(sefer2.length);
        return sefer2;
    }

    //Burada sefer atama işi yapılıyor
    public void seferAta() {

        k+=1;
        sefer = diziBoyutArttır(k);

//		System.out.println(sefer);
//		System.out.println(seferNo.length());
//		System.out.println();

        k-=1;

        sefer[k][0]=this.nereye;
        sefer[k][1]=this.saat;
        sefer[k][2]=this.pilot;
        sefer[k][3]=this.hostes;
        sefer[k][4]=this.havaYolu;
        sefer[k][5]=this.uçak;
        sefer[k][6]=this.seferNo;

        seferYazdirYönetici();
    }

    //Burada personel için kullanılan ada göre hangi sefer olduğuna bakılır
    public void personelSeferAta(String ad) {

        for(int i = 0 ; i< sefer.length ; i++) {
            for(int j = 0 ;j<sefer[0].length;j++) {
                if(sefer[i][j].equals(ad)) {

                    for(int k = 0 ; k<sefer[0].length ;k++ ) {

                        seferr +=sefer[i][k];

                    }

                }

            }

        }

        perSeferr = seferr;

    }

    //Seferlerin yönetici panelinde yazılmasını sağlar
    public  String seferYazdirYönetici() {

        for(int i = 0 ; i< sefer.length; i++) {

            for(int j = 0 ; j<sefer[0].length;j++) {

                liste += sefer[i][j];
                liste+=" ";

            }
            liste += '\n';

        }
        System.out.println(liste);
        return liste;
    }


}
