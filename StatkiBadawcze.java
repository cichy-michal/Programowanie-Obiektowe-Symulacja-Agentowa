package symulacjaAgentowa;

import java.util.Random;

public class StatkiBadawcze extends StatkiKosmiczne{
    public StatkiBadawcze(int rozwoj, int pozycjaPlanetyX, int pozycjaPlanetyY, int stanUszkodzenia, int pozycjaX, int pozycjaY, int obrona,
    boolean czyUsuniety) {
        super(rozwoj, pozycjaPlanetyX, pozycjaPlanetyY, stanUszkodzenia, pozycjaX, pozycjaY, czyUsuniety);
        this.obrona = obrona;
    }
    private int obrona;

    public void jakaObrona(int obrona) {
        Random random = new Random();
        obrona = random.nextInt(10)+1;
        this.obrona = obrona;
    }

    public int wyslijObrone() {
        return obrona;
    }
}