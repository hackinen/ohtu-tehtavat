package ohtu.verkkokauppa;

public class Nordea implements Pankki {

    private static Nordea instanssi;

    public static Nordea getInstance() {
        if (instanssi == null) {
            instanssi = new Nordea();
        }

        return instanssi;
    }
    private Kirjanpito kirjanpito;

    public Nordea() {
        kirjanpito = Kirjanpito.getInstance();
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
