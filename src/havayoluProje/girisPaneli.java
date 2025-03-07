package havayoluProje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class girisPaneli extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    girisPaneli frame = new girisPaneli();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public girisPaneli() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(208, 213, 212));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        //Yönetici giriş paneli bloğu
        JButton btnNewButton = new JButton("Yönetici");
        btnNewButton.setBounds(40, 67, 107, 45);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Yönetici paneli") ;

                JButton btn1 = new JButton("Uçuşların Listesi");
                btn1.setBounds(30,10,300,30);
                btn1.addActionListener(new ActionListener() {



                    yönetici yonYönetici = new yönetici();
                    public void actionPerformed(ActionEvent e) {

                        //Sefer listesinde seferlerin görüntülenmesini sağlar

                        JFrame frame = new JFrame("Seferlerin Listesi");

                        JTable table = new JTable(yonYönetici.sefer,yonYönetici.seferBaslik);
                        table.setBounds(10,10,1200,800);
                        JScrollPane sp = new JScrollPane(table);

                        frame.getContentPane().add(sp);
                        frame.setSize(1300,900);
                        frame.setVisible(true);

                    }
                });



                JButton btn2 = new JButton("Sefer Oluştur");
                btn2.setBounds(30,50,300,30);
                btn2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // sefer oluşturma işlemi için kullanılan kısım

                        JFrame frame = new JFrame("Bilgi Girme paneli");

                        JLabel label1 = new JLabel("Sefer nereye yapılacak?");
                        label1.setBounds(30,10,200,30);
                        JTextField field1 = new JTextField();
                        field1.setBounds(30,50,200,30);

                        JLabel label2 = new JLabel("Saat giriniz.(kalkış-iniş)");
                        label2.setBounds(30,90,200,30);
                        JTextField field2 = new JTextField();
                        field2.setBounds(30,130,200,30);

                        JLabel label3 = new JLabel("Pilotun kim olacağını giriniz.");
                        label3.setBounds(30,170,200,30);
                        JTextField field3 = new JTextField();
                        field3.setBounds(30,210,200,30);

                        JLabel label4 = new JLabel("Hostesin kim olacağını giriniz.");
                        label4.setBounds(30,250,200,30);
                        JTextField field4 = new JTextField();
                        field4.setBounds(30,290,200,30);

                        JLabel label5 = new JLabel("Hava Yolu Şirketinin adını giriniz.");
                        label5.setBounds(30,330,200,30);
                        JTextField field5 = new JTextField();
                        field5.setBounds(30,370,200,30);

                        JLabel label6 = new JLabel("Uçuş yapacak uçağın numarasını giriniz.");
                        label6.setBounds(30,410,200,30);
                        JTextField field6 = new JTextField();
                        field6.setBounds(30,450,200,30);

                        JLabel label7 = new JLabel("seferNo giriniz.");
                        label7.setBounds(30,490,200,30);
                        JTextField field7 = new JTextField();
                        field7.setBounds(30,530,200,30);

                        JButton btn = new JButton("Sefer Ekle: ");
                        btn.setBounds(30,570,100,30);
                        btn.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                yönetici yonYönetici = new yönetici(field1.getText(),field2.getText(),field3.getText(),field4.getText(),field5.getText(),field6.getText(),field7.getText());
                                yonYönetici.seferAta();

                            }
                        });



                        frame.getContentPane().add(label1);
                        frame.getContentPane().add(field1);
                        frame.getContentPane().add(label2);
                        frame.getContentPane().add(field2);
                        frame.getContentPane().add(label3);
                        frame.getContentPane().add(field3);
                        frame.getContentPane().add(label4);
                        frame.getContentPane().add(field4);
                        frame.getContentPane().add(label5);
                        frame.getContentPane().add(field5);
                        frame.getContentPane().add(label6);
                        frame.getContentPane().add(field6);
                        frame.getContentPane().add(label7);
                        frame.getContentPane().add(field7);
                        frame.getContentPane().add(btn);
                        frame.setSize(700,700);
                        frame.getContentPane().setLayout(null);
                        frame.setVisible(true);

                    }
                });


                //Personel için oluşturulan kod bloğu

                JButton btn3 = new JButton("Personel sefer Listesi :");
                btn3.setBounds(30,90,300,30);
                btn3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame frame = new JFrame("Personel-sefer kontrol");

                        JLabel label1 = new JLabel("Unvan ile birlikte ad giriniz");
                        label1.setBounds(30,10,200,30);
                        JTextField field1 = new JTextField();
                        field1.setBounds(30,50,200,30);

                        JButton buton = new JButton("Ara");
                        buton.setBounds(30,90,100,30);

                        frame.getContentPane().add(label1);
                        frame.getContentPane().add(field1);
                        frame.getContentPane().add(buton);

                        buton.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                yönetici yonYönetici = new yönetici();
                                String deger=field1.getText();
                                yonYönetici.personelSeferAta(deger);
                                personel.seferYazdir();


                            }
                        });

                        frame.setSize(500,500);
                        frame.getContentPane().setLayout(null);
                        frame.setVisible(true);

                    }
                });


                frame.getContentPane().add(btn1);
                frame.getContentPane().add(btn2);
                frame.getContentPane().add(btn3);

                frame.setSize(400,400);
                frame.getContentPane().setLayout(null);
                frame.setVisible(true);

            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBackground(new Color(41, 220, 9));

        JButton btnNewButton_1 = new JButton("Personel");
        btnNewButton_1.setBounds(157, 67, 116, 45);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Personel Girişi");

                JLabel label = new JLabel("Ad Giriniz");
                label.setBounds(50,50,200,30);

                JTextField field = new JTextField();
                field.setBounds(50,90,200,30);

                JLabel label2 = new JLabel("Şifre Giriniz");
                label2.setBounds(50,130,200,30);

                JPasswordField passwordField = new JPasswordField();
                passwordField.setBounds(50,170,200,30);

                JButton btn = new JButton("Giriş");
                btn.setBounds(50,210,200,30);

                btn.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {


                        yönetici yon = new yönetici();
                        String deger = field.getText();
                        yon.personelSeferAta(deger);
                        //Personel için tanımlı seferi ekrana basar
                        personel.seferYazdir();

                    }
                });


                frame.getContentPane().add(label);
                frame.getContentPane().add(field);
                frame.getContentPane().add(label2);
                frame.getContentPane().add(passwordField);
                frame.getContentPane().add(btn);
                frame.setSize(600,300);
                frame.getContentPane().setLayout(null);
                frame.setVisible(true);

            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton_1.setBackground(new Color(41, 220, 9));


        //Kullanıcı için oluşturulan kod bloğu
        JButton btnNewButton_2 = new JButton("Yolcu");
        btnNewButton_2.setBounds(283, 67, 125, 45);
        contentPane.add(btnNewButton_2);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Kullanıcı kayıt alanı

                JFrame frame = new JFrame("Yolcu Kayıt paneli");

                JLabel labelName = new JLabel("Adınızı Soyadınızı giriniz");
                labelName.setBounds(40,10,100,30);

                JTextField field = new JTextField();
                field.setBounds(40,50,100,30);

                JLabel labelPassword = new JLabel("Şifrenizi giriniz");
                labelPassword.setBounds(40,90,100,30);

                JPasswordField textPassword = new JPasswordField();
                textPassword.setBounds(40,130,100,30);

                //Kaydol dedikten sonra açılacak olan uçuş seçim alanı

                JButton btn = new JButton("Kaydol");
                btn.setBounds(40,170,100,30);

                btn.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        yönetici yonYönetici = new yönetici();


                        //
                        String nameString = field.getText();//Bu yönetici içinde kullanılacak

                        //

                        String  sefer1 = yonYönetici.sefer[0][0] +" | "+yonYönetici.sefer[0][1] +" | "+yonYönetici.sefer[0][2] +" | "+yonYönetici.sefer[0][3] +" | "+yonYönetici.sefer[0][4] +" | "+yonYönetici.sefer[0][5];
                        String  sefer2 = yonYönetici.sefer[1][0] +" | "+yonYönetici.sefer[1][1] +" | "+yonYönetici.sefer[1][2] +" | "+yonYönetici.sefer[1][3] +" | "+yonYönetici.sefer[1][4] +" | "+yonYönetici.sefer[1][5];
                        String  sefer3 = yonYönetici.sefer[2][0] +" | "+yonYönetici.sefer[2][1] +" | "+yonYönetici.sefer[2][2] +" | "+yonYönetici.sefer[2][3] +" | "+yonYönetici.sefer[2][4] +" | "+yonYönetici.sefer[2][5];
                        String  sefer4 = yonYönetici.sefer[3][0] +" | "+yonYönetici.sefer[3][1] +" | "+yonYönetici.sefer[3][2] +" | "+yonYönetici.sefer[3][3] +" | "+yonYönetici.sefer[3][4] +" | "+yonYönetici.sefer[3][5];


                        //Bilet satın alma ekranı

                        JFrame frame = new JFrame("Bilet Ekranı");
                        //Seçilen birinci sefer için kullanılan alan
                        JButton btn1 = new JButton(sefer1);
                        btn1.setBounds(20,20,500,30);

                        btn1.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                havayoluProje.havaYoluSirketi havaYolu = new havayoluProje.havaYoluSirketi();

                                //Koltuk seçme ekranı her biri için ayrı tanımlanacak

                                JFrame frame = new JFrame("Koltuk seçim ekranı");

                                JButton btn1 = new JButton("Sağ Cam");
                                btn1.setBounds(425,50,130,30);
                                btn1.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);


                                    }
                                });

                                JButton btn2 = new JButton("Sağ Koridor");
                                btn2.setBounds(295,50,130,30);
                                btn2.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });

                                JButton btn3 = new JButton("Sol Koridor");
                                btn3.setBounds(165,50,130,30);
                                btn3.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });


                                JButton btn4 = new JButton("Sol Cam");
                                btn4.setBounds(35,50,130,30);
                                btn4.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                        havaYolu.koltukAzalt(btn4.getText());
                                    }
                                });

                                JButton btn5 = new JButton("Vip Sağ Cam");
                                btn5.setBounds(425,10,130,30);
                                btn5.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });

                                JButton btn6 = new JButton("Vip Sağ Koridor");
                                btn6.setBounds(295,10,130,30);
                                btn6.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });

                                JButton btn7 = new JButton("Vip Sol Cam");
                                btn7.setBounds(35,10,130,30);
                                btn7.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });

                                JButton btn8 = new JButton("Vip Sol Koridor");
                                btn8.setBounds(165,10,130,30);
                                btn8.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[0][3]);
                                    }
                                });


                                frame.getContentPane().add(btn1);
                                frame.getContentPane().add(btn2);
                                frame.getContentPane().add(btn3);
                                frame.getContentPane().add(btn4);
                                frame.getContentPane().add(btn5);
                                frame.getContentPane().add(btn6);
                                frame.getContentPane().add(btn7);
                                frame.getContentPane().add(btn8);
                                frame.setSize(600,400);
                                frame.getContentPane().setLayout(null);
                                frame.setVisible(true);



                            }
                        });

                        //Seçilen ikinci sefer için kullanılan alan
                        JButton btn2 = new JButton(sefer2);
                        btn2.setBounds(20,60,500,30);
                        btn2.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                havayoluProje.havaYoluSirketi havaYolu = new havayoluProje.havaYoluSirketi();

                                JFrame frame = new JFrame("Koltuk seçme");

                                JButton btn1 = new JButton("Sağ Cam");
                                btn1.setBounds(425,50,130,30);
                                btn1.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn2 = new JButton("Sağ Koridor");
                                btn2.setBounds(295,50,130,30);
                                btn2.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn3 = new JButton("Sol Koridor");
                                btn3.setBounds(165,50,130,30);
                                btn3.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });


                                JButton btn4 = new JButton("Sol Cam");
                                btn4.setBounds(35,50,130,30);
                                btn4.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn5 = new JButton("Vip Sağ Cam");
                                btn5.setBounds(425,10,130,30);
                                btn5.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn6 = new JButton("Vip Sağ Koridor");
                                btn6.setBounds(295,10,130,30);
                                btn6.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn7 = new JButton("Vip Sol Cam");
                                btn7.setBounds(35,10,130,30);
                                btn7.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });

                                JButton btn8 = new JButton("Vip Sol Koridor");
                                btn8.setBounds(165,10,130,30);
                                btn8.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[1][3]);
                                    }
                                });


                                frame.getContentPane().add(btn1);
                                frame.getContentPane().add(btn2);
                                frame.getContentPane().add(btn3);
                                frame.getContentPane().add(btn4);
                                frame.getContentPane().add(btn5);
                                frame.getContentPane().add(btn6);
                                frame.getContentPane().add(btn7);
                                frame.getContentPane().add(btn8);
                                frame.setSize(600,400);
                                frame.getContentPane().setLayout(null);
                                frame.setVisible(true);



                            }
                        });
                        //seçilen sefer için kullanılan buton										//BURADA KALDIN
                        JButton btn3 = new JButton(sefer3);
                        btn3.setBounds(20,100,500,30);
                        btn3.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                havayoluProje.havaYoluSirketi havaYolu = new havayoluProje.havaYoluSirketi();

                                JFrame frame = new JFrame("Koltuk seçme");

                                JButton btn1 = new JButton("Sağ Cam");
                                btn1.setBounds(425,50,130,30);
                                btn1.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn2 = new JButton("Sağ Koridor");
                                btn2.setBounds(295,50,130,30);
                                btn2.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn3 = new JButton("Sol Koridor");
                                btn3.setBounds(165,50,130,30);
                                btn3.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });


                                JButton btn4 = new JButton("Sol Cam");
                                btn4.setBounds(35,50,130,30);
                                btn4.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn5 = new JButton("Vip Sağ Cam");
                                btn5.setBounds(425,10,130,30);
                                btn5.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn6 = new JButton("Vip Sağ Koridor");
                                btn6.setBounds(295,10,130,30);
                                btn6.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn7 = new JButton("Vip Sol Cam");
                                btn7.setBounds(35,10,130,30);
                                btn7.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });

                                JButton btn8 = new JButton("Vip Sol Koridor");
                                btn8.setBounds(165,10,130,30);
                                btn8.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[2][3]);
                                    }
                                });


                                frame.getContentPane().add(btn1);
                                frame.getContentPane().add(btn2);
                                frame.getContentPane().add(btn3);
                                frame.getContentPane().add(btn4);
                                frame.getContentPane().add(btn5);
                                frame.getContentPane().add(btn6);
                                frame.getContentPane().add(btn7);
                                frame.getContentPane().add(btn8);
                                frame.setSize(600,400);
                                frame.getContentPane().setLayout(null);
                                frame.setVisible(true);



                            }
                        });

                        JButton btn4 = new JButton(sefer4);
                        btn4.setBounds(20,140,500,30);

                        btn4.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                havayoluProje.havaYoluSirketi havaYolu = new havayoluProje.havaYoluSirketi();

                                JFrame frame = new JFrame("Koltuk seçme");

                                JButton btn1 = new JButton("Sağ Cam");
                                btn1.setBounds(425,50,130,30);
                                btn1.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn2 = new JButton("Sağ Koridor");
                                btn2.setBounds(295,50,130,30);
                                btn2.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn3 = new JButton("Sol Koridor");
                                btn3.setBounds(165,50,130,30);
                                btn3.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });


                                JButton btn4 = new JButton("Sol Cam");
                                btn4.setBounds(35,50,130,30);
                                btn4.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.stdSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn5 = new JButton("Vip Sağ Cam");
                                btn5.setBounds(425,10,130,30);
                                btn5.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn6 = new JButton("Vip Sağ Koridor");
                                btn6.setBounds(295,10,130,30);
                                btn6.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSagKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn7 = new JButton("Vip Sol Cam");
                                btn7.setBounds(35,10,130,30);
                                btn7.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolCamFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });

                                JButton btn8 = new JButton("Vip Sol Koridor");
                                btn8.setBounds(165,10,130,30);
                                btn8.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JOptionPane.showMessageDialog(frame,"Ödenecek Tutar : "+havaYolu.vipSolKoridorFiyat);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][2]);
                                        yonYönetici.personelSeferAta(yonYönetici.sefer[3][3]);
                                    }
                                });


                                frame.getContentPane().add(btn1);
                                frame.getContentPane().add(btn2);
                                frame.getContentPane().add(btn3);
                                frame.getContentPane().add(btn4);
                                frame.getContentPane().add(btn5);
                                frame.getContentPane().add(btn6);
                                frame.getContentPane().add(btn7);
                                frame.getContentPane().add(btn8);
                                frame.setSize(600,400);
                                frame.getContentPane().setLayout(null);
                                frame.setVisible(true);



                            }
                        });


                        frame.getContentPane().add(btn1);
                        frame.getContentPane().add(btn2);
                        frame.getContentPane().add(btn3);
                        frame.getContentPane().add(btn4);
                        frame.setSize(600,400);
                        frame.getContentPane().setLayout(null);
                        frame.setVisible(true);

                    }
                });

                frame.getContentPane().add(labelName);
                frame.getContentPane().add(field);
                frame.getContentPane().add(labelPassword);
                frame.getContentPane().add(textPassword);
                frame.getContentPane().add(btn);
                frame.setSize(400,400);
                frame.getContentPane().setLayout(null);
                frame.setVisible(true);

            }
        });

        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton_2.setBackground(new Color(41, 220, 9));
    }

}
