package com.azienda.esercizio_recap.model;

public class Treno extends Veicolo{

	private boolean regionale;

	public Treno(String modello, float velocita, boolean regionale) {
		super(modello, velocita);
		this.regionale = regionale;
	}
	
	public void percorreBinari() {
        String tipoTreno = regionale ? "regionale" : "ad alta velocità";
        System.out.println("Il treno " + getModello() + " " + tipoTreno + " sta percorrendo i binari con precisione.");
    }
}
