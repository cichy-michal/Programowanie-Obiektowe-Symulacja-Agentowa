package symulacjaAgentowa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cywilizacje {
    public Cywilizacje(int rozwoj, int pozycjaPlanetyX, int pozycjaPlanetyY) {
        this.rozwoj = rozwoj;
        this.pozycjaPlanetyX = pozycjaPlanetyX;
        this.pozycjaPlanetyY = pozycjaPlanetyY;
    }
    private int rozwoj;
    private int pozycjaPlanetyX;
    private int pozycjaPlanetyY;


    public void wprowadzenieRozwoju(int rozwoj) {
        int licznik = 0;
        while(rozwoj < 1 || rozwoj > 3){
            if(licznik > 0) System.out.println("Wprowadzono bledne dane!\nSproboj jeszcze raz\n");
            try {
                System.out.println("Wprowadz poziom rozwoju cywilizacji jako liczbe od 1 do 3:");
                Scanner scanner = new Scanner(System.in);
                rozwoj = scanner.nextInt();
                licznik++;
            }catch(InputMismatchException ignored){}}
        this.rozwoj = rozwoj;
    }
    public void wprowadzeniePozycjiPlanety(int pozycjaPlanetyX, int pozycjaPlanetyY, int wielkoscPrzestrzeni) {
        int licznik1 = 0;
        while(pozycjaPlanetyX < 1 || pozycjaPlanetyX > wielkoscPrzestrzeni){
            if(licznik1 > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz");
            try {
                System.out.println("Wprowadz wspolrzedna x:");
                Scanner scanner = new Scanner(System.in);
                licznik1++;
                pozycjaPlanetyX = scanner.nextInt();
            }catch(InputMismatchException ignored){}}
        int licznik2 = 0;
        while(pozycjaPlanetyY < 1 || pozycjaPlanetyY > wielkoscPrzestrzeni){
            if(licznik2 > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz");
            try {
                System.out.println("Wprowadz wspolrzedna y:");
                Scanner scanner = new Scanner(System.in);
                licznik2++;
                pozycjaPlanetyY = scanner.nextInt();
            }catch(InputMismatchException ignored){}}
        this.pozycjaPlanetyX = pozycjaPlanetyX;
        this.pozycjaPlanetyY = pozycjaPlanetyY;
    }

    public void restartPozycji(int pozycjaPlanetyX,int pozycjaPlanetyY) {
        this.pozycjaPlanetyX = pozycjaPlanetyX;
        this.pozycjaPlanetyY = pozycjaPlanetyY;
    }

    public int wyslijPozycjePlanetyX() {
        return pozycjaPlanetyX;
    }
    public int wyslijPozycjePlanetyY() {
        return pozycjaPlanetyY;
    }
    public int wyslijRozwoj() {
        return rozwoj;
    }
}