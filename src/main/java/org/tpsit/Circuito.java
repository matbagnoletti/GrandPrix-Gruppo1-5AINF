package org.tpsit;

/**
 * Classe che rappresenta un circuito della gara.
 */

public class Circuito {
    private String nome;
    private int lunghezza; //in metri
    private int numeroPitStop;
    private int numeroGiri;

    /**
     * Costruttore della classe Circuito.
     * @param nome nome del circuito
     * @param lunghezza lunghezza del circuito in metri
     * @param numeroPitStop numero di PitStop permessi del circuito
     * @param numeroGiri numero di giri del circuito
     */
    public Circuito(String nome, int lunghezza, int numeroPitStop, int numeroGiri) {
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.numeroPitStop = numeroPitStop;
        this.numeroGiri = numeroGiri;
    }

    /**
     * Metodo che restituisce il nome del circuito.
     * @return nome del circuito
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo che restituisce la lunghezza del circuito.
     * @return lunghezza del circuito
     */
    public int getLunghezza() {
        return lunghezza;
    }

    /**
     * Metodo che restituisce il numero di PitSto permessi del circuito.
     * @return numeroPitStop del circuito
     */
    public int getNumeroPitStop() {
        return numeroPitStop;
    }

    /**
     * Metodo che restituisce il numero di giri del circuito.
     * @return numero di giri del circuito
     */
    public int getNumeroGiri() {
        return numeroGiri;
    }

    /**
     * Metodo che restituisce una stringa che descrive il circuito.
     * @return stringa che descrive il circuito
     */
    @Override
    public String toString() {
        return "Circuito{" +
                "nome='" + nome + '\'' +
                ", lunghezza=" + lunghezza +
                ", numeroPitStop=" + numeroPitStop +
                ", numeroGiri=" + numeroGiri +
                '}';
    }
}
