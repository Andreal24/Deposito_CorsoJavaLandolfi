package com.azienda.esercizio_recap.model;

public class Aereo extends Veicolo{
	
	private boolean diLinea;
	
	public Aereo(String modello, float velocita, boolean diLinea) {
		super(modello, velocita);
		this.diLinea = diLinea;
	}

	public void vola() {
        String tipoAereo = diLinea ? "di linea" : "privato";
        System.out.println("L'aereo " + getModello() + " " + tipoAereo + " sta volando a destinazione.");
    }
	

}
