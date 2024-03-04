public class SureBul {
    public int birinciBul(int[] kosuSuresi) {

        int enDusukIndex = 0;
        int enDusukKosuSuresi =kosuSuresi[0];
        for (int i = 0; i < kosuSuresi.length; i++) {
            if (kosuSuresi[i] < kosuSuresi[enDusukIndex]) {
                enDusukKosuSuresi = kosuSuresi[i];
                enDusukIndex = i;

            }
        }
        return enDusukIndex;

    }

    public int ikinciBul(int[] kosuSuresi) {
        int enDusukSureIndex = birinciBul(kosuSuresi);
        int enKucuk = kosuSuresi[birinciBul(kosuSuresi)];
        int enKucukIndex2 = 0;
        int enDusukKosuSuresi2 = kosuSuresi[0];
        for (int i = 0; i < kosuSuresi.length; i++) {
            if (kosuSuresi[i] > enKucuk && kosuSuresi[i] < kosuSuresi[enKucukIndex2]) {
                enDusukKosuSuresi2 = kosuSuresi[i];
                enKucukIndex2 = i;
            }

        }
        return enKucukIndex2;

    }

    public int ucuncuBul(int[] kosuSuresi) {
        int enKucuk =kosuSuresi[birinciBul(kosuSuresi)];
        int enDusukKosuSuresi2 = kosuSuresi[ikinciBul(kosuSuresi)];
        int enKucukIndex3 = 0;
        int enDusukKosuSuresi3 = kosuSuresi[0];
        for (int i = 0; i < kosuSuresi.length; i++) {
            if (kosuSuresi[i] > enDusukKosuSuresi2 && kosuSuresi[i] < kosuSuresi[enKucukIndex3]) {
                enDusukKosuSuresi3 = kosuSuresi[i];
                enKucukIndex3 = i;

            }
        }
        return enKucukIndex3;

    }

    public void ilkUc(int[] kosuSuresi) {
        String[] isim = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar",
                "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        System.out.println("Birinci " + isim[birinciBul(kosuSuresi)] + " : " + kosuSuresi[birinciBul(kosuSuresi)] + " dk");
        System.out.println("İkinci " + isim[ikinciBul(kosuSuresi)] + " : " + kosuSuresi[ikinciBul(kosuSuresi)] + " dk");
        System.out.println("Üçüncü " + isim[ucuncuBul(kosuSuresi)] + " : " + kosuSuresi[ucuncuBul(kosuSuresi)] + " dk");
    }

    public void siniflandir(int[] Sure) {
        int A = 0, B = 0, C = 0;
        for (int i = 0; i < Sure.length; i++) {
            if( Sure[i] >= 200 && Sure[i] <= 299) {
                A++;
            } else if (Sure[i] >= 300 && Sure[i] <= 399) {
                B++;
            } else if (Sure[i] > 400) {
                C++;
            }
        }
        System.out.println("A -->  " + A);
        System.out.println("B -->  " + B);
        System.out.println("C -->  " + C);
    }


}
