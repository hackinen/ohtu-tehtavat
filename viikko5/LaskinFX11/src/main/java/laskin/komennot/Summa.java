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
public class Summa implements Komento {
    private TextField tulos;
    private TextField syote;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovellus;
    
    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tulos = tuloskentta;
        this.syote = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }
    
    @Override
    public void suorita() {
        sovellus.plus(Integer.valueOf(syote.getText()));
        int vast = sovellus.tulos();
        tulos.setText(String.valueOf(vast));
        syote.setText("");
        
        if ( vast==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }
    
    @Override
    public void peru() {
        int vast = sovellus.palautaEdellinen();
        tulos.setText(String.valueOf(vast));
        syote.setText("");
        
        if ( vast==0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }
    
}
