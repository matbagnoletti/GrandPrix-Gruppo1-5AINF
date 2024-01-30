package org.tpsit;

/**
 * Classe che rappresenta un pilota.
 */
public class Pilota {
    private String nome;
    private String cognome;
    private String squadra;
    private int vittorie;
    private int gareGiocate;
    
    /**
     * Costruttore della classe Pilota.
     * @param nome Nome del pilota.
     * @param cognome Cognome del pilota.
     * @param squadra Squadra del pilota.
     * @param vittorie Vittorie del pilota.
     * @param gareGiocate Gare giocate in totale dal pilota.
     */
    public Pilota(String nome, String cognome, String squadra, int vittorie, int gareGiocate) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadra = squadra;
        this.vittorie = vittorie;
        this.gareGiocate = gareGiocate;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public void setGareGiocate(int gareGiocate) {
        this.gareGiocate = gareGiocate;
    }
    
    //TODO: 
    // 1) Gestire il salvataggio e il recupero dei dati da file.
    // 2) Rendere la classe Pilota un Thread.
}
