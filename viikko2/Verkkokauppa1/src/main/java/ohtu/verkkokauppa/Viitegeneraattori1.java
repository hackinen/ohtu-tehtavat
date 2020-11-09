package ohtu.verkkokauppa;

public class Viitegeneraattori1 implements Viitegeneraattori {

    private static Viitegeneraattori1 instanssi;

    public static Viitegeneraattori1 getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori1();
        }

        return instanssi;
    }
    
    private int seuraava;
    
    private Viitegeneraattori1(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
