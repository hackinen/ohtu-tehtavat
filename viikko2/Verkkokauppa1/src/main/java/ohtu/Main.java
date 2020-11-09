package ohtu;

import ohtu.verkkokauppa.*;

public class Main {

    public static void main(String[] args) {
        Viitegeneraattori1 v = new Viitegeneraattori1();
        Kirjanpito k = new Kirjanpito();
        Nordea n = new Nordea(k);
        Varasto1 va = new Varasto1(k);
        
        Kauppa kauppa = new Kauppa(va, n, v);
        
        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        
        for (String tapahtuma : k.getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
