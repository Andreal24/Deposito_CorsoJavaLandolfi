package com.azienda.esercizio_recap.model;

import java.util.Scanner;

import com.azienda.esercizio_recap.utilty.InputUtility;
import com.azienda.esercizio_recap.utilty.Validatore;
import com.azienda.esercizio_recap.utilty.VeicoloNonValidoException;

public class VeicoloFactory {

	public static Veicolo creaVeicolo(String tipo) throws VeicoloNonValidoException {
       
        Validatore.controllaTipoVeicolo(tipo); 
        
       
        String tipoMinuscolo = tipo.toLowerCase();
        
        
        System.out.println(" Inserimento dati per il veicolo di tipo: " + tipo );
        
      
        System.out.print("Inserisci il modello del veicolo: ");
        String modello = new Scanner(System.in).nextLine(); 
        
       
        float velocita = InputUtility.leggiFloat("Inserisci la velocità media (km/h)");
        
        
        
        try {
            if (tipoMinuscolo.equals(Validatore.TIPO_AEREO)) {
                
               
                boolean diLinea = InputUtility.leggiBoolean("È un aereo di linea?");
                
               
                return new Aereo(modello, velocita, diLinea); 
                
            } else if (tipoMinuscolo.equals(Validatore.TIPO_TRENO)) {
                
               
                boolean regionale = InputUtility.leggiBoolean("È un treno regionale?");
                
               
                return new Treno(modello, velocita, regionale);
                
            }
        } catch (IllegalArgumentException e) {
            
            System.err.println(" Errore nella creazione del veicolo dovuto a dati non validi: " + e.getMessage());
            return null; 
        }
        
        return null;     }
}
