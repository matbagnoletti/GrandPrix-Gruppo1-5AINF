package org.tpsit;

public class Pilota {
    private String nome;
    private String cognome;
    private String squadra;
    private int vittorie;
    private int gare_giocate;

    public Pilota(String nome, String cognome, String squadra, int vittorie, int gare_giocate) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadra = squadra;
        this.vittorie = vittorie;
        this.gare_giocate = gare_giocate;
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

    public int getGare_giocate() {
        return gare_giocate;
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

    public void setGare_giocate(int gare_giocate) {
        this.gare_giocate = gare_giocate;
    }
}
