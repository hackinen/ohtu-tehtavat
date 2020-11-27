/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin.komennot;
import laskin.*;
import javafx.scene.control.*;

/**
 *
 * @author hiira
 */
public class Nollaa implements Komento {
    private TextField tulos;
    private TextField syote;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovellus;
    
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tulos = tuloskentta;
        this.syote = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }
    
    @Override
    public void suorita() {
        sovellus.nollaa();
        tulos.setText(String.valueOf(0));
        syote.setText("");        
        nollaa.disableProperty().set(true);
       
    }
    
    @Override
    public void peru() {
        
    }
    
    
}
