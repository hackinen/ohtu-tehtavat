package ohtu.verkkokauppa;

public class Viitegeneraattori1 implements Viitegeneraattori {

    
    private int seuraava;
    
    public Viitegeneraattori1(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
