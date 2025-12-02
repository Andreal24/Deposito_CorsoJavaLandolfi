package com.azienda.esercizio_recap.bl;

import com.azienda.esercizio_recap.model.Treno;
import com.azienda.esercizio_recap.model.Veicolo;

public class CalcoloTempiTreno implements CalcoloTempi{

	

	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if (veicolo instanceof Treno) {
            Treno treno = (Treno) veicolo;
            treno.percorreBinari();
        } else {
            System.out.println("Errore: Il veicolo fornito non è un Treno.");
        }
	}

}
