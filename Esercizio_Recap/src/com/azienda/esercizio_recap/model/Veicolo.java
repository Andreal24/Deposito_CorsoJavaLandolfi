package com.azienda.esercizio_recap.model;

public class Veicolo {

	private String modello;
	private float velocita;
	
	public Veicolo(String modello, float velocita) {
		
		this.modello = modello;
		this.velocita = velocita;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + ", velocita=" + velocita + "]";
	}
	
	
}
