package symulacjaAgentowa;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        Epoka epoka = new Epoka(1,0,0,0);
        Czasoprzestrzen czasoprzestrzen = new Czasoprzestrzen(0,0);
        Cywilizacje cywilizacja1 = new Cywilizacje(0,0,0);
        Cywilizacje cywilizacja2 = new Cywilizacje(0,0,0);
        Cywilizacje cywilizacja3 = new Cywilizacje(0,0,0);
        Cywilizacje cywilizacja4 = new Cywilizacje(0,0,0);
        Cywilizacje cywilizacja5 = new Cywilizacje(0,0,0);
        Interakcje interakcje = new Interakcje(false);

        epoka.wprowadzenieLiczbyEpok(epoka.wyslijLiczbeEpok());

        epoka.wprowadzenieCzasuTrwania(epoka.wyslijCzasTrwania());

        czasoprzestrzen.wprowadzanieWielkosciPrzestrzeni(czasoprzestrzen.wyslijWielkoscPrzestrzeni());

        System.out.println("Wprowadz pozycje planety pierwszej cywilizacji:");
        cywilizacja1.wprowadzeniePozycjiPlanety(cywilizacja1.wyslijPozycjePlanetyX(),cywilizacja1.wyslijPozycjePlanetyY(),
                czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        cywilizacja1.wprowadzenieRozwoju(cywilizacja1.wyslijRozwoj());

        System.out.println("Wprowadz pozycje planety drugiej cywilizacji:");
        cywilizacja2.wprowadzeniePozycjiPlanety(cywilizacja2.wyslijPozycjePlanetyX(), cywilizacja2.wyslijPozycjePlanetyY(),
                czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        while(cywilizacja2.wyslijPozycjePlanetyX() == cywilizacja1.wyslijPozycjePlanetyX() &&
                cywilizacja2.wyslijPozycjePlanetyY() == cywilizacja1.wyslijPozycjePlanetyY()) {
            cywilizacja2.restartPozycji(0,0);
            System.out.println("Ta pozycja jest juz zajeta! Sprobuj jeszcze raz");
            cywilizacja2.wprowadzeniePozycjiPlanety(cywilizacja2.wyslijPozycjePlanetyX(), cywilizacja2.wyslijPozycjePlanetyY(),
                    czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        }
        cywilizacja2.wprowadzenieRozwoju(cywilizacja2.wyslijRozwoj());

        System.out.println("Wprowadz pozycje planety trzeciej cywilizacji:");
        cywilizacja3.wprowadzeniePozycjiPlanety(cywilizacja3.wyslijPozycjePlanetyX(),cywilizacja3.wyslijPozycjePlanetyY(),
                czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        while(cywilizacja3.wyslijPozycjePlanetyX() == cywilizacja1.wyslijPozycjePlanetyX() &&
                cywilizacja3.wyslijPozycjePlanetyY() == cywilizacja1.wyslijPozycjePlanetyY()
                || cywilizacja3.wyslijPozycjePlanetyX() == cywilizacja2.wyslijPozycjePlanetyX() &&
                cywilizacja3.wyslijPozycjePlanetyY() == cywilizacja2.wyslijPozycjePlanetyY()) {
            cywilizacja3.restartPozycji(0,0);
            System.out.println("Ta pozycja jest juz zajeta! Sprobuj jeszcze raz");
            cywilizacja3.wprowadzeniePozycjiPlanety(cywilizacja3.wyslijPozycjePlanetyX(), cywilizacja3.wyslijPozycjePlanetyY(),
                    czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        }
        cywilizacja3.wprowadzenieRozwoju(cywilizacja3.wyslijRozwoj());

        System.out.println("Wprowadz pozycje planety czwartej cywilizacji:");
        cywilizacja4.wprowadzeniePozycjiPlanety(cywilizacja4.wyslijPozycjePlanetyX(),cywilizacja4.wyslijPozycjePlanetyY(),
                czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        while(cywilizacja4.wyslijPozycjePlanetyX() == cywilizacja1.wyslijPozycjePlanetyX() &&
                cywilizacja4.wyslijPozycjePlanetyY() == cywilizacja1.wyslijPozycjePlanetyY()
                || cywilizacja4.wyslijPozycjePlanetyX() == cywilizacja2.wyslijPozycjePlanetyX() &&
                cywilizacja4.wyslijPozycjePlanetyY() == cywilizacja2.wyslijPozycjePlanetyY()
                || cywilizacja4.wyslijPozycjePlanetyX() == cywilizacja3.wyslijPozycjePlanetyX() &&
                cywilizacja4.wyslijPozycjePlanetyY() == cywilizacja3.wyslijPozycjePlanetyY()) {
            cywilizacja4.restartPozycji(0,0);
            System.out.println("Ta pozycja jest juz zajeta! Sprobuj jeszcze raz");
            cywilizacja4.wprowadzeniePozycjiPlanety(cywilizacja4.wyslijPozycjePlanetyX(), cywilizacja4.wyslijPozycjePlanetyY(),
                    czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        }
        cywilizacja4.wprowadzenieRozwoju(cywilizacja4.wyslijRozwoj());

        System.out.println("Wprowadz pozycje planety piatej cywilizacji:");
        cywilizacja5.wprowadzeniePozycjiPlanety(cywilizacja5.wyslijPozycjePlanetyX(),cywilizacja5.wyslijPozycjePlanetyY(),
                czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        while(cywilizacja5.wyslijPozycjePlanetyX() == cywilizacja1.wyslijPozycjePlanetyX() &&
                cywilizacja5.wyslijPozycjePlanetyY() == cywilizacja1.wyslijPozycjePlanetyY()
                || cywilizacja5.wyslijPozycjePlanetyX() == cywilizacja2.wyslijPozycjePlanetyX() &&
                cywilizacja5.wyslijPozycjePlanetyY() == cywilizacja2.wyslijPozycjePlanetyY()
                || cywilizacja5.wyslijPozycjePlanetyX() == cywilizacja3.wyslijPozycjePlanetyX() &&
                cywilizacja5.wyslijPozycjePlanetyY() == cywilizacja3.wyslijPozycjePlanetyY()
                || cywilizacja5.wyslijPozycjePlanetyX() == cywilizacja4.wyslijPozycjePlanetyX() &&
                cywilizacja5.wyslijPozycjePlanetyY() == cywilizacja4.wyslijPozycjePlanetyY()) {
            cywilizacja5.restartPozycji(0,0);
            System.out.println("Ta pozycja jest juz zajeta! Sprobuj jeszcze raz");
            cywilizacja5.wprowadzeniePozycjiPlanety(cywilizacja5.wyslijPozycjePlanetyX(), cywilizacja5.wyslijPozycjePlanetyY(),
                    czasoprzestrzen.wyslijWielkoscPrzestrzeni());
        }
        cywilizacja5.wprowadzenieRozwoju(cywilizacja5.wyslijRozwoj());

        StatkiBadawcze sb11 = new StatkiBadawcze(cywilizacja1.wyslijRozwoj(),cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY(),100, cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY() - 1,0,false);

        StatkiBadawcze sb12 = new StatkiBadawcze(cywilizacja1.wyslijRozwoj(),cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY(),100,cywilizacja1.wyslijPozycjePlanetyX() + 1,
                cywilizacja1.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp11 = new StatkiPrzemyslowe(cywilizacja1.wyslijRozwoj(),cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY(),100,cywilizacja1.wyslijPozycjePlanetyX() - 1,
                cywilizacja1.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp12 = new StatkiPrzemyslowe(cywilizacja1.wyslijRozwoj(),cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY(),100,cywilizacja1.wyslijPozycjePlanetyX(),
                cywilizacja1.wyslijPozycjePlanetyY() + 1,0,false);


        StatkiBadawcze sb21 = new StatkiBadawcze(cywilizacja2.wyslijRozwoj(),cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY(),100,cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY() - 1,0,false);

        StatkiBadawcze sb22 = new StatkiBadawcze(cywilizacja2.wyslijRozwoj(),cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY(),100,cywilizacja2.wyslijPozycjePlanetyX() + 1,
                cywilizacja2.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp21 = new StatkiPrzemyslowe(cywilizacja2.wyslijRozwoj(),cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY(),100,cywilizacja2.wyslijPozycjePlanetyX() - 1,
                cywilizacja2.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp22 = new StatkiPrzemyslowe(cywilizacja2.wyslijRozwoj(),cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY(),100,cywilizacja2.wyslijPozycjePlanetyX(),
                cywilizacja2.wyslijPozycjePlanetyY() + 1,0,false);


        StatkiBadawcze sb31 = new StatkiBadawcze(cywilizacja3.wyslijRozwoj(),cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY(),100,cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY() - 1,0,false);

        StatkiBadawcze sb32 = new StatkiBadawcze(cywilizacja3.wyslijRozwoj(),cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY(),100,cywilizacja3.wyslijPozycjePlanetyX() + 1,
                cywilizacja3.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp31 = new StatkiPrzemyslowe(cywilizacja3.wyslijRozwoj(),cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY(),100,cywilizacja3.wyslijPozycjePlanetyX() - 1,
                cywilizacja3.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp32 = new StatkiPrzemyslowe(cywilizacja3.wyslijRozwoj(),cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY(),100,cywilizacja3.wyslijPozycjePlanetyX(),
                cywilizacja3.wyslijPozycjePlanetyY() + 1,0,false);


        StatkiBadawcze sb41 = new StatkiBadawcze(cywilizacja4.wyslijRozwoj(),cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY(),100,cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY() - 1,0,false);

        StatkiBadawcze sb42 = new StatkiBadawcze(cywilizacja4.wyslijRozwoj(),cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY(),100,cywilizacja4.wyslijPozycjePlanetyX() + 1,
                cywilizacja4.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp41 = new StatkiPrzemyslowe(cywilizacja4.wyslijRozwoj(),cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY(),100,cywilizacja4.wyslijPozycjePlanetyX() - 1,
                cywilizacja4.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp42 = new StatkiPrzemyslowe(cywilizacja4.wyslijRozwoj(),cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY(),100,cywilizacja4.wyslijPozycjePlanetyX(),
                cywilizacja4.wyslijPozycjePlanetyY() + 1,0,false);


        StatkiBadawcze sb51 = new StatkiBadawcze(cywilizacja5.wyslijRozwoj(),cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY(),100,cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY() - 1,0,false);

        StatkiBadawcze sb52 = new StatkiBadawcze(cywilizacja5.wyslijRozwoj(),cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY(),100,cywilizacja5.wyslijPozycjePlanetyX() + 1,
                cywilizacja5.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp51 = new StatkiPrzemyslowe(cywilizacja5.wyslijRozwoj(),cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY(),100,cywilizacja5.wyslijPozycjePlanetyX() - 1,
                cywilizacja5.wyslijPozycjePlanetyY(),0,false);

        StatkiPrzemyslowe sp52 = new StatkiPrzemyslowe(cywilizacja5.wyslijRozwoj(),cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY(),100,cywilizacja5.wyslijPozycjePlanetyX(),
                cywilizacja5.wyslijPozycjePlanetyY() + 1,0,false);

        List<StatkiKosmiczne> statkiKosmiczne = new LinkedList<>();
        statkiKosmiczne.add(sb11); statkiKosmiczne.add(sb12); statkiKosmiczne.add(sp11); statkiKosmiczne.add(sp12);
        statkiKosmiczne.add(sb21); statkiKosmiczne.add(sb22); statkiKosmiczne.add(sp21); statkiKosmiczne.add(sp22);
        statkiKosmiczne.add(sb31); statkiKosmiczne.add(sb32); statkiKosmiczne.add(sp31); statkiKosmiczne.add(sp32);
        statkiKosmiczne.add(sb41); statkiKosmiczne.add(sb42); statkiKosmiczne.add(sp41); statkiKosmiczne.add(sp42);
        statkiKosmiczne.add(sb51); statkiKosmiczne.add(sb52); statkiKosmiczne.add(sp51); statkiKosmiczne.add(sp52);

        List<StatkiBadawcze> statkiBadawcze = new LinkedList<>();
        statkiBadawcze.add(sb11); statkiBadawcze.add(sb12);
        statkiBadawcze.add(sb21); statkiBadawcze.add(sb22);
        statkiBadawcze.add(sb31); statkiBadawcze.add(sb32);
        statkiBadawcze.add(sb41); statkiBadawcze.add(sb42);
        statkiBadawcze.add(sb51); statkiBadawcze.add(sb52);

        List<StatkiPrzemyslowe> statkiPrzemyslowe = new LinkedList<>();
        statkiPrzemyslowe.add(sp11); statkiPrzemyslowe.add(sp12);
        statkiPrzemyslowe.add(sp21); statkiPrzemyslowe.add(sp22);
        statkiPrzemyslowe.add(sp31); statkiPrzemyslowe.add(sp32);
        statkiPrzemyslowe.add(sp41); statkiPrzemyslowe.add(sp42);
        statkiPrzemyslowe.add(sp51); statkiPrzemyslowe.add(sp52);

        for(StatkiBadawcze b : statkiBadawcze){
            b.jakaObrona(b.wyslijObrone());
        }

        czasoprzestrzen.generujMape(czasoprzestrzen.wyslijWielkoscPrzestrzeni());

        for(StatkiKosmiczne s : statkiKosmiczne){
            czasoprzestrzen.oznaczenieWspolrzednych(s.wyslijPozycjePlanetyX(), s.wyslijPozycjePlanetyY(),
                    s.wyslijPozycjaX(),s.wyslijPozycjaY(),statkiKosmiczne.indexOf(s)+1);
        }

        System.out.println("""
                Na mapie planety kolejnych cywilizacji zostaly oznaczone literami A-E,
                a statki numerami 1-20.""");

        czasoprzestrzen.wyswietlMape(czasoprzestrzen.wyslijWielkoscPrzestrzeni());

        epoka.start();
        czasoprzestrzen.ustawCzas(1);

        while(epoka.wyslijNumerEpoki() <= epoka.wyslijLiczbeEpok()){
            System.out.println("Epoka numer " + epoka.wyslijNumerEpoki());
            epoka.zmianaEpoki(epoka.wyslijNumerEpoki());
            while(czasoprzestrzen.wyslijCzas() <= epoka.wyslijCzasTrwania()){
                for(StatkiKosmiczne s : statkiKosmiczne){
                    s.ruchStatkow(s.wyslijPozycjaX(),s.wyslijPozycjaY(),s.wyslijRozwoj(),
                            czasoprzestrzen.wyslijWielkoscPrzestrzeni(),s.wyslijCzyUsuniety());
                }
                for(StatkiPrzemyslowe p : statkiPrzemyslowe){
                    p.zmianaWartosci(p.wyslijWartosc(),p.wyslijRozwoj());
                }

                interakcje.pobierzObronnosc(sb11.wyslijObrone(),sb12.wyslijObrone(),1,1,
                        sb21.wyslijObrone(),sb22.wyslijObrone(),1,1,
                        sb31.wyslijObrone(),sb32.wyslijObrone(),1,1,
                        sb41.wyslijObrone(),sb42.wyslijObrone(),1,1,
                        sb51.wyslijObrone(),sb52.wyslijObrone(),1,1);

                interakcje.pobierzPozycje(sb11.wyslijPozycjaX(),sb11.wyslijPozycjaY(),sb12.wyslijPozycjaX(),sb12.wyslijPozycjaY(),
                sp11.wyslijPozycjaX(),sp11.wyslijPozycjaY(),sp12.wyslijPozycjaX(),sp12.wyslijPozycjaY(),
                sb21.wyslijPozycjaX(),sb21.wyslijPozycjaY(),sb22.wyslijPozycjaX(),sb22.wyslijPozycjaY(),
                sp21.wyslijPozycjaX(),sp21.wyslijPozycjaY(),sp22.wyslijPozycjaX(),sp22.wyslijPozycjaY(),
                sb31.wyslijPozycjaX(),sb31.wyslijPozycjaY(),sb32.wyslijPozycjaX(),sb32.wyslijPozycjaY(),
                sp31.wyslijPozycjaX(),sp31.wyslijPozycjaY(),sp32.wyslijPozycjaX(),sp32.wyslijPozycjaY(),
                sb41.wyslijPozycjaX(),sb41.wyslijPozycjaY(),sb42.wyslijPozycjaX(),sb42.wyslijPozycjaY(),
                sp41.wyslijPozycjaX(),sp41.wyslijPozycjaY(),sp42.wyslijPozycjaX(),sp42.wyslijPozycjaY(),
                sb51.wyslijPozycjaX(),sb51.wyslijPozycjaY(),sb52.wyslijPozycjaX(),sb52.wyslijPozycjaY(),
                sp51.wyslijPozycjaX(),sp51.wyslijPozycjaY(),sp52.wyslijPozycjaX(),sp52.wyslijPozycjaY());

                interakcje.pobierzRozwoj(cywilizacja1.wyslijRozwoj(),cywilizacja2.wyslijRozwoj(), cywilizacja3.wyslijRozwoj(),
                        cywilizacja4.wyslijRozwoj(),cywilizacja5.wyslijRozwoj());

                interakcje.pobierzPozycjePlanet(cywilizacja1.wyslijPozycjePlanetyX(),cywilizacja1.wyslijPozycjePlanetyY(),
                        cywilizacja2.wyslijPozycjePlanetyX(),cywilizacja2.wyslijPozycjePlanetyY(),
                        cywilizacja3.wyslijPozycjePlanetyX(),cywilizacja3.wyslijPozycjePlanetyY(),
                        cywilizacja4.wyslijPozycjePlanetyX(),cywilizacja4.wyslijPozycjePlanetyY(),
                        cywilizacja5.wyslijPozycjePlanetyX(),cywilizacja5.wyslijPozycjePlanetyY());

                interakcje.pobierzUszkodzenie(sb11.wyslijUszkodzenie(),sb12.wyslijUszkodzenie(),sp21.wyslijUszkodzenie(),sp22.wyslijUszkodzenie(),
                        sb21.wyslijUszkodzenie(),sb22.wyslijUszkodzenie(),sp21.wyslijUszkodzenie(),sp22.wyslijUszkodzenie(),
                        sb31.wyslijUszkodzenie(),sb32.wyslijUszkodzenie(),sp31.wyslijUszkodzenie(),sp32.wyslijUszkodzenie(),
                        sb41.wyslijUszkodzenie(),sb42.wyslijUszkodzenie(),sp41.wyslijUszkodzenie(),sp42.wyslijUszkodzenie(),
                        sb51.wyslijUszkodzenie(),sb52.wyslijUszkodzenie(),sp51.wyslijUszkodzenie(),sp52.wyslijUszkodzenie());


                for(StatkiBadawcze b : statkiBadawcze){
                    interakcje.szukanieInterakcji(b.wyslijPozycjaX(), b.wyslijPozycjaY(),
                            b.wyslijRozwoj(),b.wyslijObrone(),statkiKosmiczne.indexOf(b)+1,b.wyslijUszkodzenie(),b.wyslijCzyUsuniety());
                    if(interakcje.wyslijDecyzje()){
                        if(interakcje.wyslijIndeks() != 50) {
                            statkiKosmiczne.get(interakcje.wyslijIndeks()).zmianaUszkodzenia(statkiKosmiczne.get(interakcje.wyslijIndeks()).wyslijUszkodzenie());
                        }
                        b.usunStatek();
                        interakcje.ustawDecyzje(false);
                    }
                }

                for(StatkiPrzemyslowe p : statkiPrzemyslowe){
                    interakcje.szukanieInterakcji(p.wyslijPozycjaX(), p.wyslijPozycjaY(),
                            p.wyslijRozwoj(),1,statkiKosmiczne.indexOf(p)+1,p.wyslijUszkodzenie(),p.wyslijCzyUsuniety());
                    if(interakcje.wyslijDecyzje()){
                        if(interakcje.wyslijIndeks() != 50) {
                            statkiKosmiczne.get(interakcje.wyslijIndeks()).zmianaUszkodzenia(statkiKosmiczne.get(interakcje.wyslijIndeks()).wyslijUszkodzenie());
                        }
                        p.usunStatek();
                        interakcje.ustawDecyzje(false);
                    }
                }

                czasoprzestrzen.generujMape(czasoprzestrzen.wyslijWielkoscPrzestrzeni());

                for(StatkiKosmiczne s : statkiKosmiczne){
                    czasoprzestrzen.oznaczenieWspolrzednych(s.wyslijPozycjePlanetyX(), s.wyslijPozycjePlanetyY(),
                            s.wyslijPozycjaX(),s.wyslijPozycjaY(),statkiKosmiczne.indexOf(s)+1);
                }

                czasoprzestrzen.wyswietlMape(czasoprzestrzen.wyslijWielkoscPrzestrzeni());

                epoka.start();

                czasoprzestrzen.sterowanieCzasem(czasoprzestrzen.wyslijCzas());
            }
            czasoprzestrzen.ustawCzas(1);
            epoka.ustawLiczbeStatkow(0);
            for(StatkiKosmiczne s:statkiKosmiczne){
                epoka.liczenieStatkow(s.wyslijCzyUsuniety());
            }
            try {
                epoka.zapisDoPliku("\n"+"\n"+"Epoka"+";"+(epoka.wyslijNumerEpoki()-1)+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                epoka.zapisDoPliku("Liczba Statkow"+";");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                epoka.zapisDoPliku(epoka.wyslijLiczbeStatkow()+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                try {
                    epoka.zapisDoPliku("Numer Statku"+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            for(StatkiPrzemyslowe p:statkiPrzemyslowe){
                try {
                    epoka.zapisDoPliku((statkiKosmiczne.indexOf(p)+1)+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
                try {
                    epoka.zapisDoPliku("\n"+"Wartosc"+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            for(StatkiPrzemyslowe p:statkiPrzemyslowe){
                try {
                    epoka.zapisDoPliku(p.wyslijWartosc()+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
                try {
                    epoka.zapisDoPliku("\n"+"Numer Statku"+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            for(StatkiKosmiczne k:statkiKosmiczne){
                try {
                    epoka.zapisDoPliku((statkiKosmiczne.indexOf(k)+1)+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
                try {
                    epoka.zapisDoPliku("\n"+"Stan Uszkodzenia"+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            for(StatkiKosmiczne s:statkiKosmiczne){
                try {
                    epoka.zapisDoPliku(s.wyslijUszkodzenie()+";");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}