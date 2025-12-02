package com.azienda.esercizio_recap.bl;

import com.azienda.esercizio_recap.model.Veicolo;

public interface CalcoloTempi {

	public default float calcolaTempiPercorrenza(Veicolo veicolo, float distanza) {
		if (veicolo.getVelocita() > 0) {
            return distanza / veicolo.getVelocita();
        } else {
           
            return 0.0f;
        }
	}
	public void informazioniMovimento(Veicolo veicolo);
}
