package symulacjaAgentowa;

import java.util.Random;

public abstract class StatkiKosmiczne extends  Cywilizacje{
    public StatkiKosmiczne(int rozwoj, int pozycjaPlanetyX, int pozycjaPlanetyY, int stanUszkodzenia, int pozycjaX, int pozycjaY,
                           boolean czyUsuniety) {
        super(rozwoj, pozycjaPlanetyX, pozycjaPlanetyY);
        this.stanUszkodzenia = stanUszkodzenia;
        this.pozycjaX = pozycjaX;
        this.pozycjaY = pozycjaY;
        this.czyUsuniety = czyUsuniety;
    }
    private int stanUszkodzenia;
    private int pozycjaX;
    private int pozycjaY;
    private boolean czyUsuniety;

    public void ruchStatkow(int pozycjaX,int pozycjaY,int rozwoj,int wielkoscPrzestrzeni,boolean czyUsuniety){
        if(!czyUsuniety) {
            int przemieszczenieX;
            int przemieszczenieY;
            Random random = new Random();
            przemieszczenieX = random.nextInt(rozwoj + 1);
            przemieszczenieY = random.nextInt(rozwoj + 1);
            int znak = random.nextInt(2);
            if (znak == 0) {
                przemieszczenieX *= -1;
                przemieszczenieY *= -1;
            }
            pozycjaX += przemieszczenieX;
            pozycjaY += przemieszczenieY;
            if (pozycjaX > wielkoscPrzestrzeni) pozycjaX -= wielkoscPrzestrzeni;
            if (pozycjaX < 1) pozycjaX += wielkoscPrzestrzeni;
            if (pozycjaY > wielkoscPrzestrzeni) pozycjaY -= wielkoscPrzestrzeni;
            if (pozycjaY < 1) pozycjaY += wielkoscPrzestrzeni;
            this.pozycjaX = pozycjaX;
            this.pozycjaY = pozycjaY;
        }
        else{
            this.pozycjaX = 0;
            this.pozycjaY = 0;
        }
    }
    public void zmianaUszkodzenia(int stanUszkodzenia) {
        Random random = new Random();
        if(stanUszkodzenia != 0){
            stanUszkodzenia -= 20+random.nextInt(70)+1;
            if(stanUszkodzenia<1){
                stanUszkodzenia = 0;
                czyUsuniety = true;
            }
        }
        this.stanUszkodzenia = stanUszkodzenia;
    }

    public void usunStatek() {
        zmianaUszkodzenia(0);
        czyUsuniety = true;
    }
    public boolean wyslijCzyUsuniety() {
        return czyUsuniety;
    }
    public int wyslijUszkodzenie() {
        return stanUszkodzenia;
    }
    public int wyslijPozycjaX() {
        return pozycjaX;
    }

    public int wyslijPozycjaY() {
        return pozycjaY;
    }
}