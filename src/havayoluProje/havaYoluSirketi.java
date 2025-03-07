package havayoluProje;

public class havaYoluSirketi {


    protected int stdKoltuk = 150;

    protected int stdSagCam = 30;
    protected int stdSagCamFiyat = 200;

    protected int stdSagKoridor = 30;
    protected int stdSagKoridorFiyat = 175;

    protected static int stdSolKoridor = 30;
    protected static int stdSolKoridorFiyat =175;

    protected static int stdSolCam = 30;
    protected static int stdSolCamFiyat= 200;

    protected static int vipKoltuk = 50;

    protected static int vipSagCam = 25;
    protected static int vipSagCamFiyat = 250;

    protected static int vipSagKoridor = 15;
    protected static int vipSagKoridorFiyat= 100;

    protected static int vipSolKoridor = 15;
    protected static int vipSolKoridorFiyat =100;

    protected static int vipSolCam = 25;
    protected static int vipSolCamFiyat= 250;


    //Kullanıcı koltuk bilet satın aldığında azaltma işlemini yapar

    protected void koltukAzalt(String type) {

        if(type.equals("stdSagCam")) {

            stdSagCam--;
            stdKoltuk--;
        }
        else if(type.equals("stdSagKoridor")) {

            stdSagKoridor--;
            stdKoltuk--;
        }
        else if(type.equals("stdSolKoridor")) {

            stdSolKoridor--;
            stdKoltuk--;
        }
        else if(type.equals("stdSolCam")) {

            stdSolCam--;
            stdKoltuk--;

        }	else if(type.equals("vipSagCam")) {

            vipSagCam--;
            vipKoltuk--;

        }	else if(type.equals("vipSagKoridor")) {

            vipSagKoridor--;
            vipKoltuk--;

        }	else if(type.equals("vipSolKoridor")) {

            vipSolKoridor--;
            vipKoltuk--;

        }	else if(type.equals("vipSolCam")) {

            vipSolCam--;
            vipKoltuk--;

        }
    }
}

