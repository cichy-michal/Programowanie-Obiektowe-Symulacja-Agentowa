package symulacjaAgentowa;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Epoka {
    public Epoka(int numerEpoki, int czasTrwania, int liczbaEpok,int liczbaStatkow) {
        this.numerEpoki = numerEpoki;
        this.czasTrwania = czasTrwania;
        this.liczbaEpok = liczbaEpok;
        this.liczbaStatkow = liczbaStatkow;
    }
    private int numerEpoki;
    private int czasTrwania;
    private int liczbaEpok;
    private int dalej;
    private int liczbaStatkow;

    public void zmianaEpoki(int numerEpoki) {
        numerEpoki++;
        this.numerEpoki = numerEpoki;
    }

    public void wprowadzenieCzasuTrwania(int czasTrwania) {
        int licznik = 0;
        while(czasTrwania < 1){
            if(licznik > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz");
            try {
                System.out.println("Wprowadz czas trwania epoki:");
                Scanner scanner = new Scanner(System.in);
                licznik++;
                czasTrwania = scanner.nextInt();
            }catch(InputMismatchException ignored){}}
        this.czasTrwania = czasTrwania;
    }

    public void wprowadzenieLiczbyEpok(int liczbaEpok) {
        int licznik = 0;
        while(liczbaEpok < 1){
            if(licznik > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz\n");
            try {
                System.out.println("Wprowadz liczbe epok:");
                Scanner scanner = new Scanner(System.in);
                licznik++;
                liczbaEpok = scanner.nextInt();
        }catch(InputMismatchException ignored){}}
        this.liczbaEpok = liczbaEpok;
    }
    public void zapisDoPliku(String tekst) throws IOException {
        File plik = new File("D:/daneSymulacji.csv");
        if (!plik.exists()) {
            try {
                plik.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileWriter zapis = null;
        try {
            zapis = new FileWriter("daneSymulacji.csv",true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        zapis.write(tekst);
        zapis.close();
    }
    public void start(){
        System.out.println("Jesli chcesz wykonac ruch symulacji wpisz 1");
        int licznik = 0;
        while ( dalej != 1) {
            if (licznik > 0) System.out.println("Wprowadzono bledne dane! Sproboj jeszcze raz");
            try {
                Scanner scanner = new Scanner(System.in);
                licznik++;
                dalej = scanner.nextInt();
            } catch (InputMismatchException ignored) {
            }
        }
        dalej = 0;
    }

    public void liczenieStatkow(boolean czyUsuniete) {
        if(!czyUsuniete) liczbaStatkow++;
    }
    public void ustawLiczbeStatkow(int liczbaStatkow) {
        this.liczbaStatkow = liczbaStatkow;
    }

    public int wyslijCzasTrwania() {
        return czasTrwania;
    }
    public int wyslijLiczbeEpok() {
        return liczbaEpok;
    }

    public int wyslijNumerEpoki() {
        return numerEpoki;
    }

    public int wyslijLiczbeStatkow() {
        return liczbaStatkow;
    }
}