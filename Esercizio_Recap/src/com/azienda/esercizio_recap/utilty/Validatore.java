package com.azienda.esercizio_recap.utilty;

public class Validatore {

	
    public static final String TIPO_AEREO = "aereo";
    public static final String TIPO_TRENO = "treno";

   
    public static void controllaTipoVeicolo(String tipo) throws VeicoloNonValidoException {
        String tipoMinuscolo = tipo.toLowerCase(); 

        if (!tipoMinuscolo.equals(TIPO_AEREO) && !tipoMinuscolo.equals(TIPO_TRENO)) {
            throw new VeicoloNonValidoException("Tipo di veicolo non valido!");
                                               
        }
    }
}
