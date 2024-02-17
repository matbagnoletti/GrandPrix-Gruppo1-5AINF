package org.tpsit;

import java.util.Random;

public class Auto {
    /**
     * Squadra di appartenenza dell'auto.
     * Rimane costante.
     */
    private final String squadra;
    /**
     * Circuito su cui l'auto sta correndo.
     * Rimane costante.
     */
    public final Circuito circuito;
    /**
     * Spazio percorso dall'auto in metri.
     */
    private int spazioPercorso;
    /**
     * Spazio rimanente da percorrere in metri.
     */
    private int spazioRimanente;
    /**
     * Numero di pit stop effettuati dall'auto.
     */
    private int pitstopEffettuati;
    public Auto(String squadra, Circuito circuito) {
        this.squadra = squadra;
        this.spazioPercorso = 0;
        this.circuito = circuito;
        this.spazioRimanente = circuito.getLunghezza();
        this.pitstopEffettuati = 0;
    }

    /**
     * Metodo che genera una velocità casuale per l'auto. da 100 a 150 m/s.
     * @return velocità generata.
     */
    private int generaVelocita() {
        Random random = new Random();
        return 100 + random.nextInt(51);
    }

    /**
     * Metodo che genera la possibilità di effettuare un pit stop o meno.
     * @return true se effettua il pit stop, false altrimenti.
     */
    private boolean pitstop(){
        if(pitstopEffettuati < circuito.getNumeroPitStop()) {
            Random random = new Random();
            if(random.nextInt() == 1) {
                pitstopEffettuati++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Metodo che permette all'auto di percorrere una certa distanza. Sarà uguale per tutti (50 m/s) se la safety car è attiva, altrimenti sarà casuale.
     * @param safetyCarAttiva true se la safety car è attiva, false altrimenti.
     */
    public void percorri(boolean safetyCarAttiva) {
        //TODO:
        // 1) Se la safety car è attiva, l'auto percorre 50 m/s.
        // 2) Se non è attiva, l'auto percorre una distanza casuale generata
        // 3) Se l'auto effettua un pit stop, lo comunica al giudice.
    }

    /**
     * Metodo che restituisce lo spazio rimanente da percorrere.
     * @return spazio rimanente.
     */
    public int getSpazioRimanente() {
        return spazioRimanente;
    }

    /**
     * Metodo che restituisce lo spazio percorso dall'auto.
     * @return spazio percorso.
     */
    public int getSpazioPercorso() {
        return spazioPercorso;
    }
}
