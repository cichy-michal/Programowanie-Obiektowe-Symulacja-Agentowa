package symulacjaAgentowa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Czasoprzestrzen {
    public Czasoprzestrzen(int wielkoscPrzestrzeni, int czas) {
        this.wielkoscPrzestrzeni = wielkoscPrzestrzeni;
        this.czas = czas;
    }

    private int wielkoscPrzestrzeni;
    private int czas;
    private String[][] wspolrzedne;

    public void wprowadzanieWielkosciPrzestrzeni(int wielkoscPrzestrzeni) {
        int licznik = 0;
        while (wielkoscPrzestrzeni < 1) {
            if (licznik > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz");
            try {
                System.out.println("Wprowadz wielkosc przestrzeni:");
                Scanner scanner = new Scanner(System.in);
                licznik++;
                wielkoscPrzestrzeni = scanner.nextInt();
            } catch (InputMismatchException ignored) {
            }
        }
        this.wielkoscPrzestrzeni = wielkoscPrzestrzeni;
    }

    public int wyslijWielkoscPrzestrzeni() {
        return wielkoscPrzestrzeni;
    }

    public void sterowanieCzasem(int czas) {
        czas++;
        this.czas = czas;
    }

    public void ustawCzas(int czas) {
        this.czas = czas;
    }

    public int wyslijCzas() {
        return czas;
    }

    public void generujMape(int wielkoscPrzestrzeni) {
        wspolrzedne = new String[wielkoscPrzestrzeni][wielkoscPrzestrzeni];
        for (int i = 0; i < wielkoscPrzestrzeni; i++) {
            for (int j = 0; j < wielkoscPrzestrzeni; j++) {
                wspolrzedne[i][j] = "_\t";
            }
        }
    }

    public void oznaczenieWspolrzednych(int pozycjaPlanetyX, int pozycjaPlanetyY,
                                        int pozycjaStatkuX, int pozycjaStatkuY, int ktory) {
        if(pozycjaStatkuX > 0 && pozycjaStatkuY > 0) {
            pozycjaStatkuX -= 1;
            pozycjaStatkuY -= 1;
            wspolrzedne[pozycjaStatkuX][pozycjaStatkuY] = ktory + "\t";
        }
                pozycjaPlanetyX -= 1;
                pozycjaPlanetyY -= 1;
                switch (ktory) {
                    case 1 -> wspolrzedne[pozycjaPlanetyX][pozycjaPlanetyY] = "A\t";
                    case 5 -> wspolrzedne[pozycjaPlanetyX][pozycjaPlanetyY] = "B\t";
                    case 9 -> wspolrzedne[pozycjaPlanetyX][pozycjaPlanetyY] = "C\t";
                    case 13 -> wspolrzedne[pozycjaPlanetyX][pozycjaPlanetyY] = "D\t";
                    case 17 -> wspolrzedne[pozycjaPlanetyX][pozycjaPlanetyY] = "E\t";
                }
    }
    public void wyswietlMape(int wielkoscPrzestrzeni) {
        for (int i=0; i<wielkoscPrzestrzeni;i++) {
            for (int j=0; j<wielkoscPrzestrzeni;j++) {
                System.out.print(wspolrzedne[j][i]);
            }
            System.out.println();
        }
    }
}