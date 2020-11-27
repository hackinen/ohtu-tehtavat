package laskin;

public class Sovelluslogiikka {
 
    private int tulos;
    private int edellinenTulos;
    
    public void plus(int luku) {
        edellinenTulos = tulos;
        tulos += luku;
    }
     
    public void miinus(int luku) {
        edellinenTulos = tulos;
        tulos -= luku;
    }
 
    public void nollaa() {
        edellinenTulos = tulos;
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }
    
    public int palautaEdellinen() {
        tulos = edellinenTulos;
        return edellinenTulos;
    }
}