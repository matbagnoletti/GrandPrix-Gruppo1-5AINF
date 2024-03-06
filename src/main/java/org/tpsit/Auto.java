package org.tpsit;

import java.util.Random;

/**
 * Classe che rappresenta l'auto da corsa.
 * @author Matteo Bagnoletti Tini
 */
public class Auto {
    private final String squadra;
    public final Circuito circuito;

    /**
     * Indica se l'auto è stata sabotata nella fase di avvio gara dall'utente
     * @see Giudice
     */
    private boolean sabotata;

    /**
     * Indica se l'auto è incidentata.
     * @see Giudice
     */
    private boolean incidente;
    private int spazioPercorso;
    private int spazioRimanente;
    /**
     * Numero di pit stop effettuati.
     */
    private int pitstopEffettuati;
    public Auto(String squadra, Circuito circuito) {
        this.squadra = squadra;
        this.circuito = circuito;
        this.spazioPercorso = 0;
        this.spazioRimanente = circuito.getLunghezza();
        this.pitstopEffettuati = 0;
        this.sabotata = false;
        this.incidente = false;
    }

    public void setSabotata() {
        this.sabotata = true;
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
     * Metodo che determina la possibilità di effettuare un pit stop o meno.
     * @return true se effettua il pit stop, false altrimenti.
     */
    public boolean pitstop(){
        if(pitstopEffettuati < circuito.getNumeroPitStop()) {
            Random random = new Random();
            if(random.nextInt(5) == 4) {
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
     * Metodo che determina l'avvenimento di un incidente.
     * @return true se fa un incidente, false altrimenti.
     */
    public boolean incidente(){
        if(!incidente && sabotata) {
            Random random = new Random();
            if(random.nextInt(5) == 4) {
                incidente = true;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int getSpazioRimanente() {
        return spazioRimanente;
    }

    public int getSpazioPercorso() {
        return spazioPercorso;
    }

    /**
     * Metodo principale. Determina l'avanzamento dell'auto durante la gara.
     * @param safetyCar se la safety car è nel circuito
     * @return la velocità (corrispondente allo spazio percorso)
     */
    public int percorri(boolean safetyCar) {
        if(safetyCar) {
            spazioPercorso += 50;
            spazioRimanente -= 50;
            return 50;
        } else {
            int velocita = generaVelocita();
            spazioPercorso += velocita;
            spazioRimanente -= velocita;
            return velocita;
        }
    }
}
