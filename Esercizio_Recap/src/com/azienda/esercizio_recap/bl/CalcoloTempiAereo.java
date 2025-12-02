package com.azienda.esercizio_recap.bl;

import com.azienda.esercizio_recap.model.Aereo;
import com.azienda.esercizio_recap.model.Veicolo;

public class CalcoloTempiAereo implements CalcoloTempi {

	
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if (veicolo instanceof Aereo) {
            Aereo aereo = (Aereo) veicolo;
            aereo.vola();    
        } else {
            System.out.println("Errore: Il veicolo fornito non è un Aereo.");
        }
		
	}

}
