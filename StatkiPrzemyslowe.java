package symulacjaAgentowa;

import java.util.Random;

public class StatkiPrzemyslowe extends StatkiKosmiczne{
    public StatkiPrzemyslowe(int rozwoj, int pozycjaPlanetyX, int pozycjaPlanetyY, int stanUszkodzenia, int pozycjaX, int pozycjaY, int wartosc,
            boolean czyUsuniety) {
        super(rozwoj, pozycjaPlanetyX, pozycjaPlanetyY, stanUszkodzenia, pozycjaX, pozycjaY,czyUsuniety);
        this.wartosc = wartosc;
    }
    private int wartosc;

    public void zmianaWartosci(int wartosc,int rozwoj) {
        Random random = new Random();
        wartosc += random.nextInt(rozwoj+1);
        this.wartosc = wartosc;
    }

    public int wyslijWartosc() {
        return wartosc;
    }
}