package havayoluProje;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class personel extends havayoluProje.yönetici {

    //Personel adını girdiğinde sefer ekranında basmasını sağlar
    public static void seferYazdir() {

        JFrame frame = new JFrame("Personel sefer");

        JOptionPane.showMessageDialog(frame, perSeferr);


        frame.setSize(800,300);
        frame.setLayout(null);
        frame.setVisible(true);

    }




}
