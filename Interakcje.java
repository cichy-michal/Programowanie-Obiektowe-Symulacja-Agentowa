package symulacjaAgentowa;

import java.util.Random;

public class Interakcje {
    public Interakcje(boolean decyzja) {
        this.decyzja = decyzja;
    }

    private final Integer [][] pozycje = new Integer[20][2];
    private final Integer [] rozwoj = new Integer[5];
    private final Integer [] obronnosc = new Integer[20];
    private final Integer [] uszkodzenie = new Integer[20];
    private final Integer[][] planety = new Integer[5][2];
    private boolean decyzja;
    private int id;
    public void pobierzPozycje(int pozycjasb11X,int pozycjasb11Y,int pozycjasb12X,int pozycjasb12Y,
                                   int pozycjasp11X,int pozycjasp11Y,int pozycjasp12X,int pozycjasp12Y,
                                   int pozycjasb21X,int pozycjasb21Y,int pozycjasb22X,int pozycjasb22Y,
                                   int pozycjasp21X,int pozycjasp21Y,int pozycjasp22X,int pozycjasp22Y,
                                   int pozycjasb31X,int pozycjasb31Y,int pozycjasb32X,int pozycjasb32Y,
                                   int pozycjasp31X,int pozycjasp31Y,int pozycjasp32X,int pozycjasp32Y,
                                   int pozycjasb41X,int pozycjasb41Y,int pozycjasb42X,int pozycjasb42Y,
                                   int pozycjasp41X,int pozycjasp41Y,int pozycjasp42X,int pozycjasp42Y,
                                   int pozycjasb51X,int pozycjasb51Y,int pozycjasb52X,int pozycjasb52Y,
                                   int pozycjasp51X,int pozycjasp51Y,int pozycjasp52X,int pozycjasp52Y){
        pozycje[0][0] = pozycjasb11X; pozycje[0][1] = pozycjasb11Y;
        pozycje[1][0] = pozycjasb12X; pozycje[1][1] = pozycjasb12Y;
        pozycje[2][0] = pozycjasp11X; pozycje[2][1] = pozycjasp11Y;
        pozycje[3][0] = pozycjasp12X; pozycje[3][1] = pozycjasp12Y;

        pozycje[4][0] = pozycjasb21X; pozycje[4][1] = pozycjasb21Y;
        pozycje[5][0] = pozycjasb22X; pozycje[5][1] = pozycjasb22Y;
        pozycje[6][0] = pozycjasp21X; pozycje[6][1] = pozycjasp21Y;
        pozycje[7][0] = pozycjasp22X; pozycje[7][1] = pozycjasp22Y;

        pozycje[8][0] = pozycjasb31X; pozycje[8][1] = pozycjasb31Y;
        pozycje[9][0] = pozycjasb32X; pozycje[9][1] = pozycjasb32Y;
        pozycje[10][0] = pozycjasp31X; pozycje[10][1] = pozycjasp31Y;
        pozycje[11][0] = pozycjasp32X; pozycje[11][1] = pozycjasp32Y;

        pozycje[12][0] = pozycjasb41X; pozycje[12][1] = pozycjasb41Y;
        pozycje[13][0] = pozycjasb42X; pozycje[13][1] = pozycjasb42Y;
        pozycje[14][0] = pozycjasp41X; pozycje[14][1] = pozycjasp41Y;
        pozycje[15][0] = pozycjasp42X; pozycje[15][1] = pozycjasp42Y;

        pozycje[16][0] = pozycjasb51X; pozycje[16][1] = pozycjasb51Y;
        pozycje[17][0] = pozycjasb52X; pozycje[17][1] = pozycjasb52Y;
        pozycje[18][0] = pozycjasp51X; pozycje[18][1] = pozycjasp51Y;
        pozycje[19][0] = pozycjasp52X; pozycje[19][1] = pozycjasp52Y;
    }
    public void pobierzRozwoj(int rozwoj1,int rozwoj2,int rozwoj3,int rozwoj4,int rozwoj5) {
        rozwoj[0] = rozwoj1; rozwoj[1] = rozwoj2; rozwoj[2] = rozwoj3; rozwoj[3] = rozwoj4; rozwoj[4] = rozwoj5;
    }
    public void pobierzObronnosc(int obrona1,int obrona2,int obrona3,int obrona4,int obrona5,int obrona6,int obrona7,
                                 int obrona8,int obrona9,int obrona10,int obrona11,int obrona12,int obrona13,int obrona14,
                                 int obrona15,int obrona16,int obrona17,int obrona18,int obrona19,int obrona20) {
        obronnosc[0] = obrona1; obronnosc[1] = obrona2; obronnosc[2] = obrona3; obronnosc[3] = obrona4;
        obronnosc[4] = obrona5; obronnosc[5] = obrona6; obronnosc[6] = obrona7; obronnosc[7] = obrona8;
        obronnosc[8] = obrona9; obronnosc[9] = obrona10; obronnosc[10] = obrona11; obronnosc[11] = obrona12;
        obronnosc[12] = obrona13; obronnosc[13] = obrona14; obronnosc[14] = obrona15; obronnosc[15] = obrona16;
        obronnosc[16] = obrona17; obronnosc[17] = obrona18; obronnosc[18] = obrona19; obronnosc[19] = obrona20;
    }
    public void pobierzUszkodzenie(int uszkodzenie1,int uszkodzenie2,int uszkodzenie3,int uszkodzenie4,int uszkodzenie5, int uszkodzenie6,int uszkodzenie7,
                                 int uszkodzenie8,int uszkodzenie9,int uszkodzenie10,int uszkodzenie11,int uszkodzenie12,int uszkodzenie13,int uszkodzenie14,
                                 int uszkodzenie15,int uszkodzenie16,int uszkodzenie17,int uszkodzenie18,int uszkodzenie19,int uszkodzenie20) {
        uszkodzenie[0] = uszkodzenie1; uszkodzenie[1] = uszkodzenie2; uszkodzenie[2] = uszkodzenie3; uszkodzenie[3] = uszkodzenie4;
        uszkodzenie[4] = uszkodzenie5; uszkodzenie[5] = uszkodzenie6; uszkodzenie[6] = uszkodzenie7; uszkodzenie[7] = uszkodzenie8;
        uszkodzenie[8] = uszkodzenie9; uszkodzenie[9] = uszkodzenie10; uszkodzenie[10] = uszkodzenie11; uszkodzenie[11] = uszkodzenie12;
        uszkodzenie[12] = uszkodzenie13; uszkodzenie[13] = uszkodzenie14; uszkodzenie[14] = uszkodzenie15; uszkodzenie[15] = uszkodzenie16;
        uszkodzenie[16] = uszkodzenie17; uszkodzenie[17] = uszkodzenie18; uszkodzenie[18] = uszkodzenie19; uszkodzenie[19] = uszkodzenie20;
    }
    public void pobierzPozycjePlanet(int pozycjaX1,int pozycjaY1,int pozycjaX2,int pozycjaY2,int pozycjaX3,
                                     int pozycjaY3,int pozycjaX4,int pozycjaY4,int pozycjaX5,int pozycjaY5) {
        planety[0][0] = pozycjaX1; planety[0][1] = pozycjaY1;
        planety[1][0] = pozycjaX2; planety[1][1] = pozycjaY2;
        planety[2][0] = pozycjaX3; planety[2][1] = pozycjaY3;
        planety[3][0] = pozycjaX4; planety[3][1] = pozycjaY4;
        planety[4][0] = pozycjaX5; planety[4][1] = pozycjaY5;

    }
    public void podjecieDecyzji(int statekA,int rozwojA, int obronnoscA, int statekB, Integer[] rozwojB, Integer[] obronnoscB,
                               int uszkodzenieA, Integer[] uszkodzenieB){
        Random random = new Random();
        int obiekt1 = (rozwojA  * obronnoscA * 100) * uszkodzenieA;
        int indeks = 0;
        switch(statekB) {
            case 4,5,6,7 -> indeks = 1;
            case 8,9,10,11 -> indeks = 2;
            case 12,13,14,15 -> indeks = 3;
            case 16,17,18,19 -> indeks = 4;
        }
        int obiekt2 = (rozwojB[indeks]  * obronnoscB[statekB] * 100) * uszkodzenieB[statekB];
        if(obiekt1 < obiekt2) decyzja = true;
        else if(obiekt1 == obiekt2) {
            decyzja = random.nextInt(2) == 1;
        }
        else decyzja = false;
        id = statekB;
        if(decyzja) System.out.println("Statek nr."+ statekA +" przegral walke!");
    }
    public void szukanieInterakcji(int pozycjaX,int pozycjaY,int rozwojA,int obronnoscA,int ktory,
                                   int uszkodzenie1,boolean czyUsuniety){
        if(!czyUsuniety) {
            for (int i = 0; i < 5; i++) {
                if (pozycjaX == planety[i][0] && pozycjaY == planety[i][1]) {
                    int indeks1 = 0;
                    switch (ktory) {
                        case 5, 6, 7, 8 -> indeks1 = 1;
                        case 9, 10, 11, 12 -> indeks1 = 2;
                        case 13, 14, 15, 16 -> indeks1 = 3;
                        case 17, 18, 19, 20 -> indeks1 = 4;
                    }
                    if (indeks1 != i) {
                        decyzja = true;
                        id = 50;
                        System.out.println("Statek nr." + ktory + " zostal zestrzelony przez obywateli jednej z planet!");
                        break;
                    }
                }
            }
            if (!decyzja) {
                for (int i = 0; i < 20; i++) {
                    if (pozycjaX == pozycje[i][0] && pozycjaY == pozycje[i][1]) {
                        int indeks1 = 0;
                        switch (ktory) {
                            case 5, 6, 7, 8 -> indeks1 = 1;
                            case 9, 10, 11, 12 -> indeks1 = 2;
                            case 13, 14, 15, 16 -> indeks1 = 3;
                            case 17, 18, 19, 20 -> indeks1 = 4;
                        }
                        int indeks2 = 0;
                        switch (i) {
                            case 4, 5, 6, 7 -> indeks2 = 1;
                            case 8, 9, 10, 11 -> indeks2 = 2;
                            case 12, 13, 14, 15 -> indeks2 = 3;
                            case 16, 17, 18, 19 -> indeks2 = 4;
                        }
                        if (indeks1 != indeks2) {
                            podjecieDecyzji(ktory, rozwojA, obronnoscA, i, rozwoj, obronnosc, uszkodzenie1, uszkodzenie);
                        }
                    }
                }
            }
        }
    }
    public void ustawDecyzje(boolean decyzja) {
        this.decyzja = decyzja;
    }
    public boolean wyslijDecyzje() {
        return decyzja;
    }

    public int wyslijIndeks() {
        return id;
    }
}