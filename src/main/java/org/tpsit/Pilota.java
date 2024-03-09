package org.tpsit;

/**
 * Classe che rappresenta un pilota.
 */
public class Pilota extends Thread {
    private String nome;
    private String squadra;
    /**
     * Numero di vittorie del pilota.
     */
    private int vittorie;
    /**
     * Numero di gare giocate in totale dal pilota.
     */
    private int gareGiocate;
    /**
     * Variabile booleana che indica se il pilota ha avuto un incidente.
     */
    private boolean incidentato = false;
    public Auto auto;
    
    /**
     * Costruttore della classe Pilota.
     * @param nome Nome del pilota.
     * @param squadra Squadra del pilota.
     * @param vittorie Vittorie del pilota.
     * @param gareGiocate Gare giocate in totale dal pilota.
     */
    public Pilota(String nome, String squadra, int vittorie, int gareGiocate, Circuito circuito) {
        this.nome = nome;
        this.squadra = squadra;
        this.vittorie = vittorie;
        this.gareGiocate = gareGiocate;
        this.auto = new Auto(squadra, circuito);
    }

    public String getNome() {
        return nome;
    }

    public String getSquadra() {
        return squadra;
    }

    public int getVittorie() {
        return vittorie;
    }

    public int getGareGiocate() {
        return gareGiocate;
    }

    @Override
    public void run() {
        //TODO:
        // 1) Il pilota percorre il circuito finché non ha completato tutti i giri o non ha avuto un incidente.
        // 2) Ogni volta che il pilota completa un giro, lo deve comunicare al giudice che stampa la classifica.
        // 3) Ad ogni giro il pilota dovrà attendere un po' di tempo (ad esempio 1 secondo) prima di percorrere il giro successivo.
    }

    /**
     * Imposta il pilota come incidentato
     */
    public void setIncidentato() {
        this.incidentato = true;
    }
}
